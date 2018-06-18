package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserSignInActivity extends AppCompatActivity {

    public static UserPackage user;
    EditText mEmail;
    EditText mPassword;
    Button mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_in);

        mEmail = findViewById(R.id.email_user_sign_in_et);
        mPassword = findViewById(R.id.password_user_sign_in_et);
        mLoginBtn = findViewById(R.id.login_user_sign_in_btn);
        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEmail.getText().toString().trim().equals("")||
                        mPassword.getText().toString().trim().equals("")){
                    Toast.makeText(UserSignInActivity.this, "Toate câmpurile sunt obligatorii", Toast.LENGTH_LONG).show();
                }
                else{
                    for(UserPackage userPackage : LoginActivity.userList){
                        if(mEmail.getText().toString().equals(userPackage.getEmail())){
                            if(mPassword.getText().toString().equals(userPackage.getPassword())){
                                user = userPackage;
                                Intent intent = new Intent(UserSignInActivity.this, ProfileActivity.class);
                                intent.putExtra("userPackage", user);
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(UserSignInActivity.this, "Parolă invalidă", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(UserSignInActivity.this, "Cont inexistent", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        });
    }
}
