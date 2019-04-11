package sber.practice.serzhan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends AppCompatActivity {


    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initViews();
        initListeners();
    }

    private void initViews() {
        backBtn = findViewById(R.id.infoBackBtn);
    }

    private void initListeners() {
        backBtn.setOnClickListener(new ButtonClickListener());
    }

    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            startActivity(MainActivity.newIntent(InfoActivity.this));
        }
    }

    public static final Intent newIntent(Context context) {
        Intent intent = new Intent(context, InfoActivity.class);
        return intent;
    }
}
