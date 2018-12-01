package com.example.samue.dbschenkerchallenge2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText _emailText;
    EditText _passwordText;
    Button _loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _emailText = (EditText) findViewById(R.id.input_email);
        _passwordText = (EditText) findViewById(R.id.input_password);

        _loginButton = (Button) findViewById(R.id.btn_login);
        _loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login(){
        String email = _emailText.getText().toString();
        String password = _passwordText.getText().toString();

        if(email.equals("driver") && password.equals("driver")){
            Intent intent = new Intent(getApplicationContext(), DriverActivity.class);
            startActivity(intent);

        }else{
            Toast.makeText(getApplicationContext(),
                    "Incorrect username and password!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
