package com.ejr4;

public class Estudiante extends Persona{

    private int nota;

    public Estudiante(String nombre, int edad, char sexo, int nota) {
        super(nombre, edad, sexo);
        this.nota = nota;
    }

    @Override
    public boolean disponiblilidad() {
        double random = Math.random();
        return random <= 0.5?true:false;
    }

    public int getNota() {
        return nota;
    }
}
