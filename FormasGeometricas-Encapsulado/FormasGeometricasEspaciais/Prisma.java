package br.edu.FormasGeometricasEspaciais;

public class Prisma {

	private double aresta;
    private double base;
    private double lateral;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Prisma() {
    	aresta = 10;
    	base = 10;
    	lateral = 10;
    	areaBase = 0;
    	areaLateral = 0;
    	areaTotal = 0;
    	volume = 0;
    	
    } public void setAresta(double pAresta) {
    	aresta = aresta;
    } public double getAresta() {
    	return aresta;
    } public void setLateral(double pLateral) {
    	lateral = lateral;
    } public double getLateral() {
    	return lateral;
    } public void setBase(double pBase) {
    	base = base;
    } public double getbase() {
    	return base;
    } public void calcAreaBase() {
    	areaBase = aresta * aresta;
    } public void calcAreaLateral() {
    	areaLateral = 4 * (aresta * base);
    } public void calcAreaTotal() {
    	areaTotal = 2 * (areaBase) + areaLateral;
    } public void calcVolume() {
    	volume = (aresta * aresta) * base;
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