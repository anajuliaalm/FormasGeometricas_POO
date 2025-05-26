package br.edu.FormasGeometricaPlanas;

public class Circulo {

	// atributos 
    private double raio;
    private double area;

    // construtor 
    public Circulo() {
        raio = 0;
        area = 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double pRaio) {
        raio = pRaio;
    }

    public double getArea() {
        return area;
    }

    private void setArea(double pArea) {
        area = pArea;
    }

    public void calcularArea() {
        setArea(Math.PI * raio * raio);
    }

    public void mostrarArea() {
        System.out.println("Área: " + area);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("A área do círculo é: " + area);
        return area;
    }
}
