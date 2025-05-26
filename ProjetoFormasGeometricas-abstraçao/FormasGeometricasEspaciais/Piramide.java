package br.edu.FormasGeometricasEspaciais;

public class Piramide {
    private double base;    
    private double altura;  
    private double areaBase;
    private double areaLateral;
    private double areaTotal;

    public void recebeBase(double baseValor) {
        base = baseValor;  
    }

    public void recebeAltura(double alturaValor) {
        altura = alturaValor; 
    }

    public void calcAreaBase() {
        areaBase = base * base;  
    }

    public void calcAreaLateral() {
        double apotema = Math.sqrt(altura * altura + Math.pow(base / 2, 2));
        areaLateral = 2 * base * apotema;
    }

    public void calcAreaTotal() {
        calcAreaBase();
        calcAreaLateral();
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
        return areaTotal;
    }
}

