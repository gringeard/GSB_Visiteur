package test.modele.metier;

import java.util.Date;
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
        Date date;
        date = new Date();
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        visit = new Visiteur("a131" , "Villechalane", "Louis", "8 cours Lafontaine", "29000", "BREST", date,"", "Swiss Kane");
        System.out.println(visit);
    }
    
}
