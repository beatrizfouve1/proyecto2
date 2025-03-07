package com.iessanalberto.dam1;

public class Triangulo {
   //ATRIBUTOS DE LA CLASE QUE LO DEFINE
    private int base ;
    private int altura ;

    //CONSTRUCTORES DEL OBJETO Y SOBRECARGA
    public Triangulo() {
        this.altura=8;
        this.base=10;
    }

    public Triangulo(int base_input, int altura_input) {
        this.base = base_input;
        this.altura = altura_input;

    }
    ;
    //FUNCIONES
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public int getArea(){
        return (altura*base)/2;
    }
}

