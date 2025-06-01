package br.edu.FormasGeometricaPlanas;

public class Pentagono {

	private double perimetro;
    private double apotema;
    private double area;

    public Pentagono() {
    	perimetro = 10;
    	apotema = 10;
    	area = 0;
    	
    } public void setPerimetro(double pPerimetro) {
        perimetro = perimetro;
    } public void setApotema(double pApotema) {
        apotema = apotema;
    } public void calcArea() {
        area = (perimetro * apotema) / 2;
    } public void mostrarArea() {
        System.out.println("Área: " + area);
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
}