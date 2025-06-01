package br.edu.FormasGeometricaPlanas;

public class Hexagono {

	// atributos 
		private double lado;
		private double area;
		
		// construtor 
		public Hexagono () {
			lado = 0;
			area = 0; 
		}
		
		public double getLado () {
			return lado;
			
		}
		public void setLado(double novoLado) {
	        lado = novoLado;
	    }

	    public double getArea() {
	        return area;
	    }

	    private void setArea(double pArea) {
	        area = pArea;
	    }

	    public void calcularArea() {
	        setArea((3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2);
	    }

	    public void mostrarArea() {
	        System.out.println("Área: " + area);
	    }

	    public double mostrarAreaComRetorno() {
	        System.out.println("A área do hexágono é: " + area);
	        return area;
	    }
	}
	