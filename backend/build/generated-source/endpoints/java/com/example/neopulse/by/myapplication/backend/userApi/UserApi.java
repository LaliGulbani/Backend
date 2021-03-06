/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-09-26 19:19:48 UTC)
 * on 2017-10-22 at 20:08:40 UTC 
 * Modify at your own risk.
 */

package com.example.neopulse.by.myapplication.backend.userApi;

/**
 * Service definition for UserApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UserApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class UserApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.23.0 of the userApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "userApi/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public UserApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  UserApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "get".
   *
   * This request holds the parameters needed by the userApi server.  After setting any optional
   * parameters, call the {@link Get#execute()} method to invoke the remote operation.
   *
   * @param login
   * @return the request
   */
  public Get get(java.lang.String login) throws java.io.IOException {
    Get result = new Get(login);
    initialize(result);
    return result;
  }

  public class Get extends UserApiRequest<com.example.neopulse.by.myapplication.backend.userApi.model.User> {

    private static final String REST_PATH = "user/{login}";

    /**
     * Create a request for the method "get".
     *
     * This request holds the parameters needed by the the userApi server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
     * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param login
     * @since 1.13
     */
    protected Get(java.lang.String login) {
      super(UserApi.this, "GET", REST_PATH, null, com.example.neopulse.by.myapplication.backend.userApi.model.User.class);
      this.login = com.google.api.client.util.Preconditions.checkNotNull(login, "Required parameter login must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Get setAlt(java.lang.String alt) {
      return (Get) super.setAlt(alt);
    }

    @Override
    public Get setFields(java.lang.String fields) {
      return (Get) super.setFields(fields);
    }

    @Override
    public Get setKey(java.lang.String key) {
      return (Get) super.setKey(key);
    }

    @Override
    public Get setOauthToken(java.lang.String oauthToken) {
      return (Get) super.setOauthToken(oauthToken);
    }

    @Override
    public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Get) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Get setQuotaUser(java.lang.String quotaUser) {
      return (Get) super.setQuotaUser(quotaUser);
    }

    @Override
    public Get setUserIp(java.lang.String userIp) {
      return (Get) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String login;

    /**

     */
    public java.lang.String getLogin() {
      return login;
    }

    public Get setLogin(java.lang.String login) {
      this.login = login;
      return this;
    }

    @Override
    public Get set(String parameterName, Object value) {
      return (Get) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insert".
   *
   * This request holds the parameters needed by the userApi server.  After setting any optional
   * parameters, call the {@link Insert#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.neopulse.by.myapplication.backend.userApi.model.User}
   * @return the request
   */
  public Insert insert(com.example.neopulse.by.myapplication.backend.userApi.model.User content) throws java.io.IOException {
    Insert result = new Insert(content);
    initialize(result);
    return result;
  }

  public class Insert extends UserApiRequest<com.example.neopulse.by.myapplication.backend.userApi.model.User> {

    private static final String REST_PATH = "user";

    /**
     * Create a request for the method "insert".
     *
     * This request holds the parameters needed by the the userApi server.  After setting any optional
     * parameters, call the {@link Insert#execute()} method to invoke the remote operation. <p> {@link
     * Insert#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.neopulse.by.myapplication.backend.userApi.model.User}
     * @since 1.13
     */
    protected Insert(com.example.neopulse.by.myapplication.backend.userApi.model.User content) {
      super(UserApi.this, "POST", REST_PATH, content, com.example.neopulse.by.myapplication.backend.userApi.model.User.class);
    }

    @Override
    public Insert setAlt(java.lang.String alt) {
      return (Insert) super.setAlt(alt);
    }

    @Override
    public Insert setFields(java.lang.String fields) {
      return (Insert) super.setFields(fields);
    }

    @Override
    public Insert setKey(java.lang.String key) {
      return (Insert) super.setKey(key);
    }

    @Override
    public Insert setOauthToken(java.lang.String oauthToken) {
      return (Insert) super.setOauthToken(oauthToken);
    }

    @Override
    public Insert setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Insert) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Insert setQuotaUser(java.lang.String quotaUser) {
      return (Insert) super.setQuotaUser(quotaUser);
    }

    @Override
    public Insert setUserIp(java.lang.String userIp) {
      return (Insert) super.setUserIp(userIp);
    }

    @Override
    public Insert set(String parameterName, Object value) {
      return (Insert) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "list".
   *
   * This request holds the parameters needed by the userApi server.  After setting any optional
   * parameters, call the {@link List#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public List list() throws java.io.IOException {
    List result = new List();
    initialize(result);
    return result;
  }

  public class List extends UserApiRequest<com.example.neopulse.by.myapplication.backend.userApi.model.CollectionResponseUser> {

    private static final String REST_PATH = "user";

    /**
     * Create a request for the method "list".
     *
     * This request holds the parameters needed by the the userApi server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
     * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected List() {
      super(UserApi.this, "GET", REST_PATH, null, com.example.neopulse.by.myapplication.backend.userApi.model.CollectionResponseUser.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public List setAlt(java.lang.String alt) {
      return (List) super.setAlt(alt);
    }

    @Override
    public List setFields(java.lang.String fields) {
      return (List) super.setFields(fields);
    }

    @Override
    public List setKey(java.lang.String key) {
      return (List) super.setKey(key);
    }

    @Override
    public List setOauthToken(java.lang.String oauthToken) {
      return (List) super.setOauthToken(oauthToken);
    }

    @Override
    public List setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (List) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public List setQuotaUser(java.lang.String quotaUser) {
      return (List) super.setQuotaUser(quotaUser);
    }

    @Override
    public List setUserIp(java.lang.String userIp) {
      return (List) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public List setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public List setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public List set(String parameterName, Object value) {
      return (List) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "login".
   *
   * This request holds the parameters needed by the userApi server.  After setting any optional
   * parameters, call the {@link Login#execute()} method to invoke the remote operation.
   *
   * @param login
   * @param password
   * @return the request
   */
  public Login login(java.lang.String login, java.lang.String password) throws java.io.IOException {
    Login result = new Login(login, password);
    initialize(result);
    return result;
  }

  public class Login extends UserApiRequest<com.example.neopulse.by.myapplication.backend.userApi.model.User> {

    private static final String REST_PATH = "login";

    /**
     * Create a request for the method "login".
     *
     * This request holds the parameters needed by the the userApi server.  After setting any optional
     * parameters, call the {@link Login#execute()} method to invoke the remote operation. <p> {@link
     * Login#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param login
     * @param password
     * @since 1.13
     */
    protected Login(java.lang.String login, java.lang.String password) {
      super(UserApi.this, "GET", REST_PATH, null, com.example.neopulse.by.myapplication.backend.userApi.model.User.class);
      this.login = com.google.api.client.util.Preconditions.checkNotNull(login, "Required parameter login must be specified.");
      this.password = com.google.api.client.util.Preconditions.checkNotNull(password, "Required parameter password must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Login setAlt(java.lang.String alt) {
      return (Login) super.setAlt(alt);
    }

    @Override
    public Login setFields(java.lang.String fields) {
      return (Login) super.setFields(fields);
    }

    @Override
    public Login setKey(java.lang.String key) {
      return (Login) super.setKey(key);
    }

    @Override
    public Login setOauthToken(java.lang.String oauthToken) {
      return (Login) super.setOauthToken(oauthToken);
    }

    @Override
    public Login setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Login) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Login setQuotaUser(java.lang.String quotaUser) {
      return (Login) super.setQuotaUser(quotaUser);
    }

    @Override
    public Login setUserIp(java.lang.String userIp) {
      return (Login) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String login;

    /**

     */
    public java.lang.String getLogin() {
      return login;
    }

    public Login setLogin(java.lang.String login) {
      this.login = login;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String password;

    /**

     */
    public java.lang.String getPassword() {
      return password;
    }

    public Login setPassword(java.lang.String password) {
      this.password = password;
      return this;
    }

    @Override
    public Login set(String parameterName, Object value) {
      return (Login) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "patch".
   *
   * This request holds the parameters needed by the userApi server.  After setting any optional
   * parameters, call the {@link Patch#execute()} method to invoke the remote operation.
   *
   * @param login
   * @param content the {@link com.example.neopulse.by.myapplication.backend.userApi.model.User}
   * @return the request
   */
  public Patch patch(java.lang.String login, com.example.neopulse.by.myapplication.backend.userApi.model.User content) throws java.io.IOException {
    Patch result = new Patch(login, content);
    initialize(result);
    return result;
  }

  public class Patch extends UserApiRequest<com.example.neopulse.by.myapplication.backend.userApi.model.User> {

    private static final String REST_PATH = "user/{login}";

    /**
     * Create a request for the method "patch".
     *
     * This request holds the parameters needed by the the userApi server.  After setting any optional
     * parameters, call the {@link Patch#execute()} method to invoke the remote operation. <p> {@link
     * Patch#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param login
     * @param content the {@link com.example.neopulse.by.myapplication.backend.userApi.model.User}
     * @since 1.13
     */
    protected Patch(java.lang.String login, com.example.neopulse.by.myapplication.backend.userApi.model.User content) {
      super(UserApi.this, "PATCH", REST_PATH, content, com.example.neopulse.by.myapplication.backend.userApi.model.User.class);
      this.login = com.google.api.client.util.Preconditions.checkNotNull(login, "Required parameter login must be specified.");
    }

    @Override
    public Patch setAlt(java.lang.String alt) {
      return (Patch) super.setAlt(alt);
    }

    @Override
    public Patch setFields(java.lang.String fields) {
      return (Patch) super.setFields(fields);
    }

    @Override
    public Patch setKey(java.lang.String key) {
      return (Patch) super.setKey(key);
    }

    @Override
    public Patch setOauthToken(java.lang.String oauthToken) {
      return (Patch) super.setOauthToken(oauthToken);
    }

    @Override
    public Patch setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Patch) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Patch setQuotaUser(java.lang.String quotaUser) {
      return (Patch) super.setQuotaUser(quotaUser);
    }

    @Override
    public Patch setUserIp(java.lang.String userIp) {
      return (Patch) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String login;

    /**

     */
    public java.lang.String getLogin() {
      return login;
    }

    public Patch setLogin(java.lang.String login) {
      this.login = login;
      return this;
    }

    @Override
    public Patch set(String parameterName, Object value) {
      return (Patch) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "remove".
   *
   * This request holds the parameters needed by the userApi server.  After setting any optional
   * parameters, call the {@link Remove#execute()} method to invoke the remote operation.
   *
   * @param login
   * @return the request
   */
  public Remove remove(java.lang.String login) throws java.io.IOException {
    Remove result = new Remove(login);
    initialize(result);
    return result;
  }

  public class Remove extends UserApiRequest<Void> {

    private static final String REST_PATH = "user/{login}";

    /**
     * Create a request for the method "remove".
     *
     * This request holds the parameters needed by the the userApi server.  After setting any optional
     * parameters, call the {@link Remove#execute()} method to invoke the remote operation. <p> {@link
     * Remove#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param login
     * @since 1.13
     */
    protected Remove(java.lang.String login) {
      super(UserApi.this, "DELETE", REST_PATH, null, Void.class);
      this.login = com.google.api.client.util.Preconditions.checkNotNull(login, "Required parameter login must be specified.");
    }

    @Override
    public Remove setAlt(java.lang.String alt) {
      return (Remove) super.setAlt(alt);
    }

    @Override
    public Remove setFields(java.lang.String fields) {
      return (Remove) super.setFields(fields);
    }

    @Override
    public Remove setKey(java.lang.String key) {
      return (Remove) super.setKey(key);
    }

    @Override
    public Remove setOauthToken(java.lang.String oauthToken) {
      return (Remove) super.setOauthToken(oauthToken);
    }

    @Override
    public Remove setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Remove) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Remove setQuotaUser(java.lang.String quotaUser) {
      return (Remove) super.setQuotaUser(quotaUser);
    }

    @Override
    public Remove setUserIp(java.lang.String userIp) {
      return (Remove) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String login;

    /**

     */
    public java.lang.String getLogin() {
      return login;
    }

    public Remove setLogin(java.lang.String login) {
      this.login = login;
      return this;
    }

    @Override
    public Remove set(String parameterName, Object value) {
      return (Remove) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "update".
   *
   * This request holds the parameters needed by the userApi server.  After setting any optional
   * parameters, call the {@link Update#execute()} method to invoke the remote operation.
   *
   * @param login
   * @param content the {@link com.example.neopulse.by.myapplication.backend.userApi.model.User}
   * @return the request
   */
  public Update update(java.lang.String login, com.example.neopulse.by.myapplication.backend.userApi.model.User content) throws java.io.IOException {
    Update result = new Update(login, content);
    initialize(result);
    return result;
  }

  public class Update extends UserApiRequest<com.example.neopulse.by.myapplication.backend.userApi.model.User> {

    private static final String REST_PATH = "user/{login}";

    /**
     * Create a request for the method "update".
     *
     * This request holds the parameters needed by the the userApi server.  After setting any optional
     * parameters, call the {@link Update#execute()} method to invoke the remote operation. <p> {@link
     * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param login
     * @param content the {@link com.example.neopulse.by.myapplication.backend.userApi.model.User}
     * @since 1.13
     */
    protected Update(java.lang.String login, com.example.neopulse.by.myapplication.backend.userApi.model.User content) {
      super(UserApi.this, "PUT", REST_PATH, content, com.example.neopulse.by.myapplication.backend.userApi.model.User.class);
      this.login = com.google.api.client.util.Preconditions.checkNotNull(login, "Required parameter login must be specified.");
    }

    @Override
    public Update setAlt(java.lang.String alt) {
      return (Update) super.setAlt(alt);
    }

    @Override
    public Update setFields(java.lang.String fields) {
      return (Update) super.setFields(fields);
    }

    @Override
    public Update setKey(java.lang.String key) {
      return (Update) super.setKey(key);
    }

    @Override
    public Update setOauthToken(java.lang.String oauthToken) {
      return (Update) super.setOauthToken(oauthToken);
    }

    @Override
    public Update setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Update) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Update setQuotaUser(java.lang.String quotaUser) {
      return (Update) super.setQuotaUser(quotaUser);
    }

    @Override
    public Update setUserIp(java.lang.String userIp) {
      return (Update) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String login;

    /**

     */
    public java.lang.String getLogin() {
      return login;
    }

    public Update setLogin(java.lang.String login) {
      this.login = login;
      return this;
    }

    @Override
    public Update set(String parameterName, Object value) {
      return (Update) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link UserApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link UserApi}. */
    @Override
    public UserApi build() {
      return new UserApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UserApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUserApiRequestInitializer(
        UserApiRequestInitializer userapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(userapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
