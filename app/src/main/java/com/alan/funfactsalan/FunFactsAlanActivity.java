package com.alan.funfactsalan;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsAlanActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    //Declare our view variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_alan);
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Update the screen with our new fact
                String fact = factBook.getFact();
                factTextView.setText(fact);
            }

        };
        showFactButton.setOnClickListener(listener);
    }
}
