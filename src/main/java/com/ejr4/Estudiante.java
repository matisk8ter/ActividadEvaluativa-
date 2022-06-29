package com.ejr4;

public class Estudiante extends Persona{


    public Estudiante(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
    }

    @Override
    public boolean disponiblilidad() {
        double random = Math.random();
        return random< 0.5?true:false;
    }


}
