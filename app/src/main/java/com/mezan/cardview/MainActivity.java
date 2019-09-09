package com.mezan.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cv1,cv2,cv3,cv4,cv5,cv6;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv1=findViewById(R.id.card1);
        cv2=findViewById(R.id.card2);
        cv3=findViewById(R.id.card3);
        cv4=findViewById(R.id.card4);
        cv5=findViewById(R.id.card5);
        cv6=findViewById(R.id.card6);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);


        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cv1.setCardBackgroundColor(Color.rgb(255,0,0));
                cv2.setCardBackgroundColor(Color.rgb(255,255,255));
                cv3.setCardBackgroundColor(Color.rgb(255,255,255));
                cv4.setCardBackgroundColor(Color.rgb(255,255,255));
                cv5.setCardBackgroundColor(Color.rgb(255,255,255));
                cv6.setCardBackgroundColor(Color.rgb(255,255,255));
                tv1.setText("Clicked");
                tv2.setText("Card 2");
                tv3.setText("Card 3");
                tv4.setText("Card 4");
                tv5.setText("Card 5");
                tv6.setText("Card 6");

            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cv1.setCardBackgroundColor(Color.rgb(255,255,255));
                cv2.setCardBackgroundColor(Color.rgb(255,0,0));
                cv3.setCardBackgroundColor(Color.rgb(255,255,255));
                cv4.setCardBackgroundColor(Color.rgb(255,255,255));
                cv5.setCardBackgroundColor(Color.rgb(255,255,255));
                cv6.setCardBackgroundColor(Color.rgb(255,255,255));
                tv1.setText("Card 1");
                tv2.setText("Clicked");
                tv3.setText("Card 3");
                tv4.setText("Card 4");
                tv5.setText("Card 5");
                tv6.setText("Card 6");

            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cv1.setCardBackgroundColor(Color.rgb(255,255,255));
                cv2.setCardBackgroundColor(Color.rgb(255,255,255));
                cv3.setCardBackgroundColor(Color.rgb(255,0,0));
                cv4.setCardBackgroundColor(Color.rgb(255,255,255));
                cv5.setCardBackgroundColor(Color.rgb(255,255,255));
                cv6.setCardBackgroundColor(Color.rgb(255,255,255));
                tv1.setText("Card 1");
                tv2.setText("Card 2");
                tv3.setText("Clicked");
                tv4.setText("Card 4");
                tv5.setText("Card 5");
                tv6.setText("Card 6");

            }
        });
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cv1.setCardBackgroundColor(Color.rgb(255,255,255));
                cv2.setCardBackgroundColor(Color.rgb(255,255,255));
                cv3.setCardBackgroundColor(Color.rgb(255,255,255));
                cv4.setCardBackgroundColor(Color.rgb(255,0,0));
                cv5.setCardBackgroundColor(Color.rgb(255,255,255));
                cv6.setCardBackgroundColor(Color.rgb(255,255,255));
                tv1.setText("Card 1");
                tv2.setText("Card 2");
                tv3.setText("Card 3");
                tv4.setText("Clicked");
                tv5.setText("Card 5");
                tv6.setText("Card 6");

            }
        });
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cv1.setCardBackgroundColor(Color.rgb(255,255,255));
                cv2.setCardBackgroundColor(Color.rgb(255,255,255));
                cv3.setCardBackgroundColor(Color.rgb(255,255,255));
                cv4.setCardBackgroundColor(Color.rgb(255,255,255));
                cv5.setCardBackgroundColor(Color.rgb(255,0,0));
                cv6.setCardBackgroundColor(Color.rgb(255,255,255));
                tv1.setText("Card 1");
                tv2.setText("Card 2");
                tv3.setText("Card 3");
                tv4.setText("Card 4");
                tv5.setText("Clicked");
                tv6.setText("Card 6");

            }
        });
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cv1.setCardBackgroundColor(Color.rgb(255,255,255));
                cv2.setCardBackgroundColor(Color.rgb(255,255,255));
                cv3.setCardBackgroundColor(Color.rgb(255,255,255));
                cv4.setCardBackgroundColor(Color.rgb(255,255,255));
                cv5.setCardBackgroundColor(Color.rgb(255,255,255));
                cv6.setCardBackgroundColor(Color.rgb(255,0,0));
                tv1.setText("Card 1");
                tv2.setText("Card 2");
                tv3.setText("Card 3");
                tv4.setText("Card 4");
                tv5.setText("Card 5");
                tv6.setText("Clicked");

            }
        });

    }
}
