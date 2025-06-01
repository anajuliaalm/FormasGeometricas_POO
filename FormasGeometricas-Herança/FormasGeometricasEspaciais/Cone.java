package br.edu.FormasGeometricasEspaciais;

public class Cone extends figuraEspacial{
    private double raio;
    private double geratriz;
    private double altura;

    public Cone() {
    	raio = 10;
    	geratriz = 10;
    	altura = 10;
    	
    } public void setRaio(double pRaio) {
		raio = raio;
	} public double getRaio() {
		return raio;
	}  public void setGeratriz(double pGeratriz) {
		geratriz = geratriz;
	} public double getGeratriz() {
		return geratriz;
	}  public void setAltura(double pAltura) {
		altura = altura;
	} public double getAltura() {
		return altura;
	} public void calcAreaBase() {
		areaBase = Math.PI * (raio * raio);
	} public void calcAreaLateral() {
		areaLateral = Math.PI * raio * geratriz;
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