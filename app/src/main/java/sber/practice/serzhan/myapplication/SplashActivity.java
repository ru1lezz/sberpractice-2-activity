package sber.practice.serzhan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {

    private Button nextBtn;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();
        initListeners();
    }

    private void initViews() {
        nextBtn = findViewById(R.id.splashNextBtn);
        backBtn = findViewById(R.id.splashBackBtn);
    }

    private void initListeners() {
        nextBtn.setOnClickListener(new ButtonClickListener());
        backBtn.setOnClickListener((v) -> finish());
    }

    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            startActivity(DetailsActivity.newIntent(SplashActivity.this));
        }
    }

    public static final Intent newIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }
}
