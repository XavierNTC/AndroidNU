package com.teste.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TransferenciaActivity extends AppCompatActivity {

    private TextView textView14;
    private int numeroAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transferencia);

        textView14 = findViewById(R.id.textView14);
        FloatingActionButton fabMais = findViewById(R.id.floatingActionButton);
        FloatingActionButton fabMenos = findViewById(R.id.floatingActionButton2);


        numeroAtual = getIntent().getIntExtra("valor", 0);
        atualizarTexto();

        fabMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroAtual++;
                atualizarTexto();
            }
        });

        fabMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroAtual--;
                atualizarTexto();
            }
        });

        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransferenciaActivity.this, MainActivity.class);
                intent.putExtra("valor", numeroAtual);
                startActivity(intent);
                finish();
            }
        });
    }

    private void atualizarTexto() {
        textView14.setText(String.valueOf(numeroAtual));
    }
}
