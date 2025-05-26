package br.edu.FormasGeometricaPlanas;

public class Pentagono {

    // atributos
    private double lado;
    private double apotema;
    private double area;

    // construtor
    public Pentagono() {
        lado = 0;
        apotema = 0;
        area = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double pLado) {
        lado = pLado;
        calcApotema();  
        calcArea();     
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double pApotema) {
        apotema = pApotema;
        calcArea();  
    }

    public double getArea() {
        return area;
    }

    public void calcApotema() {  
        apotema = lado / (2 * Math.tan(Math.PI / 5));  
    }

    private void calcArea() {
        area = (5 * lado * apotema) / 2;  
        }

    public void mostrarArea() {
        System.out.println("Área do pentágono: " + area);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("A área do pentágono é: " + area);
        return area;
    }
}
