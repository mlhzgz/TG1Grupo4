package com.example.tg1grupo4;

import android.widget.Spinner;

public class Alumnos {
    public Spinner Nombre;
    public int Nota;
    public String Comentario;

    public Alumnos(Spinner nombre, int nota, String comentario) {
        Nombre = nombre;
        Nota = nota;
        Comentario = comentario;
    }

    public Spinner getNombre() {
        return Nombre;
    }

    public void setNombre(Spinner nombre) {
        Nombre = nombre;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int nota) {
        Nota = nota;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "Nombre=" + Nombre +
                ", Nota=" + Nota +
                ", Comentario='" + Comentario + '\'' +
                '}';
    }
}
