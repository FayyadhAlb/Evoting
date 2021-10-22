package ExTim.app.evoting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import ExTim.app.evoting.MainActivity;
import ExTim.app.evoting.R;

public class SpalshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);

        // create splash activity

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent panggil = new Intent(SpalshActivity.this, MainActivity.class);
                startActivity(panggil);
                finish();
            }
        },5000);
    }
}