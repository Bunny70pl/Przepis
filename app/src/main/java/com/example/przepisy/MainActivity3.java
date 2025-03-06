package com.example.przepisy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    private TextView textView;
    private ArrayList<Przepis> przepisy2;
    private ImageView imageView;
    private TextView polubienia;
    private TextView opis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView = findViewById(R.id.textViewNazwaPrzepisu);
        Repozytorium repozytorium = new Repozytorium();
        String nazwa =  getIntent().getExtras().getString(MainActivity2.NAZWAPRZEPISEK).toString();
        przepisy2 = repozytorium.wypiszPrzepisyNazwa(nazwa);
        textView.setText(nazwa);
        opis = findViewById(R.id.textView3);
        polubienia = findViewById(R.id.textViewPolubienia);
        imageView = findViewById(R.id.imageView2);
        opis.setText(przepisy2.get(0).getSkladniki());
        polubienia.setText(przepisy2.get(0).getPolubienia());
    }
}