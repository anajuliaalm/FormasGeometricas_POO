package br.edu.FormasGeometricaPlanas;

	public class Quadrado extends figuraPlana{
	    private double lado;

	    public Quadrado() {
	    	lado = 10;
	    	
	    } public void setLado(double pLado) {
	        lado = lado;
	    } public double getLado() {
	        return lado;
	    } public void calcArea() {
	        area = lado * lado;
	    }
	}
