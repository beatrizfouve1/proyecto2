package com.iessanalberto.dam1;

public class Rectangulo {

   //ATRIBUTOS DE LA CLASE QUE LO DEFINE
    private float base ;
    private float altura ;

    //CONSTRUCTORES DEL OBJETO
    public Rectangulo() {
        this.altura=8f;
        this.base=10f;
    }

    public Rectangulo(float base_input, float altura_input) {
        this.base = base_input;
        this.altura = altura_input;
    }

    //FUNCIONES
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea(){
        return (altura*base);
    }

    public float getPerimetro(){
        //return altura + base + altura + base; //PRUEBA EN VERDE
        return (altura+base)*2F; // PRUEBA REFACTORIZADA
    }
}

