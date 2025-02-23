package com.oakil.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
        {

    EditText editText;
    Button button;
    TextView result;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(v -> {
            StringBuffer buffer = new StringBuffer();

            String userInputForMultiplicationTable = editText.getText().toString();
            int parseIntUserInputForMultiplicationTable = Integer.parseInt(userInputForMultiplicationTable);

            for(int i = 1; i<=10; i++){
                ans = (i * parseIntUserInputForMultiplicationTable);
                buffer.append(parseIntUserInputForMultiplicationTable + " X " + i + " = " + ans + "\n");
            }
            result.setText(buffer);

        });

    }

}