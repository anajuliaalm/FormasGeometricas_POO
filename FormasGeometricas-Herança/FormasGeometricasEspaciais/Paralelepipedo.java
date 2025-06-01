package br.edu.FormasGeometricasEspaciais;

public class Paralelepipedo extends figuraEspacial{
    private double comprimento;
    private double largura;
    private double altura;

    public Paralelepipedo() {
    	comprimento = 10;
    	largura = 10;
    	altura = 10;
    	
    } public void setComprimento(double pComprimento) {
        comprimento = comprimento;
    } public double getComprimento() {
        return comprimento;
    } public void setLargura(double pLargura) {
        largura = largura;
    } public double getLargura() {
        return largura;
    } public void setAltura(double pAltura) {
        altura = altura;
    } public double getAltura() {
        return altura;
    } public void calcAreaBase() {
    	areaBase = comprimento * largura;
    } public void calcDiagonal() {
    	double diagonal = Math.sqrt((comprimento * comprimento) + (altura * altura) + (largura * largura));
    } public void calcAreaTotal() {
    	areaTotal = 2 * (comprimento * largura + comprimento * altura + largura  * altura);
    } public void calcVolume() {
        volume = comprimento * largura * altura;
    } public void calcAreaTotalBase() {
		areaTotalBase = areaTotalBase;
	} public void calcArea() {
		area = area;
	} public void calcAlturaa() {
		altura = altura;
	}
}