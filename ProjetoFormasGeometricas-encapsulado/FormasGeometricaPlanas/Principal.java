package br.edu.FormasGeometricaPlanas;

public class Principal {

    static class Quadrado {
        private double lado;
        private double area;

        public void setLado(double l) {
            lado = l;
        }

        public double getLado() {
            return lado;
        }

        public void calcularArea() {
            area = lado * lado;
        }

        public void mostrarArea() {
            System.out.println("Área do quadrado: " + area);
        }
    }

    static class Retangulo {
        private double base;
        private double altura;
        private double area;

        public void setBase(double b) {
            base = b;
        }

        public void setAltura(double h) {
            altura = h;
        }

        public void calcularArea() {
            area = base * altura;
        }

        public void mostrarArea() {
            System.out.println("Área do retângulo: " + area);
        }
    }

    static class Triangulo {
        private double base;
        private double altura;
        private double area;

        public void setBase(double b) {
            base = b;
        }

        public void setAltura(double h) {
            altura = h;
        }

        public void calcularArea() {
            area = (base * altura) / 2;
        }

        public void mostrarArea() {
            System.out.println("Área do triângulo: " + area);
        }
    }

    static class Circulo {
        private double raio;
        private double area;

        public void setRaio(double r) {
            raio = r;
        }

        public void calcularArea() {
            area = Math.PI * raio * raio;
        }

        public void mostrarArea() {
            System.out.println("Área do círculo: " + area);
        }
    }

    static class Losango {
        private double dMaior;
        private double dMenor;
        private double area;

        public void setDiagonalMaior(double d) {
            dMaior = d;
        }

        public void setDiagonalMenor(double d) {
            dMenor = d;
        }

        public void calcularArea() {
            area = (dMaior * dMenor) / 2;
        }

        public void mostrarArea() {
            System.out.println("Área do losango: " + area);
        }
    }
    static class Trapezio {
        private double baseMaior;
        private double baseMenor;
        private double altura;
        private double area;

        public void setBaseMaior(double b) {
            baseMaior = b;
        }

        public void setBaseMenor(double b) {
            baseMenor = b;
        }

        public void setAltura(double h) {
            altura = h;
        }

        public void calcularArea() {
            area = ((baseMaior + baseMenor) * altura) / 2;
        }

        public void mostrarArea() {
            System.out.println("Área do trapézio: " + area);
        }
    }

    static class Hexagono {
        private double lado;
        private double area;

        public void setLado(double l) {
            lado = l;
        }

        public void calcularArea() {
            area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
        }

        public void mostrarArea() {
            System.out.println("Área do hexágono: " + area);
        }
    }

    static class Paralelogramo {
        private double base;
        private double altura;
        private double area;

        public void setBase(double b) {
            base = b;
        }

        public void setAltura(double h) {
            altura = h;
        }

        public void calcularArea() {
            area = base * altura;
        }

        public void mostrarArea() {
            System.out.println("Área do paralelogramo: " + area);
        }
    }

    static class Pentagono {
        private double lado;
        private double apotema;
        private double area;

        public void setLado(double l) {
            lado = l;
        }

        public void setApotema(double a) {
            apotema = a;
        }

        public void calcularArea() {
            area = (5 * lado * apotema) / 2;
        }

        public void mostrarArea() {
            System.out.println("Área do pentágono: " + area);
        }
    }

    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.setLado(4);
        q.calcularArea();
        q.mostrarArea();

        Retangulo r = new Retangulo();
        r.setBase(5);
        r.setAltura(3);
        r.calcularArea();
        r.mostrarArea();

        Triangulo t = new Triangulo();
        t.setBase(6);
        t.setAltura(2);
        t.calcularArea();
        t.mostrarArea();

        Circulo c = new Circulo();
        c.setRaio(3);
        c.calcularArea();
        c.mostrarArea();

        Losango l = new Losango();
        l.setDiagonalMaior(8);
        l.setDiagonalMenor(5);
        l.calcularArea();
        l.mostrarArea();

        Trapezio tr = new Trapezio();
        tr.setBaseMaior(10);
        tr.setBaseMenor(6);
        tr.setAltura(4);
        tr.calcularArea();
        tr.mostrarArea();

        Hexagono h = new Hexagono();
        h.setLado(2);
        h.calcularArea();
        h.mostrarArea();

        Paralelogramo p = new Paralelogramo();
        p.setBase(7);
        p.setAltura(3);
        p.calcularArea();
        p.mostrarArea();

        Pentagono pe = new Pentagono();
        pe.setLado(5);
        pe.setApotema(3.5);
        pe.calcularArea();
        pe.mostrarArea();
    }
}
