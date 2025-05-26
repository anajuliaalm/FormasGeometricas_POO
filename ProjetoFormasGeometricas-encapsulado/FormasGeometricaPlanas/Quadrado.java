package br.edu.FormasGeometricaPlanas;

public class Quadrado {

	// atributos
    private double lado;
    private double area;

    // construtor 
    public Quadrado() {
        lado = 0;
        area = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double pLado) {
        lado = pLado;
    }

    public double getArea() {
        return area;
    }

    private void setArea(double pArea) {
        area = pArea;
    }

    public void calcularArea() {
        setArea(lado * lado);
    }

    public void mostrarArea() {
        System.out.println("Área: " + area);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("A área do quadrado é: " + area);
        return area;
    }
}
