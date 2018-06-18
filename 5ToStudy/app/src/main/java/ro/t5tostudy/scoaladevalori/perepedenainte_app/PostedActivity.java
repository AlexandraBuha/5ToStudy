package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class PostedActivity extends AppCompatActivity {

    Button mProfileBtn;
    Button mSearchBtn;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posted);

        mProfileBtn = findViewById(R.id.profile_posted_btn);
        mSearchBtn = findViewById(R.id.search_posted_btn);
        mListView = findViewById(R.id.posted_list_view);
    }

}
