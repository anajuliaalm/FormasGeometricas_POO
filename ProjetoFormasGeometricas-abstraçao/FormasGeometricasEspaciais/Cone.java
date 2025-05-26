package br.edu.FormasGeometricasEspaciais;

public class Cone {

	   // atributos
	    private double raio;
	    private double altura;
	    private double area;
	    private double volume;

	    // construtor
	    public Cone() {
	        raio = 0;
	        altura = 0;
	        area = 0;
	        volume = 0;
	    }

	    public void recebeRaio(double pRaio) {
	        raio = pRaio;
	    }

	    public void recebeAltura(double pAltura) {
	        altura = pAltura;
	    }

	    public void calcArea() {
	        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	        area = Math.PI * Math.pow(raio, 2) + Math.PI * raio * geratriz;
	    }

	    public void calcVolume() {
	        volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
	    }

	    public void mostrarArea() {
	        System.out.println("Área do cone: " + area);
	    }

	    public void mostrarVolume() {
	        System.out.println("Volume do cone: " + volume);
	    }

	    public double mostrarAreaComRetorno() {
	        System.out.println("Área do cone (com retorno): " + area);
	        return area;
	    }

	    public double mostrarVolumeComRetorno() {
	        System.out.println("Volume do cone (com retorno): " + volume);
	        return volume;
	    }
	}
