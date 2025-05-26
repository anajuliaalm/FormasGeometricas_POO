package br.edu.FormasGeometricasEspaciais;

public class Esfera {

	// atributos 
	private double raio;
    private double area;
    private double volume;

    // construtor
    public Esfera() {
        raio = 0;
        area = 0;
        volume = 0;
    }

    public void recebeRaio(double pRaio) {
        raio = pRaio;
    }

    public void calcArea() {
        area = 4 * Math.PI * Math.pow(raio, 2);
    }

    public void calcVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public void mostrarArea() {
        System.out.println("Área da esfera: " + area);
    }

    public void mostrarVolume() {
        System.out.println("Volume da esfera: " + volume);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("Área da esfera (com retorno): " + area);
        return area;
    }

    public double mostrarVolumeComRetorno() {
        System.out.println("Volume da esfera (com retorno): " + volume);
        return volume;
    }
}
