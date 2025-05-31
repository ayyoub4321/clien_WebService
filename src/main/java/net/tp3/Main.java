package net.tp3;
import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BanqueService proxy=new BanqueWS().getBanqueServicePort();
        System.out.println("Sonversion Euro To DH = "+proxy.conversionEuroToDH(90.0));
        Compte compte=proxy.getCompte(2);
        System.out.println("id = "+compte.getCode());
        System.out.println("solde = "+compte.getSolde());
        System.out.println("date de creation = "+compte.getDateCreation());
        System.out.println("-------------------");
        List<Compte> comptes=proxy.listComptes();
        comptes.forEach(c -> {
            System.out.println("id = " + compte.getCode());
            System.out.println("solde = " + compte.getSolde());
            System.out.println("date de création = " + compte.getDateCreation());
        });


    }
}