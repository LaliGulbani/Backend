package laligulbani.by.backendaga;


import android.os.AsyncTask;
import android.util.Log;

import com.example.neopulse.by.myapplication.backend.userApi.model.User;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import laligulbani.by.backendaga.http.HttpClient;

public class LoginLoader extends AsyncTask<String, Void, String> {
    private static final String TAG = "LoginLoader";
    private ResultListener listener;

    public interface ResultListener {
        void onResult(String result);
    }

    public static void start(String login, String password, ResultListener listener) {
        new LoginLoader(listener).execute(login, password);
    }

    public LoginLoader(ResultListener listener) {
        this.listener = listener;
    }

    @Override
    protected String doInBackground(String... params) {

        HttpClient httpClient = new HttpClient();

        InputStream inputStream = null;
        try {
            inputStream = httpClient.request(Api.getLoginUrl(params[0], params[1]));
            final User user = new Gson().fromJson(new InputStreamReader(inputStream), User.class);
            return "Success for " + user.getLogin();
        } catch (IOException e) {
            Log.e(TAG, "doInBackground: ", e);
            return e.getMessage();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected void onPostExecute(String s) {
        if (listener != null) {
            listener.onResult(s);
        }
    }
}
