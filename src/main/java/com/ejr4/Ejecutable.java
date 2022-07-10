package com.ejr4;


public class Ejecutable {

    public static void main(String[] args) {
        //--------------------------ALUMNOS----------------------------------------
        Estudiante alumno1 = new Estudiante("Martin", 19, 'H', 50);
        Estudiante alumno2 = new Estudiante("Pedro", 18, 'H', 60);
        Estudiante alumno3 = new Estudiante("Carol", 19, 'M', 70);
        Estudiante alumno4 = new Estudiante("Martina", 20, 'M', 80);
        Estudiante alumno5 = new Estudiante("Pepe", 25, 'H', 90);
        Estudiante alumno6 = new Estudiante("Jose", 19, 'H', 50);
        Estudiante alumno7 = new Estudiante("Maria", 18, 'M', 60);
        Estudiante alumno8 = new Estudiante("Yanni", 19, 'M', 70);
        Estudiante alumno9 = new Estudiante("Jenni", 20, 'M', 80);
        Estudiante alumno10 = new Estudiante("Pablo", 25, 'H', 90);

        //--------------------------PROFESORES-----------------------------------------
        Profesor profe1 = new Profesor("Carlos", 40, 'H', "Matematicas");
        Profesor profe2 = new Profesor("Raul", 40, 'H', "Filosofia");
        Profesor profe3 = new Profesor("Facundo", 40, 'H', "Fisica");


        Estudiante arrEst [] = {alumno1,alumno2,alumno3,alumno4,alumno5,alumno6,alumno7,alumno8,alumno9,alumno10};

        Aula aula1 = new Aula(1, profe1, arrEst, "Matematicas",10);
        Aula aula2 = new Aula(1, profe2, arrEst, "Filosofia",10);
        Aula aula3 = new Aula(1, profe3, arrEst, "Fisica",10);


        System.out.println("aula 1: ");
        aula1.hayClases();







    }
}
