package br.edu.FormasGeometricaPlanas;

public class Circulo extends figuraPlana{
    private double raio;

    public Circulo() {
    	raio = 10;
    	
    } public void setRaio(double pRaio) {
        raio = raio;
    } public double getRaio() {
        return raio;
    } public void calcArea() {
        area = Math.PI * raio * raio;
    }
}