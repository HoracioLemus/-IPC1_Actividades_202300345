package com.example;

public class Pais {
//crea lo necesario para que la clase pais pueda almacenar el nombre y codigo
    private String nombre;
    private String codigo;

    //Constructor
    public Pais(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }
}
