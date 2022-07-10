package com.ejr4;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula {

    int id;
    Profesor profesor;
    Estudiante[] alumno;
    String materia;
    int maxAlumnosDelAula;
    public Aula(int id, Profesor profesor, Estudiante[] alumno, String materia,int maxAlumnosDelAula) {
        this.id = id;
        this.profesor = profesor;
        this.alumno = alumno;
        this.materia = materia;
        this.maxAlumnosDelAula = maxAlumnosDelAula;
    }


    //--------------ME FIJO QUE SE ALCANCE UN MINIMO DE ALUMNOS------------
    public boolean asistenciaDeAlumnos() {
        int cantidadAlumnos = 0;
        boolean minimoAlumnos;
        for (Estudiante estudiantes : this.alumno) {
            if (estudiantes.disponiblilidad()) cantidadAlumnos++;
        }
        if (cantidadAlumnos >= this.maxAlumnosDelAula / 2) { //obtengo 50 % o mas para dar clases
            minimoAlumnos = true;
            System.out.println("La cantidad de alumnos alcanza para dar clases");
        } else {
            System.out.println("No hay suficientes alumnos");
            minimoAlumnos = false;
        }
        return minimoAlumnos;
    }

    //--------------------ME FIJO SI SE PUEDE DAR CLASES-------------------------

    public boolean validoMateria() {
        boolean control = false;
        if(profesor.getMateria() == this.materia){
            control = true;
            System.out.println("El profesor da la materia: " +profesor.getMateria());
        }else System.out.println("El profesor no da esta materia ");
        return control;
    }


    public boolean hayClases() {
        //profesor disponible y materia
        boolean control = false;
        boolean validoMateria = this.validoMateria();
        boolean dispo = this.profesor.disponiblilidad();
        boolean alumDispo = asistenciaDeAlumnos();

        if (validoMateria && dispo && alumDispo) {
            System.out.println("Profesor: " + profesor.getNombre() + " Esta disponible para la materia: " +
                    profesor.getMateria() + " En el Aula: " + this.id);
            control = true;
        }else {
            System.out.println("No Hay Clases ");
        }

        return control;
    }


    //---------------------APROBADOS------------------------------------------
    public void verNotas() {

        ArrayList<Estudiante> alumnosHombres = new ArrayList<>();
        ArrayList<Estudiante> alumnosMujeres = new ArrayList<>();

        for (Estudiante alumnos : alumno) {
            //Maximo de nota es 100 , con 60 ya aprueban
            if (alumnos.getNota() >= 60) {
                if (alumnos.getSexo() == 'H') {
                    //lo guardo en el arrayList
                    alumnosHombres.add(alumnos);
                } else {
                    alumnosMujeres.add(alumnos);
                }
            }
        }
        System.out.println("Aprobaron: " + alumnosHombres.size() + " chicos y " + alumnosMujeres.size() + " chicas");
    }

}
