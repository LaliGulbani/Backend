package laligulbani.by.backendaga.http;


import android.support.annotation.VisibleForTesting;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {

    private HttpURLConnection con;


    public InputStream request(final String url) throws IOException {
        return openStream(url);
    }

    @VisibleForTesting
    InputStream openStream(final String url) throws IOException {
        con = (HttpURLConnection) (new URL(url)).openConnection();
        return con.getInputStream();
    }

}