package br.edu.FormasGeometricasEspaciais;

public class Prisma {

    private double comprimento;
    private double largura;
    private double altura;
    private double areaBase;
    private double areaLateral;
    private double areaTotal;
    private double volume;

    public Prisma() {
        comprimento = 0;
        largura = 0;
        altura = 0;
        areaBase = 0;
        areaLateral = 0;
        areaTotal = 0;
        volume = 0;
    }
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double novoComprimento) {
        comprimento = novoComprimento;
        calcularAreasEVolume();
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double novaLargura) {
        largura = novaLargura;
        calcularAreasEVolume();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double novaAltura) {
        altura = novaAltura;
        calcularAreasEVolume();
    }

    public double getAreaBase() {
        return areaBase;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public double getVolume() {
        return volume;
    }

    private void calcAreaBase() {
        areaBase = comprimento * largura;
    }

    private void calcAreaLateral() {
        double perimetroBase = 2 * (comprimento + largura);
        areaLateral = perimetroBase * altura;
    }

    private void calcAreaTotal() {
        areaTotal = 2 * areaBase + areaLateral;
    }

    private void calcVolume() {
        volume = areaBase * altura;
    }

    private void calcularAreasEVolume() {
        calcAreaBase();
        calcAreaLateral();
        calcAreaTotal();
        calcVolume();
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
