package ExTim.app.evoting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class DashboardActivity extends AppCompatActivity {
    private RelativeLayout view1,view2,view3,view4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        view1 = findViewById(R.id.card1);
        view2 = findViewById(R.id.card2);
        view3 = findViewById(R.id.card3);
        view4 = findViewById(R.id.card4);

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, VoteActivity.class);
                startActivity(intent);
            }
        });

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, MenuViewActivity.class);
                startActivity(intent);
            }
        });

        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, ProfileUser_Activity.class);
                startActivity(intent);
            }
        });

        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, hasilActivity.class);
                startActivity(intent);
            }
        });
    }

}