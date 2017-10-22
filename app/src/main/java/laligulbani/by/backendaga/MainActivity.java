package laligulbani.by.backendaga;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements LoginLoader.ResultListener {

    private Button loginButton;
    private EditText loginInput;
    private EditText passwordInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginInput = ((EditText) findViewById(R.id.loginEditText));
        passwordInput = ((EditText) findViewById(R.id.passwordEditText));
        loginButton =  ((Button) findViewById(R.id.log));

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginLoader.start(loginInput.getText().toString(), passwordInput.getText().toString(), MainActivity.this);
            }
        });
    }

    @Override
    public void onResult(String result) {
        new AlertDialog.Builder(this).setMessage(result).create().show();
    }
}
