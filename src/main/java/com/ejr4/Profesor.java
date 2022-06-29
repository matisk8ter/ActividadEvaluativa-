package com.ejr4;

public class Profesor extends Persona{


    private static String materias [] = {"Matematicas","Filosofia","Fisica"};
    private String materia;

    public Profesor(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
    }

    @Override
    public boolean disponiblilidad() {
        double random = Math.random();
        return random<0.2?true:false;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }


}
