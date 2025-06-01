package br.edu.FormasGeometricasEspaciais;

public class Piramide extends figuraEspacial{
	private double lado;
	private double ladoBase;
	private double altura;

    public Piramide() {
    	lado = 10;
    	ladoBase = 10;
    	altura = 10;
    	
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