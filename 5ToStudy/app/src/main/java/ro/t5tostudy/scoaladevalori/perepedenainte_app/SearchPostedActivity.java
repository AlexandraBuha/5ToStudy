package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class SearchPostedActivity extends AppCompatActivity {

    Button mProfileBtn;
    Button mSearchBtn;
    ToggleButton mTesttezaTgl;
    EditText mSubject;
    EditText mGrade;
    EditText mProfile;
    EditText mChapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_posted);

        mProfileBtn = findViewById(R.id.profile_search_posted_btn);
        mSearchBtn = findViewById(R.id.search_search_posted_btn);
        mTesttezaTgl = findViewById(R.id.testteza_search_posted_tgl);
        mSubject = findViewById(R.id.subject_search_posted_et);
        mGrade = findViewById(R.id.grade_search_posted_et);
        mProfile = findViewById(R.id.profile_search_posted_et);
        mChapter = findViewById(R.id.chapter_search_posted_et);
    }
}
