package br.edu.principal;
import br.edu.FormasGeometricasEspaciais.*;

public class Principal {

    public static void main(String[] args) {
        double recebeVolume;

        System.out.println("Cubo");
        Cubo fg1 = new Cubo();
        fg1.recebeLado(4);
        fg1.calcVolume();
        fg1.mostrarVolume();
        recebeVolume = fg1.mostrarVolumeComRetorno();
        System.out.println("Volume do Cubo com Retorno: " + recebeVolume);
        System.out.println();

        System.out.println("Esfera");
        Esfera fg2 = new Esfera();
        fg2.recebeRaio(5);
        fg2.calcVolume();
        fg2.mostrarVolume();
        recebeVolume = fg2.mostrarVolumeComRetorno();
        System.out.println("Volume da Esfera com Retorno: " + recebeVolume);
        System.out.println();

        System.out.println("Cilindro");
        Cilindro fg3 = new Cilindro();
        fg3.recebeRaio(3);
        fg3.recebeAltura(7);
        fg3.calcVolume();
        fg3.mostrarVolume();
        recebeVolume = fg3.mostrarVolumeComRetorno();
        System.out.println("Volume do Cilindro com Retorno: " + recebeVolume);
        System.out.println();

        System.out.println("Cone");
        Cone fg4 = new Cone();
        fg4.recebeRaio(3);
        fg4.recebeAltura(6);
        fg4.calcVolume();
        fg4.mostrarVolume();
        recebeVolume = fg4.mostrarVolumeComRetorno();
        System.out.println("Volume do Cone com Retorno: " + recebeVolume);
        System.out.println();

        System.out.println("Pirâmide");
        Piramide fg5 = new Piramide();
        fg5.recebeBase(6);
        fg5.recebeAltura(8);
        fg5.calcAreaTotal();
        fg5.mostrarAreaBase();
        fg5.mostrarAreaLateral();
        fg5.mostrarAreaTotal();
        System.out.println();

        System.out.println("Paralelepípedo");
        Paralelepipedo fg6 = new Paralelepipedo();
        fg6.recebeLargura(4);
        fg6.recebeComprimento(6);
        fg6.recebeAltura(3);
        fg6.calcVolume();
        fg6.mostrarVolume();
        recebeVolume = fg6.mostrarVolumeComRetorno();
        System.out.println("Volume do Paralelepípedo com Retorno: " + recebeVolume);
        System.out.println();

        System.out.println("Prisma");
        Prisma fg7 = new Prisma();
        fg7.recebeLargura(9);
        fg7.recebeComprimento(5);
        fg7.recebeAltura(10);
        fg7.calcVolume();
        fg7.mostrarVolume();
        recebeVolume = fg7.mostrarVolumeComRetorno();
        System.out.println("Volume do Prisma com Retorno: " + recebeVolume);
        System.out.println();

        System.out.println("Tetraedro");
        Tetraedro fg8 = new Tetraedro();
        fg8.recebeAresta(6);
        fg8.calcVolume();
        fg8.mostrarVolume();
        recebeVolume = fg8.mostrarVolumeComRetorno();
        System.out.println("Volume do Tetraedro com Retorno: " + recebeVolume);
        System.out.println();
    }
}
