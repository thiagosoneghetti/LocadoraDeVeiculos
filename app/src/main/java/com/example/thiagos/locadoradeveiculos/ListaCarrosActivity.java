package com.example.thiagos.locadoradeveiculos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaCarrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_carros);

        String [] carros = {"Gol", "Uno", "Fiesta", "Fox", "Bmw"};
        ListView listaCarros = (ListView) findViewById(R.id.lista_carros);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carros);
        listaCarros.setAdapter(adapter);

        Button novoCarro = (Button) findViewById(R.id.novo_carro);
        novoCarro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProFormulario = new Intent(ListaCarrosActivity.this, FormularioCarrosActivity.class);
                finish();
                startActivity(intentVaiProFormulario);
            }
        });
    }
}
