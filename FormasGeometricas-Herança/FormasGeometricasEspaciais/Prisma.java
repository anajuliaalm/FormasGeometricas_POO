package br.edu.FormasGeometricasEspaciais;


	public class Prisma extends figuraEspacial {
		private double aresta;
		private double base;
		private double lateral;

	    public Prisma() {
	    	aresta = 10;
	    	base = 10;
	    	lateral = 10;
	    	
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
	    } public double getBase() {
	    	return base;
	    } public void calcAreaBase() {
	    	areaBase = aresta * aresta;
	    } public void calcAreaLateral() {
	    	areaLateral = 4 * (aresta * base);
	    } public void calcAreaTotal() {
	    	areaTotal = 2 * (areaBase) + areaLateral;
	    } public void calcVolume() {
	    	volume = (aresta * aresta) * base;
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