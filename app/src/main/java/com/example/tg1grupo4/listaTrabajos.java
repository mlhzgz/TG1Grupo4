package com.example.tg1grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                Intent intent = new Intent(com.example.tg1grupo4.listaTrabajos.this,DetallesActivity.class);
                intent.putExtra("objetoData",listaTrabajos.get(i));
                startActivity(intent);
            }
        });
    }

    private List<Trabajos> getData() {
        listaTrabajos=new ArrayList<>();
        listaTrabajos.add(new Trabajos(1,R.drawable.book_open_page_variant_outline,"Trabajo 1","Trabajo mensual"));
        listaTrabajos.add(new Trabajos(2,R.drawable.book_open_page_variant_outline,"Examen","Elaborar interfaz gráfica"));
        listaTrabajos.add(new Trabajos(3,R.drawable.book_open_page_variant_outline,"Trabajo 2","Calcular letra DNI"));
        listaTrabajos.add(new Trabajos(4,R.drawable.book_open_page_variant_outline,"Trabajo 3","Trabajo grupal"));
        listaTrabajos.add(new Trabajos(5,R.drawable.book_open_page_variant_outline,"Trabajo 4","Trabajo mensual diciembre"));
        listaTrabajos.add(new Trabajos(6,R.drawable.book_open_page_variant_outline,"Examen","Elaborar interfaz gráfica con RecyclerView"));
        listaTrabajos.add(new Trabajos(7,R.drawable.book_open_page_variant_outline,"Trabajo 5","Crear alertDialog"));
        listaTrabajos.add(new Trabajos(8,R.drawable.book_open_page_variant_outline,"Trabajo 6","Trabajo grupal diciembre"));
        listaTrabajos.add(new Trabajos(9,R.drawable.book_open_page_variant_outline,"Trabajo 7","Crear un Login"));
        listaTrabajos.add(new Trabajos(10,R.drawable.book_open_page_variant_outline,"Trabajo 8","Trabajo grupal enero"));

        return  listaTrabajos;

    }
}