package com.ycw.blu.loops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number;
    String multiplicationResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView result = findViewById(R.id.result);
//        result.setText("");
//        int counter = 1;
//        while (counter <= 10) {
////            Log.i("MyTag", "No "+counter);
//            result.append("Number "+counter+"\n");
//            counter++;
//        }

//        TextView result = findViewById(R.id.result);
//        result.setText("");
//        for (int counter = 0; counter < 20; counter++) {
//            result.append("Number "+counter+"\nxxx");
//        }
        result = findViewById(R.id.result);
        number = findViewById(R.id.edtnumber);
    }

    public void generateMultiplication (View buttonView) {
        int enteredNumber = Integer.parseInt(number.getText().toString());
        multiplicationResult = "";
        for (int i = 1; i <= 12; i++) {
            multiplicationResult = multiplicationResult + enteredNumber + " * " + i + " = "+ (enteredNumber * i) + "\n";
        }
        result.setText("222");
    }
}
