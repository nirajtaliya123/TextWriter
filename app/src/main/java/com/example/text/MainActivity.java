package com.example.text;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.htextview_typer.TextWriter;

public class MainActivity extends AppCompatActivity {
    TextWriter textWriter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textWriter = findViewById(R.id.tw);

        textWriter.setColor(Color.BLACK)
                .setWidth(10)
                .setDelay(40)
                .setSizeFactor(20f)
                .setLetterSpacing(30f)
                .setConfig(TextWriter.Configuration.INTERMEDIATE)
                .setText("MAKE CODING")
                .setListener(new TextWriter.Listener() {
                    @Override
                    public void WritingFinished() {

                        textWriter.setColor(Color.RED);
                        textWriter.setWidth(10);
                        //Toast.makeText(MainActivity.this, "boom", Toast.LENGTH_SHORT).show();
                    }
                })
                .startAnimation();
    }

}
