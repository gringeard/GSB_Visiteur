/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.metier;

import java.util.Date;
import modele.metier.Laboratoire;
import modele.metier.Rapport;
import modele.metier.Praticien;
import modele.metier.Secteur;
import modele.metier.TypePraticien;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class TestRapport {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Visiteur visit;
        Rapport rapport,rapport1;
        Praticien pra;
        Date date;
        Laboratoire labo;
        Secteur sect;
        TypePraticien type_pra;
        date = new Date();
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        type_pra = new TypePraticien("MT","Medecin Test","Lieu Test");
        float coef = (float) 1.666;
        pra = new Praticien(1 , "Pra_nom", "Pra-prenom", "8 cours Test", "00000", "TEST",coef,type_pra);
        labo = new Laboratoire("SW","Swiss Kane", "Alain Poutre");
        sect = new Secteur("M","Marseille");
        visit = new Visiteur("a131" , "Villechalane", "Louis", "8 cours Lafontaine", "29000", "BREST", date, sect, labo);
        rapport = new Rapport(visit,666,pra,date,"Bilan de test","C'est un test");
        System.out.println("Nouveau rapport : "+rapport);
        System.out.println("\nTest n°2 : mutateurs");
        rapport.setRap_bilan("nouveau bilan");
        rapport.setRap_motif("nouveau motif");
        System.out.println("rapport modifié : "+rapport);
        System.out.println("\nTest n°3 : Visiteur semblable à un visiteur 'null'");
        rapport1 = new Rapport(null, 0, null, null, null,null);
        System.out.println("Sont ils semblables ? " + rapport1.equals(rapport));
    }
    
}
