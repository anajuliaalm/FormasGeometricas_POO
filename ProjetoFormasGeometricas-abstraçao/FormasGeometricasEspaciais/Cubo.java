package br.edu.FormasGeometricasEspaciais;

public class Cubo {


    // atributos 
    private double lado;
    private double area;
    private double volume;

    // construtor
    public Cubo() {
        lado = 0;
        area = 0;
        volume = 0;
    }

    public void recebeLado(double pLado) {
        lado = pLado;
    }

    public void calcArea() {
        area = 6 * Math.pow(lado, 2);
    }

    public void calcVolume() {
        volume = Math.pow(lado, 3);
    }

    public void mostrarArea() {
        System.out.println("Área do cubo: " + area);
    }

    public void mostrarVolume() {
        System.out.println("Volume do cubo: " + volume);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("Área do cubo (com retorno): " + area);
        return area;
    }

    public double mostrarVolumeComRetorno() {
        System.out.println("Volume do cubo (com retorno): " + volume);
        return volume;
    }
}
