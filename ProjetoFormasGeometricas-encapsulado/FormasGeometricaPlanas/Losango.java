package br.edu.FormasGeometricaPlanas;

public class Losango {

    // atributos 
    private double diagonalMaior;
    private double diagonalMenor;
    private double area;

    // construtor
    public Losango() {
        diagonalMaior = 0;
        diagonalMenor = 0;
        area = 0;
    }

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(double pDiagonalMaior) {
        diagonalMaior = pDiagonalMaior;
        calcularArea();     }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double pDiagonalMenor) {
        diagonalMenor = pDiagonalMenor;
        calcularArea(); 
    }

    public double getArea() {
        return area;
    }

    private void calcularArea() {
        area = (diagonalMaior * diagonalMenor) / 2;
    }

    public void mostrarArea() {
        System.out.println("Área do losango: " + area);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("A área do losango é: " + area);
        return area;
    }
}
