package br.edu.FormasGeometricasEspaciais;

public class Cone {

	private double raio;
    private double altura;
    private double area;
    private double volume;

    public Cone() {
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
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        area = Math.PI * Math.pow(raio, 2) + Math.PI * raio * geratriz;
    }

    private void calcularVolume() {
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
