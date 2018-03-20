package com.example.thiagos.locadoradeveiculos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormularioCarrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_carros);

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Toast.makeText(FormularioCarrosActivity.this, "Carro Salvo" , Toast.LENGTH_SHORT).show();
                Intent vaiparaLista = new Intent(FormularioCarrosActivity.this, ListaCarrosActivity.class);
                startActivity(vaiparaLista);

            }
        });
    }

}
