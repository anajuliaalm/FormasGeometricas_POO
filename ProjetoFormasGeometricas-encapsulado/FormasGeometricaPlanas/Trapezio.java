package br.edu.FormasGeometricaPlanas;

public class Trapezio {

    // atributos     
	private double baseMaior;
    private double baseMenor;
    private double altura;
    private double area;

    // construtor
    public Trapezio() {
        baseMaior = 0;
        baseMenor = 0;
        altura = 0;
        area = 0;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double pBaseMaior) {
        baseMaior = pBaseMaior;
        calcularArea();     }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double pBaseMenor) {
        baseMenor = pBaseMenor;
        calcularArea();     }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double pAltura) {
        altura = pAltura;
        calcularArea();    }

    public double getArea() {
        return area;
    }

    private void calcularArea() {
        area = ((baseMaior + baseMenor) * altura) / 2;
    }

    public void mostrarArea() {
        System.out.println("Área do trapézio: " + area);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("A área do trapézio é: " + area);
        return area;
    }
}
