package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    public static List<TestPackage> testList = null;
    public static List<UserPackage> userList = null;
    Button mLoginBtn;
    Button mRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginBtn = findViewById(R.id.login_login_btn);
        mRegisterBtn = findViewById(R.id.register_login_btn);
    }

    public void openUserSignInActivity (View v) {
        startActivity(new Intent(LoginActivity.this, UserSignInActivity.class));
    }

    public void openRegisterActivity (View v) {
        startActivityForResult(new Intent(LoginActivity.this, RegisterActivity.class), -1);
    }
}
