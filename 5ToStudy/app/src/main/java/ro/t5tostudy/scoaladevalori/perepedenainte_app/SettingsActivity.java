package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    TextView mUsernameView;
    EditText mNewUsername;
    EditText mNewPassword;
    EditText mCheckNewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mUsernameView = findViewById(R.id.username_settings_tv);
        mNewUsername = findViewById(R.id.new_name_settings_et);
        mNewPassword = findViewById(R.id.new_password_settings_et);
        mCheckNewPassword = findViewById(R.id.check_new_password_settings_et);
    }
}
