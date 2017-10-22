package laligulbani.by.backendaga;


public class Api {
    private static final String URL_FORMAT = "http://10.0.3.2:8080/_ah/api/userApi/v1/login?login=%s&password=%s";

    public static String getLoginUrl(String login, String password) {
        return String.format(URL_FORMAT, login, password);
    }
}
