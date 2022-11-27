package com.example.tg1grupo4;

import java.io.Serializable;

public class Trabajos implements Serializable {
    public int id;
    public int imagen;
    public String titulo;
    public String subtitulo;

    public Trabajos(int id, int imagen, String titulo, String subtitulo) {
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }
}
