package br.edu.FormasGeometricaPlanas;

public class Retangulo {


    private double base;
    private double altura;
    private double area;

    public Retangulo() {
    	base = 10;
    	altura = 10;
    	area = 0;
    	
    } public void setBase(double pBase) {
        base = base;
    } public double getBase() {
        return base;
    } public void setAltura(double pAltura) {
        altura = altura;
    } public double getAltura() {
        return altura;
    } public void calcArea() {
        area = base * altura;
    } public void mostrarArea() {
        System.out.println("Área: " + area);
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}
