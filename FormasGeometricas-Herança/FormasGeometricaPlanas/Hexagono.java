package br.edu.FormasGeometricaPlanas;

public class Hexagono extends figuraPlana{
    private double lado;

    public Hexagono() {
    	lado = 10;
    	
    } public void setLado(double pLado) {
        lado = lado;
    } public double getLado() {
    	return lado;
    } public void calcArea() {
        area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
    }
}