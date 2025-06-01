package br.edu.FormasGeometricasEspaciais;

public class Cilindro {

	private double raio;
    private double altura;
    private double areaBase;
    private double areaTotalBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;
    
    public Cilindro() {
    	raio = 10;
    	altura = 10;
    	areaBase = 0;
    	areaTotalBase = 0;
    	areaLateral = 0;
    	areaTotal = 0;
    	volume = 0;
    	
    } public void setRaio(double pRaio) {
		raio = raio;
	} public double getRaio() {
		return raio;
	} public void setAltura(double pAltura) {
		altura = altura;
	} public double getAltura() {
		return altura;
	} public void calcAreaBase() {
		areaBase = Math.PI * (raio * raio);
	} public void calcAreaTotalBase() {
		areaTotalBase = 2 * Math.PI * (raio * raio);
	} public void calcAreaLateral() {
		areaLateral = Math.PI * raio * altura;
	} public void calcAreaTotal() {
		areaTotal = 2 * Math.PI * raio * (raio * altura);
	} public void calcVolume() {
		volume = Math.PI * (raio * raio) * altura;
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
}