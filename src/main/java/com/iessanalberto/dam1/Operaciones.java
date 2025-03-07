package com.iessanalberto.dam1;

public class Operaciones {

    public Operaciones(){

        Triangulo triangulo = new Triangulo();  //Por defecto viene el 10 de altura y el 8 de base

        System.out.println("El triángulo de " + triangulo.getBase() + " por " + triangulo.getAltura()+ " tiene un área de " + triangulo.getArea());

        /*TEST SERVICIO DE MOKITO */

    }


    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();

    }

}



