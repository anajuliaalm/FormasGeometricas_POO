package br.edu.FormasGeometricasEspaciais;

public class Cubo extends figuraEspacial {
    private double aresta;
    
    public Cubo() {
        aresta = 10; 
        
    } public void setAresta(double pAresta) {
		aresta = aresta;
	} public double getAresta() {
		return aresta;
	} public void calcAreaBase() {
		areaBase = aresta * aresta;
	} public void calcAreaLateral() {
		areaLateral = 4 * (aresta * aresta);
	} public void calcAreaTotal() {
		areaTotal = 6 * (aresta * aresta);
	} public void calcVolume() {
		volume = aresta * aresta * aresta;
	} public void calcArea() {
		area = area;
	} public void calcDiagonal() {
		diagonal = diagonal;
	} public void calcAreaTotalBase() {
		areaTotalBase = areaTotalBase;
	} public void calcAlturaa() {
		altura = altura;
	}
}