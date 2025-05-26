package br.edu.FormasGeometricaPlanas;

public class Triangulo {

    // atributos    
	private double base;
    private double altura;
    private double area;

    // construtor
    public Triangulo() {
        base = 0;
        altura = 0;
        area = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double pBase) {
        base = pBase;
        calcularArea();     }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double pAltura) {
        altura = pAltura;
        calcularArea();     }

    public double getArea() {
        return area;
    }

    private void calcularArea() {
        area = (base * altura) / 2;
    }

    public void mostrarArea() {
        System.out.println("Área do triângulo: " + area);
    }

    public double mostrarAreaComRetorno() {
        System.out.println("A área do triângulo é: " + area);
        return area;
    }
}
