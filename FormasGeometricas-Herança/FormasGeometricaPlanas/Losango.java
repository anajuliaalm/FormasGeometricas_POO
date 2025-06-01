package br.edu.FormasGeometricaPlanas;


	public class Losango extends figuraPlana{
	    private double maiorDiagonal;
	    private double menorDiagonal;

	    public Losango() {
	    	maiorDiagonal = 10;
	    	menorDiagonal = 10;
	    	
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
	    }
	}
