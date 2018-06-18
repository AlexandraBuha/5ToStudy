package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class PostActivity extends AppCompatActivity {

    Button mProfileBtn;
    Button mPostBtn;
    ToggleButton mTesttezaBtn;
    EditText mSubject;
    EditText mGrade;
    EditText mProfile;
    EditText mChapter;
    EditText mTitle;
    EditText mDescription;
    EditText mTestText;
    EditText mAnswerText;
    EditText mTheoryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        mProfileBtn = findViewById(R.id.profile_post_btn);
        mPostBtn = findViewById(R.id.post_post_btn);
        mTesttezaBtn = findViewById(R.id.testteza_post_tgl);
        mSubject = findViewById(R.id.subject_post_et);
        mGrade = findViewById(R.id.grade_post_et);
        mProfile = findViewById(R.id.profile_post_et);
        mChapter = findViewById(R.id.chapter_post_et);
        mTitle = findViewById(R.id.title_post_et);
        mDescription = findViewById(R.id.description_post_et);
        mTestText = findViewById(R.id.test_post_et);
        mAnswerText = findViewById(R.id.answer_post_et);
        mTheoryText = findViewById(R.id.theory_post_et);
    }

}