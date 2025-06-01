package br.edu.FormasGeometricaPlanas;


	public class Paralelogramo extends figuraPlana{
	    private double base;
	    private double altura;

	    public Paralelogramo() {
	    	base = 10;
	    	altura = 10;
	    	
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
	    }
	}
