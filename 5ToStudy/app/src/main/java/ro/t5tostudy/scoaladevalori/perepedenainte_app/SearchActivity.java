package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class SearchActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_search);

        mProfileBtn = findViewById(R.id.profile_search_btn);
        mSearchBtn = findViewById(R.id.search_search_btn);
        mTesttezaTgl = findViewById(R.id.testteza_search_tgl);
        mSubject = findViewById(R.id.subject_search_et);
        mGrade = findViewById(R.id.grade_search_et);
        mProfile = findViewById(R.id.profile_search_et);
        mChapter = findViewById(R.id.chapter_search_et);
    }

    public void openProfileActivity(View v){
        setResult(RESULT_OK);
        finish();

    }

    @SuppressLint("RestrictedApi")
    public void openListActivity (View v) {

        SearchParametersPackage parameters = new SearchParametersPackage();
        parameters.subject = mSubject.getText().toString();
        parameters.testteza = mTesttezaTgl.getText().toString();
        parameters.grade = mGrade.getText().toString();
        parameters.profil = mProfile.getText().toString();
        parameters.chapter = mChapter.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("subject", parameters.subject);
        bundle.putString("testteza", parameters.testteza);
        bundle.putString("grade", parameters.grade);
        bundle.putString("profil", parameters.profil);
        bundle.putString("chapter", parameters.chapter);
        Intent intentList = new Intent(SearchActivity.this, ListActivity.class);
        startActivityForResult(intentList, 1, bundle);
    }
}
