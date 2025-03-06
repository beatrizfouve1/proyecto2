package com.iessanalberto.dam1;

public class Triangulo {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10, 8);
        int areaTriangulo = triangulo.calcularArea();

        System.out.println("El triángulo de " + triangulo.base + " por " + triangulo.altura + " tiene un área de " + areaTriangulo);
    }
}



