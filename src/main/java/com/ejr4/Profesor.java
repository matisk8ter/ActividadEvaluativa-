package com.ejr4;

public class Profesor extends Persona{

    String materia;

    public Profesor(String nombre, int edad, char sexo,String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
    }

    @Override
    public boolean disponiblilidad() {
        double random = Math.random();
        return random >= 0.2?true:false;
    }

    public String getMateria() {
        return materia;
    }
}
