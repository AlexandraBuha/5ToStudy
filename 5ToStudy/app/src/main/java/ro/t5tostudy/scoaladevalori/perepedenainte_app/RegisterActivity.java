package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText mEmail;
    EditText mUsername;
    EditText mPassword;
    EditText mPasswordCheck;
    Button mRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mEmail = findViewById(R.id.email_register_et);
        mUsername = findViewById(R.id.username_register_et);
        mPassword = findViewById(R.id.new_password_register_et);
        mPasswordCheck = findViewById(R.id.check_new_password_register_et);
        mRegisterBtn = findViewById(R.id.register_register_btn);

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mEmail.getText().toString().trim().equals("")||
                        mUsername.getText().toString().trim().equals("")||
                        mPassword.getText().toString().trim().equals("")||
                        mPasswordCheck.getText().toString().trim().equals("")){
                    Toast.makeText(RegisterActivity.this, "Toate câmpurile sunt obligatorii", Toast.LENGTH_LONG).show();
                }
                else{
                    if(mPassword.getText().toString().equals(mPasswordCheck.getText().toString())) {
                        UserPackage user = new UserPackage(mEmail.getText().toString(), mUsername.getText().toString(), mPassword.getText().toString());
                        LoginActivity.userList.add(user);
                        Intent intent = new Intent();
                        setResult(RESULT_OK, intent);
                        finish();
                    }
                    else{
                        Toast.makeText(RegisterActivity.this, "Parolele nu corespund", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
