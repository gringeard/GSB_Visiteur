package test.modele.metier;

import modele.metier.Secteur;

/**
 *
 * @author btssio
 */
public class TestSecteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Secteur sect,sect1;
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        sect = new Secteur("M","Marseille");
        System.out.println("Nouveau secteur : "+sect);
        System.out.println("\nTest n°2 : mutateurs");
        sect.setSec_code("T");
        sect.setSec_libelle("Toulouse");
        System.out.println("Secteur modifié : "+sect);
        System.out.println("\nTest n°3 : Secteur semblable à un visiteur 'null'");
        sect1 = new Secteur(null,null);
        System.out.println(sect1.equals(sect));
        
    }
    
}
