package br.edu.FormasGeometricasEspaciais;

public class Paralelepipedo {

	 private double comprimento;
	    private double largura;
	    private double altura;
	    private double area;
	    private double volume;

	    public Paralelepipedo() {
	        comprimento = 0;
	        largura = 0;
	        altura = 0;
	        area = 0;
	        volume = 0;
	    }

	    public double getComprimento() {
	        return comprimento;
	    }

	    public void setComprimento(double novoComprimento) {
	        comprimento = novoComprimento;
	        calcularArea();
	        calcularVolume();
	    }

	    public double getLargura() {
	        return largura;
	    }

	    public void setLargura(double novaLargura) {
	        largura = novaLargura;
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
	        area = 2 * (comprimento * largura + comprimento * altura + largura * altura);
	    }

	    private void calcularVolume() {
	        volume = comprimento * largura * altura;
	    }

	    public void mostrarArea() {
	        System.out.println("Área do paralelepípedo: " + area);
	    }

	    public void mostrarVolume() {
	        System.out.println("Volume do paralelepípedo: " + volume);
	    }

	    public double mostrarAreaComRetorno() {
	        System.out.println("Área do paralelepípedo (com retorno): " + area);
	        return area;
	    }

	    public double mostrarVolumeComRetorno() {
	        System.out.println("Volume do paralelepípedo (com retorno): " + volume);
	        return volume;
	    }
	}
	