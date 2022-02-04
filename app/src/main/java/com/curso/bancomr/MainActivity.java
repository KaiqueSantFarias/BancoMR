package com.curso.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgSaldo;
    private ImageView imgFaturas;
    private ImageView imgTransferencia;
    private ImageView imgPoupanca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFaturas =  findViewById(R.id.img_faturas);
        imgSaldo = findViewById(R.id.img_saldo);
        imgTransferencia = findViewById(R.id.img_transferencia);
        imgPoupanca = findViewById(R.id.img_poupanca);

                imgSaldo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent navegar_Saldo = new Intent(MainActivity.this, Saldo.class);
                        startActivity(navegar_Saldo);

                imgFaturas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent navegar_Faturas = new Intent(MainActivity.this, Faturas.class);
                        startActivity(navegar_Faturas);

                imgTransferencia.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent navegar_Transferencia = new Intent(MainActivity.this, Transferencia.class);
                        startActivity(navegar_Transferencia);

                imgPoupanca.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent navegar_Poupanca = new Intent(MainActivity.this, Poupanca.class);
                        startActivity(navegar_Poupanca);
                    }
                });
                    }
                });
                    }
                });
                    }});
    }
}
