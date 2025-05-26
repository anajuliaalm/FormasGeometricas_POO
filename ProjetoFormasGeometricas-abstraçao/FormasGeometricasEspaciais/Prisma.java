package br.edu.FormasGeometricasEspaciais;

public class Prisma {

	// atributos 
    private double comprimento;
    private double largura;
    private double altura;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    // construtor
    public Prisma() {
        comprimento = 0;
        largura = 0;
        altura = 0;
        areaBase = 0;
        areaLateral = 0;
        areaTotal = 0;
        volume = 0;
    }

    public void recebeComprimento(double pComprimento) {
        comprimento = pComprimento;
    }

    public void recebeLargura(double pLargura) {
        largura = pLargura;
    }

    public void recebeAltura(double pAltura) {
        altura = pAltura;
    }

    public void calcAreaBase() {
        areaBase = comprimento * largura;
    }

    public void calcAreaLateral() {
        double perimetroBase = 2 * (comprimento + largura);
        areaLateral = perimetroBase * altura;
    }

    public void calcAreaTotal() {
        areaTotal = 2 * areaBase + areaLateral;
    }

    public void calcVolume() {
        volume = areaBase * altura;
    }

    public void mostrarAreaBase() {
        System.out.println("Área da base do prisma: " + areaBase);
    }

    public void mostrarAreaLateral() {
        System.out.println("Área lateral do prisma: " + areaLateral);
    }

    public void mostrarAreaTotal() {
        System.out.println("Área total do prisma: " + areaTotal);
    }

    public void mostrarVolume() {
        System.out.println("Volume do prisma: " + volume);
    }

    public double mostrarAreaBaseComRetorno() {
        System.out.println("Área da base (com retorno): " + areaBase);
        return areaBase;
    }

    public double mostrarAreaLateralComRetorno() {
        System.out.println("Área lateral (com retorno): " + areaLateral);
        return areaLateral;
    }

    public double mostrarAreaTotalComRetorno() {
        System.out.println("Área total (com retorno): " + areaTotal);
        return areaTotal;
    }

    public double mostrarVolumeComRetorno() {
        System.out.println("Volume (com retorno): " + volume);
        return volume;
    }
}
