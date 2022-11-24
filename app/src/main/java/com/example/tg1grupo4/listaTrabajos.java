package com.example.tg1grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tg1grupo4.adapters.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class listaTrabajos extends AppCompatActivity {

    ListView listTrabajos;
    List<Trabajos> listaTrabajos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_trabajos);

        listTrabajos=findViewById(R.id.ListViewTrabajos);

        CustomAdapter adapter = new CustomAdapter(this, getData());
        listTrabajos.setAdapter(adapter);

        listTrabajos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Trabajos t = listaTrabajos.get(i);
                Toast.makeText(getBaseContext(),t.titulo,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Trabajos> getData() {
        listaTrabajos=new ArrayList<>();
        listaTrabajos.add(new Trabajos(1,R.drawable.book_open_page_variant_outline,"Trabajo","Trabajo mensual"));
        listaTrabajos.add(new Trabajos(1,R.drawable.book_open_page_variant_outline,"Examen","Elaborar interfaz gráfica"));
        listaTrabajos.add(new Trabajos(1,R.drawable.book_open_page_variant_outline,"Trabajo","Calcular letra DNI"));
        listaTrabajos.add(new Trabajos(1,R.drawable.book_open_page_variant_outline,"Trabajo","Trabajo grupall"));

        return  listaTrabajos;

    }
}