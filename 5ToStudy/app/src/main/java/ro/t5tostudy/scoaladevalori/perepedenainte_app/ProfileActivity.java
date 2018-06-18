package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView mUsername;
    ImageView mProfilePicture;
    Button mSearchBtn;
    Button mTestsBtn;
    Button mPostBtn;
    Button mPostedBtn;
    Button mSavedBtn;
    Button mSettingsBtn;
    UserPackage userPackage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mUsername = findViewById(R.id.username_profile_tv);
        mProfilePicture = findViewById(R.id.profile_imgv);
        mSearchBtn = findViewById(R.id.search_profile_btn);
        mTestsBtn = findViewById(R.id.tests_profile_btn);
        mPostBtn = findViewById(R.id.post_profile_btn);
        mPostedBtn = findViewById(R.id.posted_profile_btn);
        mSavedBtn = findViewById(R.id.saved_profile_btn);
        mSettingsBtn = findViewById(R.id.settings_profile_btn);
        userPackage = UserSignInActivity.user;

        mSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SearchActivity.class);
                intent.putExtra("userPackage", userPackage);
                startActivityForResult(intent, -1);
            }
        });

        mPostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, PostActivity.class);
                intent.putExtra("userPackage", userPackage);
                startActivityForResult(intent, -1);
            }
        });

        mPostedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, PostedActivity.class);
                intent.putExtra("userPackage", userPackage);
                startActivityForResult(intent, -1);
            }
        });


        mSavedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SavedActivity.class);
                intent.putExtra("userPackage", userPackage);
                startActivityForResult(intent, -1);
            }
        });

        mSettingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SettingsActivity.class);
                intent.putExtra("userPackage", userPackage);
                startActivityForResult(intent, -1);
            }
        });
    }
}
