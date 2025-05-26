package br.edu.FormasGeometricasEspaciais;

public class Piramide {
	private double base;       
    private double altura;     
    private double areaBase;
    private double areaLateral;
    private double areaTotal;

    public Piramide() {
        base = 0;
        altura = 0;
        areaBase = 0;
        areaLateral = 0;
        areaTotal = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double novaBase) {
        base = novaBase;
        calcularAreas();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double novaAltura) {
        altura = novaAltura;
        calcularAreas();
    }

    public double getAreaBase() {
        return areaBase;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    private void calcularAreaBase() {
        areaBase = base * base;
    }

    private void calcularAreaLateral() {
        double apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        areaLateral = 2 * base * apotema;
    }

    private void calcularAreas() {
        calcularAreaBase();
        calcularAreaLateral();
        areaTotal = areaBase + areaLateral;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da Base: " + areaBase);
    }

    public void mostrarAreaLateral() {
        System.out.println("Área Lateral: " + areaLateral);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área Total: " + areaTotal);
    }

    public double mostrarAreaTotalComRetorno() {
        System.out.println("Área Total (com retorno): " + areaTotal);
        return areaTotal;
    }
}
