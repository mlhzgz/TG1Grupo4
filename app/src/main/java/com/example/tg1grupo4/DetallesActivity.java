package com.example.tg1grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DetallesActivity extends AppCompatActivity {

    private Trabajos Item;
    private TextView textViewDetallesTarea;
    private EditText EditTextNota,EditTextComentario;
    private Spinner spinner_alumnos;
    private Button buttonBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        Item = (Trabajos) getIntent().getSerializableExtra("objetoData");

        textViewDetallesTarea = (TextView) findViewById(R.id.textViewDetallesTarea);
        EditTextNota = (EditText) findViewById(R.id.EditTextNota);
        EditTextComentario = (EditText) findViewById(R.id.EditTextComentario);
        spinner_alumnos = (Spinner) findViewById(R.id.spinner_alumnos);
        buttonBorrar = (Button)findViewById(R.id.buttonBorrar);

        textViewDetallesTarea.setText(Item.getTitulo());
        EditTextNota.setText("");
        EditTextComentario.setText("");

        buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditTextNota.setText("");
                EditTextComentario.setText("");
            }
        });
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.combo_alumnos, android.R.layout.simple_spinner_item);
        spinner_alumnos.setAdapter(adapter);
    }

    public void onclick(View view){
        switch (view.getId()){
            case R.id.buttonGuardar:
                break;
        }
    }
}