package br.edu.FormasGeometricasEspaciais;

public class Cilindro {

	    private double raio;
	    private double altura;
	    private double area;
	    private double volume;

	    public Cilindro() {
	        raio = 0;
	        altura = 0;
	        area = 0;
	        volume = 0;
	    }

	    public double getRaio() {
	        return raio;
	    }

	    public void setRaio(double novoRaio) {
	        raio = novoRaio;
	        calcularArea();
	        calcularVolume();
	    }

	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double novaAltura) {
	        altura = novaAltura;
	        calcularArea();
	        calcularVolume();
	    }

	    public double getArea() {
	        return area;
	    }

	    public double getVolume() {
	        return volume;
	    }

	    private void calcularArea() {
	        area = 2 * Math.PI * raio * (raio + altura);
	    }

	    private void calcularVolume() {
	        volume = Math.PI * raio * raio * altura;
	    }

	    public void mostrarArea() {
	        System.out.println("Área do cilindro: " + area);
	    }

	    public void mostrarVolume() {
	        System.out.println("Volume do cilindro: " + volume);
	    }
	}
	