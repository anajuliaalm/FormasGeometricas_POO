package br.edu.FormasGeometricasEspaciais;

public class Tetraedro {

	private double aresta;
    private double area;
    private double volume;

    public Tetraedro() {
        aresta = 0;
        area = 0;
        volume = 0;
    }
    public double getAresta() {
        return aresta;
    }

    public void setAresta(double novaAresta) {
        aresta = novaAresta;
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
        area = Math.sqrt(3) * Math.pow(aresta, 2);
    }

    private void calcularVolume() {
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
