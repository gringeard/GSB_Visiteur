package test.modele.metier;

import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class TestTypePraticien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TypePraticien type_praticien,type_praticien1;
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        type_praticien = new TypePraticien("SW","Swiss Kane", "Alain Poutre");
        System.out.println("Nouveau laboratoire : "+type_praticien);
        System.out.println("\nTest n°2 : mutateurs");
        type_praticien.setType_libelle("Docteur Test");
        type_praticien.setType_lieu("Bâtiment Test");
        System.out.println("Laboratoire modifié : "+type_praticien);
        System.out.println("\nTest n°3 : Laboratoire semblable à un laboratoire 'null'");
        type_praticien1 = new TypePraticien(null,null,null);
        System.out.println("Sont ils semblables ? " + type_praticien1.equals(type_praticien));
        
    }
    
}

