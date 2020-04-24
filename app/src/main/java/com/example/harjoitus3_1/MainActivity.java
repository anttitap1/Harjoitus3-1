package com.example.harjoitus3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Counter counter; // edellisen tehtävän Counter.java -luokka

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.counter = new Counter(0, 100);

        updateUI();
    }

    // metodi jokaiselle napille, mukaanlukien radionapit
    public void buttonPressed(View v) {
        if (v == findViewById(R.id.btnPlus)) {
            this.counter.increment();
        } else if (v == findViewById(R.id.btnMinus)) {
            this.counter.decrement();
        } else if (v == findViewById(R.id.imageButton)) {
            this.counter.reset();
        }

        updateUI();
    }

    private void updateUI() {
        TextView tv = findViewById(R.id.textView);

        RadioGroup radioGrp = findViewById(R.id.radioGroup);
        int selectedRadioBtnId = radioGrp.getCheckedRadioButtonId();

        if (findViewById(selectedRadioBtnId) == findViewById(R.id.radioButton1)) {
            tv.setText(Integer.toString(counter.getCountValue()));
        } else {
            tv.setText(Integer.toHexString(counter.getCountValue()));
        }
    }
}
