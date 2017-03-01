package test.modele.metier;

import modele.metier.Laboratoire;

/**
 *
 * @author btssio
 */
public class TestLaboratoire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Laboratoire labo,labo1;
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        labo = new Laboratoire("SW","Swiss Kane", "Alain Poutre");
        System.out.println("Nouveau laboratoire : "+labo);
        System.out.println("\nTest n°2 : mutateurs");
        labo.setLab_code("SL");
        labo.setLab_nom("Swiss Lane");
        System.out.println("Laboratoire modifié : "+labo);
        System.out.println("\nTest n°3 : Laboratoire semblable à un laboratoire 'null'");
        labo1 = new Laboratoire(null,null,null);
        System.out.println("Sont ils semblables ? " + labo1.equals(labo));
        
    }
    
}
