package com.example.kalkulator2tb;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2, editText3;
    Button buttonLosuj, buttonMediana, buttonDominanta, buttonSuma, buttonMax, buttonMin, buttonsrednia;
    ListView listView;
    ArrayAdapter<Losowe> arrayAdapter;
    TextView textView;
    ArrayList<Integer> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editText3 = findViewById(R.id.editTextText3);
        buttonLosuj = findViewById(R.id.button);
        buttonMediana = findViewById(R.id.button2);
        buttonDominanta = findViewById(R.id.button3);
        buttonSuma = findViewById(R.id.button4);
        buttonMax = findViewById(R.id.button5);
        buttonMin = findViewById(R.id.button6);
        buttonsrednia = findViewById(R.id.button7);
        listView = findViewById(R.id.listView);
        textView = findViewById(R.id.textView3);
        arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                listView
        );
        listView.setAdapter(arrayAdapter);
    }
}