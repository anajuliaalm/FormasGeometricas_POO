package br.edu.FormasGeometricasEspaciais;

public class Tetraedro {

	// atributos
	private double aresta;
    private double area;
    private double volume;

    // construtor
    public void Tetraedro() {
        aresta = 0;
        area = 0;
        volume = 0;
    }

    public void recebeAresta(double pAresta) {
        aresta = pAresta;
    }

    public void calcArea() {
        area = Math.sqrt(3) * Math.pow(aresta, 2);
    }

    public void calcVolume() {
        volume = Math.pow(aresta, 3) / (6 * Math.sqrt(2));
    }

    public void mostrarArea() {
        System.out.println("Área do tetraedro: " + area);
    }

    public void mostrarVolume() {
        System.out.println("Volume do tetraedro: " + volume);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("Área do tetraedro (com retorno): " + area);
        return area;
    }

    public double mostrarVolumeComRetorno() {
        System.out.println("Volume do tetraedro (com retorno): " + volume);
        return volume;
    }
}
