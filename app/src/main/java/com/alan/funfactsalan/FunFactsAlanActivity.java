package com.alan.funfactsalan;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class FunFactsAlanActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    //Declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private Colors colors = new Colors();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_alan);
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Update the screen with our new fact
                String fact = factBook.getFact();
                factTextView.setText(fact);
                String color = colors.getColor();
                relativeLayout.setBackgroundColor(Color.parseColor(color));
            }

        };
        showFactButton.setOnClickListener(listener);
    }
}
