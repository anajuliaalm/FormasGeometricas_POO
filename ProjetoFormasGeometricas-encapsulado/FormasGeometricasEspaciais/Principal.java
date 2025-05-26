package br.edu.FormasGeometricasEspaciais;

public class Principal {

	public class FormasGeometricasEspaciais {

	    static class Cubo {
	        private double aresta;
	        private double volume;

	        public void setAresta(double a) {
	            aresta = a;
	        }

	        public void calcularVolume() {
	            volume = aresta * aresta * aresta;
	        }

	        public void mostrarVolume() {
	            System.out.println("Volume do cubo: " + volume);
	        }
	    }

	    static class Paralelepipedo {
	        private double comprimento;
	        private double largura;
	        private double altura;
	        private double volume;

	        public void setDimensoes(double c, double l, double a) {
	            comprimento = c;
	            largura = l;
	            altura = a;
	        }

	        public void calcularVolume() {
	            volume = comprimento * largura * altura;
	        }

	        public void mostrarVolume() {
	            System.out.println("Volume do paralelepípedo: " + volume);
	        }
	    }

	    static class Esfera {
	        private double raio;
	        private double volume;

	        public void setRaio(double r) {
	            raio = r;
	        }

	        public void calcularVolume() {
	            volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
	        }

	        public void mostrarVolume() {
	            System.out.println("Volume da esfera: " + volume);
	        }
	    }

	    static class Cilindro {
	        private double raio;
	        private double altura;
	        private double volume;

	        public void setRaio(double r) {
	            raio = r;
	        }

	        public void setAltura(double a) {
	            altura = a;
	        }

	        public void calcularVolume() {
	            volume = Math.PI * raio * raio * altura;
	        }

	        public void mostrarVolume() {
	            System.out.println("Volume do cilindro: " + volume);
	        }
	    }

	    static class Cone {
	        private double raio;
	        private double altura;
	        private double volume;

	        public void setRaio(double r) {
	            raio = r;
	        }

	        public void setAltura(double a) {
	            altura = a;
	        }

	        public void calcularVolume() {
	            volume = (Math.PI * raio * raio * altura) / 3;
	        }

	        public void mostrarVolume() {
	            System.out.println("Volume do cone: " + volume);
	        }
	    }

	    static class Piramide {
	        private double areaBase;
	        private double altura;
	        private double volume;

	        public void setAreaBase(double ab) {
	            areaBase = ab;
	        }

	        public void setAltura(double a) {
	            altura = a;
	        }

	        public void calcularVolume() {
	            volume = (areaBase * altura) / 3;
	        }

	        public void mostrarVolume() {
	            System.out.println("Volume da pirâmide: " + volume);
	        }
	    }

	    static class Tetraedro {
	        private double aresta;
	        private double volume;

	        public void setAresta(double a) {
	            aresta = a;
	        }

	        public void calcularVolume() {
	            volume = (Math.pow(aresta, 3)) / (6 * Math.sqrt(2));
	        }

	        public void mostrarVolume() {
	            System.out.println("Volume do tetraedro: " + volume);
	        }
	    }

	    static class Prisma {
	        private double areaBase;
	        private double altura;
	        private double volume;

	        public void setAreaBase(double ab) {
	            areaBase = ab;
	        }

	        public void setAltura(double a) {
	            altura = a;
	        }

	        public void calcularVolume() {
	            volume = areaBase * altura;
	        }

	        public void mostrarVolume() {
	            System.out.println("Volume do prisma: " + volume);
	        }
	    }

	    public static void main(String[] args) {
	        Cubo cubo = new Cubo();
	        cubo.setAresta(3);
	        cubo.calcularVolume();
	        cubo.mostrarVolume();

	        Paralelepipedo para = new Paralelepipedo();
	        para.setDimensoes(3, 4, 5);
	        para.calcularVolume();
	        para.mostrarVolume();

	        Esfera esfera = new Esfera();
	        esfera.setRaio(2);
	        esfera.calcularVolume();
	        esfera.mostrarVolume();

	        Cilindro cilindro = new Cilindro();
	        cilindro.setRaio(2);
	        cilindro.setAltura(5);
	        cilindro.calcularVolume();
	        cilindro.mostrarVolume();

	        Cone cone = new Cone();
	        cone.setRaio(2);
	        cone.setAltura(5);
	        cone.calcularVolume();
	        cone.mostrarVolume();

	        Piramide piramide = new Piramide();
	        piramide.setAreaBase(9);
	        piramide.setAltura(6);
	        piramide.calcularVolume();
	        piramide.mostrarVolume();

	        Tetraedro tetraedro = new Tetraedro();
	        tetraedro.setAresta(3);
	        tetraedro.calcularVolume();
	        tetraedro.mostrarVolume();

	        Prisma prisma = new Prisma();
	        prisma.setAreaBase(7);
	        prisma.setAltura(10);
	        prisma.calcularVolume();
	        prisma.mostrarVolume();
	    }
	}
	}
