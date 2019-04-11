package sber.practice.serzhan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    private Button nextBtn;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initViews();
        initListeners();
    }

    private void initViews() {
        nextBtn = findViewById(R.id.detailsNextBtn);
        backBtn = findViewById(R.id.detailsBackBtn);
    }

    private void initListeners() {
        nextBtn.setOnClickListener(new ButtonClickListener());
        backBtn.setOnClickListener((v) -> finish());
    }

    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            startActivity(InfoActivity.newIntent(DetailsActivity.this));
        }
    }

    public static final Intent newIntent(Context context) {
        Intent intent = new Intent(context, DetailsActivity.class);
        return intent;
    }
}
