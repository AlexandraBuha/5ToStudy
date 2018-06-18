package ro.t5tostudy.scoaladevalori.perepedenainte_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class SavedActivity extends AppCompatActivity {

    Button mProfileBtn;
    Button mSearchBtn;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        mProfileBtn = findViewById(R.id.profile_saved_btn);
        mSearchBtn = findViewById(R.id.search_saved_btn);
        mListView = findViewById(R.id.saved_saved_view);
    }
}
