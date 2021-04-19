package com.company.ejercicio1;

public class Circulo {
    protected Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this.radio = 1.0;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public String toString(){
        return String.format("Circulo[radio=%1.3f]", radio);
    }
}
