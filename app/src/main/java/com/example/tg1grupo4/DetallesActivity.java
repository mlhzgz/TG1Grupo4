package com.example.tg1grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DetallesActivity extends AppCompatActivity {

    private Trabajos Item;
    private TextView textViewDetallesTarea;
    private EditText EditTextNota,EditTextComentario;
    private Spinner spinner_alumnos;
    private Button buttonBorrar;
    private Button botonGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        botonGuardar=(Button) findViewById(R.id.buttonGuardar);
        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Guardar();

            }
        });

        Item = (Trabajos) getIntent().getSerializableExtra("objetoData");

        textViewDetallesTarea = (TextView) findViewById(R.id.textViewDetallesTarea);  //implementar metodo onclick
        EditTextNota = (EditText) findViewById(R.id.EditTextNota);
        EditTextComentario = (EditText) findViewById(R.id.EditTextComentario);
        spinner_alumnos = (Spinner) findViewById(R.id.spinner_alumnos);
        buttonBorrar = (Button)findViewById(R.id.buttonBorrar);

        textViewDetallesTarea.setText(Item.getTitulo());    //para q cambia el titulo dentro de cada tarea
        EditTextNota.setText("");
        EditTextComentario.setText("");

        buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Borrar();
            }
        });


        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,R.array.combo_alumnos, android.R.layout.simple_spinner_item);
        spinner_alumnos.setAdapter(adapter);
    }


    public void Borrar(){
        Toast toast1= Toast.makeText(getApplicationContext(),
                "Datos reinicializados con éxito", Toast.LENGTH_SHORT);
        toast1.show();
        EditTextNota.setText("");
        EditTextComentario.setText("");
    }

    public void Guardar(){
        Toast toast1= Toast.makeText(getApplicationContext(),
                "Guardando...", Toast.LENGTH_SHORT);
        toast1.show();

        boolean retorno = true;
        String cNota = EditTextNota.getText().toString();
        String cComentario = EditTextComentario.getText().toString();

        if(cNota.isEmpty()){
            EditTextNota.setError("El campo no puede quedar vacío");
            retorno = false;
        }

        if(cNota.isEmpty()){
            EditTextComentario.setError("El campo no puede quedar vacío");
            retorno = false;
        }

    }


}