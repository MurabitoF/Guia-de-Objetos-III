package com.company.ejercicio1;

public class Cilindro extends Circulo{
    private Double altura;

    public Cilindro(Double radio, Double altura) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro() {
        this.radio = 1.0;
        this.altura = 1.0;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double calcularVolumen(){
        return Math.PI * Math.pow(radio,2) * this.altura;
    }

    @Override
    public Double calcularArea(){
        return 2 * Math.PI * this.radio * this.altura + 2 * super.calcularArea();
    }

    @Override
    public String toString(){
        return String.format("Cilindro: subclase de %s, altura=%1.3f]", super.toString(), this.altura);
    }
}
