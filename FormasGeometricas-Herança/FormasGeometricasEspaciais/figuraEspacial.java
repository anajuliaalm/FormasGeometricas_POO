package br.edu.FormasGeometricasEspaciais;

public abstract class figuraEspacial {
	protected double altura;
	protected double diagonal;
	protected double area;
	protected double areaBase;
	protected double areaTotalBase;
	protected double areaLateral;
	protected double areaTotal;
	protected double volume;
	
	public void mostrarArea() {
        System.out.println("Área: " + area);
    } public void mostrarAreaBase() {
        System.out.println("Área da Base: " + areaBase);
    } public void mostrarAreaTotalBase() {
        System.out.println("Área Total da Base: " + areaTotalBase);
    } public void mostrarAreaLateral() {
        System.out.println("Área Lateral: " + areaLateral);
    } public void mostrarAreaTotal() {
        System.out.println("Área Total: " + areaTotal);
    } public void mostrarVolume() {
        System.out.println("Volume: " + volume);
    } public double getArea() {
    	System.out.println("Área da base com retorno: " + area);
        return areaBase;
    } public double getAreaBase() {
    	System.out.println("Área da base com retorno: " + areaBase);
        return areaBase;
    } public double getAreaTotalBase() {
    	System.out.println("Área Total da base com retorno: " + areaTotalBase);
        return areaTotalBase;
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
    public abstract void calcAltura();
    public abstract void calcDiagonal();
    public abstract void calcAreaTotalBase();
    public abstract void calcArea();
    public abstract void calcAreaTotal();
    public abstract void calcVolume();
}