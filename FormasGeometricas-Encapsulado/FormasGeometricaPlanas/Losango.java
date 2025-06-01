package br.edu.FormasGeometricaPlanas;

public class Losango {

	 private double maiorDiagonal;
	    private double menorDiagonal;
	    private double area;

	    public Losango() {
	    	maiorDiagonal = 10;
	    	menorDiagonal = 10;
	    	area = 0;
	    	
	    } public void setMaiorDiagonal(double pMaiorDiagonal) {
	        maiorDiagonal = maiorDiagonal;
	    } public double getMaiorDiagonal() {
	        return maiorDiagonal;
	    } public void setMenorDiagonal(double pMenorDiagonal) {
	        menorDiagonal = menorDiagonal;
	    } public double getMenorDiagonal() {
	        return menorDiagonal;
	    } public void calcArea() {
	        area = (maiorDiagonal * menorDiagonal) / 2;
	    } public void mostrarArea() {
	        System.out.println("Área: " + area);
	    } public double getArea() {
	        System.out.println("Área com retorno: " + area);
	        return area;
	    }
	}