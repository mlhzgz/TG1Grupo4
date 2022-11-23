package com.example.tg1grupo4.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tg1grupo4.R;
import com.example.tg1grupo4.Trabajos;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Trabajos> trabajos;

    public CustomAdapter(Context context, List<Trabajos> trabajos) {
        this.context = context;
        this.trabajos = trabajos;
    }


    @Override
    public int getCount() {
        return trabajos.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView iconoImagen;
        TextView textonombreTrabajo;
        TextView textoinfoTrabajo;

        Trabajos t = trabajos.get(i);

        if(view==null)
            view= LayoutInflater.from(context).inflate(R.layout.lista_trabajos,null);

        iconoImagen=view.findViewById(R.id.iconoImagen);
        textoinfoTrabajo=view.findViewById(R.id.textoinfoTrabajo);
        textonombreTrabajo=view.findViewById(R.id.textonombreTrabajo);

        iconoImagen.setImageResource(t.imagen);
        textoinfoTrabajo.setText(t.subtitulo);
        textonombreTrabajo.setText(t.titulo);

        return view;
    }
}
