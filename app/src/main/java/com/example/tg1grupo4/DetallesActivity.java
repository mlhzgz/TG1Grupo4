package com.example.tg1grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DetallesActivity extends AppCompatActivity {

    TextView etiqueta;
    EditText campo1,campo2;
    Spinner comboAlumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        etiqueta = (TextView) findViewById(R.id.textViewDetallesTarea);
        campo1 = (EditText) findViewById(R.id.EditTextNota);
        campo2 = (EditText) findViewById(R.id.EditTextComentario);
        comboAlumno = (Spinner) findViewById(R.id.spinner_alumnos);

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.combo_alumnos, android.R.layout.simple_spinner_item);
        comboAlumno.setAdapter(adapter);
    }

    public void onclick(View view){
        switch (view.getId()){
            case R.id.buttonGuardar:
                break;
        }
    }
}