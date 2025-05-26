package br.edu.FormasGeometricasEspaciais;

public class Cubo {

    private double lado;
    private double area;
    private double volume;

    public Cubo() {
        lado = 0;
        area = 0;
        volume = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double novoLado) {
        lado = novoLado;
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
        area = 6 * Math.pow(lado, 2);
    }

    private void calcularVolume() {
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
