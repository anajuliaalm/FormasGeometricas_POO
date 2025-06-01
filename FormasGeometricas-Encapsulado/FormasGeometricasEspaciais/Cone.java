package br.edu.FormasGeometricasEspaciais;

public class Cone {

	private double raio;
    private double geratriz;
    private double altura;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Cone() {
    	raio = 10;
    	geratriz = 10;
    	altura = 10;
    	areaBase = 0;
    	areaLateral = 0;
    	areaTotal = 0;
    	volume = 0;
    	
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