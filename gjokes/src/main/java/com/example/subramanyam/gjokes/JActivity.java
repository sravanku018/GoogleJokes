package com.example.subramanyam.gjokes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class JActivity extends AppCompatActivity {
public static final String TAG=JActivity.class.getSimpleName();
public static final String JOKE_KEY="joke";
public static final String JOKE_FRAGMENT_TAG="JTAG";
private Toolbar mToolbar;
private String mJoke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j);
        mToolbar=findViewById(R.id.toolbar);

        if(getIntent().getExtras() != null)
        {
            mJoke =getIntent().getStringExtra(JActivity.JOKE_KEY);
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public String getmJokeFromIntent() {
        return mJoke;
    }

}
