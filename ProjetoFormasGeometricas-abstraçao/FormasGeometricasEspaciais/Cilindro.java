package br.edu.FormasGeometricasEspaciais;

public class Cilindro {

	// atributos
	private double raio;
    private double altura;
    private double area;
    private double volume;

    // construtor
    public Cilindro() {
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
        area = 2 * Math.PI * Math.pow(raio, 2) + 2 * Math.PI * raio * altura;
    }

    public void calcVolume() {
        volume = Math.PI * Math.pow(raio, 2) * altura;
    }

    public void mostrarArea() {
        System.out.println("Área do cilindro: " + area);
    }

    public void mostrarVolume() {
        System.out.println("Volume do cilindro: " + volume);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("Área do cilindro (com retorno): " + area);
        return area;
    }

    public double mostrarVolumeComRetorno() {
        System.out.println("Volume do cilindro (com retorno): " + volume);
        return volume;
    }
}
