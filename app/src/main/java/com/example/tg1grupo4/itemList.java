package com.example.tg1grupo4;

public class itemList {
    private String titulo;
    private String subtitulo;
    private int imagen;

    public itemList(String titulo, String subtitulo, int imagen){
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.imagen = imagen;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public int getImagen() {
        return imagen;
    }
}
