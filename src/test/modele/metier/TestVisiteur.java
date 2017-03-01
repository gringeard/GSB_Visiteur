package test.modele.metier;

import java.util.Date;
import modele.metier.Laboratoire;
import modele.metier.Secteur;
import modele.metier.Visiteur;
        
/**
 *
 * @author btssio
 */
public class TestVisiteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Visiteur visit,visit1;
        Laboratoire labo;
        Secteur sect;
        Date date;
        date = new Date();
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        labo = new Laboratoire("SW","Swiss Kane", "Alain Poutre");
        sect = new Secteur("M","Marseille");
        visit = new Visiteur("a131" , "Villechalane", "Louis", "8 cours Lafontaine", "29000", "BREST", date, sect, labo);
        System.out.println("Nouveau visiteur : "+visit);
        System.out.println("\nTest n°2 : mutateurs");
        visit.setVis_adresse("56 boulevard de la Prairie aux Ducs");
        visit.setVis_cp("44000");
        visit.setVis_ville("Nantes");
        System.out.println("Visiteur modifié : "+visit);
        System.out.println("\nTest n°3 : Visiteur semblable à un visiteur 'null'");
        visit1 = new Visiteur(null,null, null, null, null, null, null, null, null);
        System.out.println("Sont ils semblables ? " + visit1.equals(visit));
    }
    
}
