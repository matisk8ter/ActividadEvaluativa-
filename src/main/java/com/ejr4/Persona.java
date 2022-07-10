package com.ejr4;

 public abstract class Persona {
    private String nombre;
    private int edad;
    private char sexo;

    private boolean disponible;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public abstract boolean disponiblilidad();

     public String getNombre() {
         return nombre;
     }

     public char getSexo() {
         return sexo;
     }
 }
