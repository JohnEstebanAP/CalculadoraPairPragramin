package com.sofka.software;

public class Calculadora {
    private Double dato1;
    private Double dato2;

    public Calculadora(Double dato1, Double dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public Double sumar(){
        return this.dato1 + this.dato2;
    }

    public Double restar(){
        return this.dato1 - this.dato2;
    }

    public Double multiplicar(){
        return this.dato1 * this.dato2;
    }

    public Double dividir(){
        return this.dato1 / this.dato2;
    }

    public Double getDato1() {
        return dato1;
    }

    public void setDato1(Double dato1) {
        this.dato1 = dato1;
    }

    public Double getDato2() {
        return dato2;
    }

    public void setDato2(Double dato2) {
        this.dato2 = dato2;
    }
}
