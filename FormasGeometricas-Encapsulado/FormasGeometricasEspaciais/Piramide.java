package br.edu.FormasGeometricasEspaciais;

public class Piramide {
	private double lado;
    private double ladoBase;
    private double altura;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Piramide() {
    	lado = 10;
    	ladoBase = 10;
    	altura = 10;
    	areaBase = 0;
    	areaLateral = 0;
    	areaTotal = 0;
    	volume = 0;
    	
    } public void setLado(double pLado) {
    	lado = lado;
    } public double getLado() {
    	return lado;
    } public void setLadoBase(double pLadoBase) {
    	ladoBase = ladoBase;
    } public double getLadoBase() {
    	return ladoBase;
    } public void setAltura(double pAltura) {
    	altura = altura;
    } public double getAltura() {
    	return altura;
    } public void calcAreaBase() {
    	areaBase = lado * lado;
    } public void calcAreaLateral() {
    	areaLateral = 4 * (ladoBase * altura) / 2;
    } public void calcAreaTotal() {
    	areaTotal = areaBase + areaLateral;
    } public void calcVolume() {
    	volume = (1 / 3) * areaBase * altura;
    } public void mostrarAreaBase() {
        System.out.println("Área da Base: " + areaBase);
    } public void mostrarAreaLateral() {
        System.out.println("Área Lateral: " + areaLateral);
    } public void mostrarAreaTotal() {
        System.out.println("Área Total: " + areaTotal);
    } public void mostrarVolume() {
        System.out.println("Volume: " + volume);
    } public double getAreaBase() {
    	System.out.println("Área da base com retorno: " + areaBase);
        return areaBase;
    } public double getAreaLateral() {
    	System.out.println("Área Lateral com retorno: " + areaLateral);
        return areaLateral;
    } public double getAreaTotal() {
    	System.out.println("Área Total com retorno: " + areaTotal);
        return areaTotal;
    } public double getVolume() {
    	System.out.println("Volume com retorno: " + volume);
        return volume;
    }
}