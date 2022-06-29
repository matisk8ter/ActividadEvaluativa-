package com.ejr4;

 public abstract class Persona {
    private String nombre;
    private int edad;
    private String sexo;

    private boolean disponible;

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public abstract boolean disponiblilidad();

}
