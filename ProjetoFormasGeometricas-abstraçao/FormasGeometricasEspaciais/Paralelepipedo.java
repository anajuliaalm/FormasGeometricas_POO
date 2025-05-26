package br.edu.FormasGeometricasEspaciais;

public class Paralelepipedo {

	// atributos
	private double comprimento;
    private double largura;
    private double altura;
    private double area;
    private double volume;

    // construtor
    public Paralelepipedo() {
        comprimento = 0;
        largura = 0;
        altura = 0;
        area = 0;
        volume = 0;
    }

    public void recebeComprimento(double pComprimento) {
        comprimento = pComprimento;
    }

    public void recebeLargura(double pLargura) {
        largura = pLargura;
    }

    public void recebeAltura(double pAltura) {
        altura = pAltura;
    }

    public void calcArea() {
        area = 2 * (comprimento * largura + comprimento * altura + largura * altura);
    }

    public void calcVolume() {
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
