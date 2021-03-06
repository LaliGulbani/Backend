package com.example.NeoPulse.by.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.cmd.Query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.Nullable;
import javax.inject.Named;

import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 * WARNING: This generated code is intended as a sample or starting point for using a
 * Google Cloud Endpoints RESTful API with an Objectify entity. It provides no data access
 * restrictions and no data validation.
 * <p>
 * DO NOT deploy this code unchanged as part of a real application to real users.
 */
@Api(
        name = "userApi",
        version = "v1",
        resource = "user",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.by.NeoPulse.example.com",
                ownerName = "backend.myapplication.by.NeoPulse.example.com",
                packagePath = ""
        )
)
public class UserEndpoint {

    private static final Logger logger = Logger.getLogger(UserEndpoint.class.getName());

    private static final int DEFAULT_LIST_LIMIT = 20;

    private static final Map<String, String> USERS_MAP = new HashMap<>();

    static {
        // Typically you would register this inside an OfyServive wrapper. See: https://code.google.com/p/objectify-appengine/wiki/BestPractices
        ObjectifyService.register(User.class);

        USERS_MAP.put("user1", "pass1");
    }

    /**
     * Returns the {@link User} with the corresponding ID.
     *
     * @param login the ID of the entity to be retrieved
     * @return the entity with the corresponding ID
     * @throws NotFoundException if there is no {@code User} with the provided ID.
     */
    @ApiMethod(
            name = "get",
            path = "user/{login}",
            httpMethod = ApiMethod.HttpMethod.GET)
    public User get(@Named("login") String login) throws NotFoundException {
        logger.info("Getting User with ID: " + login);
        User user = ofy().load().type(User.class).id(login).now();
        if (user == null) {
            throw new NotFoundException("Could not find User with ID: " + login);
        }
        return user;
    }

    /**
     * Inserts a new {@code User}.
     */
    @ApiMethod(
            name = "insert",
            path = "user",
            httpMethod = ApiMethod.HttpMethod.POST)
    public User insert(User user) {
        // Typically in a RESTful API a POST does not have a known ID (assuming the ID is used in the resource path).
        // You should validate that user.login has not been set. If the ID type is not supported by the
        // Objectify ID generator, e.g. long or String, then you should generate the unique ID yourself prior to saving.
        //
        // If your client provides the ID then you should probably use PUT instead.
        ofy().save().entity(user).now();
        logger.info("Created User.");

        return ofy().load().entity(user).now();
    }

    /**
     * Updates an existing {@code User}.
     *
     * @param login the ID of the entity to be updated
     * @param user  the desired state of the entity
     * @return the updated version of the entity
     * @throws NotFoundException if the {@code login} does not correspond to an existing
     *                           {@code User}
     */
    @ApiMethod(
            name = "update",
            path = "user/{login}",
            httpMethod = ApiMethod.HttpMethod.PUT)
    public User update(@Named("login") String login, User user) throws NotFoundException {
        // TODO: You should validate your ID parameter against your resource's ID here.
        checkExists(login);
        ofy().save().entity(user).now();
        logger.info("Updated User: " + user);
        return ofy().load().entity(user).now();
    }

    /**
     * Deletes the specified {@code User}.
     *
     * @param login the ID of the entity to delete
     * @throws NotFoundException if the {@code login} does not correspond to an existing
     *                           {@code User}
     */
    @ApiMethod(
            name = "remove",
            path = "user/{login}",
            httpMethod = ApiMethod.HttpMethod.DELETE)
    public void remove(@Named("login") String login) throws NotFoundException {
        checkExists(login);
        ofy().delete().type(User.class).id(login).now();
        logger.info("Deleted User with ID: " + login);
    }

    /**
     * List all entities.
     *
     * @param cursor used for pagination to determine which page to return
     * @param limit  the maximum number of entries to return
     * @return a response that encapsulates the result list and the next page token/cursor
     */
    @ApiMethod(
            name = "list",
            path = "user",
            httpMethod = ApiMethod.HttpMethod.GET)
    public CollectionResponse<User> list(@Nullable @Named("cursor") String cursor, @Nullable @Named("limit") Integer limit) {
        limit = limit == null ? DEFAULT_LIST_LIMIT : limit;
        Query<User> query = ofy().load().type(User.class).limit(limit);
        if (cursor != null) {
            query = query.startAt(Cursor.fromWebSafeString(cursor));
        }
        QueryResultIterator<User> queryIterator = query.iterator();
        List<User> userList = new ArrayList<User>(limit);
        while (queryIterator.hasNext()) {
            userList.add(queryIterator.next());
        }
        return CollectionResponse.<User>builder().setItems(userList).setNextPageToken(queryIterator.getCursor().toWebSafeString()).build();
    }

    private void checkExists(String login) throws NotFoundException {
        try {
            ofy().load().type(User.class).id(login).safe();
        } catch (com.googlecode.objectify.NotFoundException e) {
            throw new NotFoundException("Could not find User with ID: " + login);
        }
    }
    @ApiMethod(
            name = "login",
            path = "login",
            httpMethod = ApiMethod.HttpMethod.GET)
    public User login(@Named("login") String login, @Named("password") String password) throws NotFoundException {
        for (String loginKey : USERS_MAP.keySet()) {
            if (loginKey.equals(login) && USERS_MAP.get(loginKey).equals(password)){
                final User user = new User();
                user.setLogin(login);
                user.setLogin(password);
                return user;
            }
        }
        throw new NotFoundException("Could not find User with ID: " + login);
    }
}