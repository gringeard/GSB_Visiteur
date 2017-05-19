/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.metier;

import java.util.Date;
import modele.metier.Praticien;
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class TestPraticien {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Praticien pra,pra1;
        TypePraticien type_pra;
        Date date;
        date = new Date();
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        type_pra = new TypePraticien("MT","Medecin Test","Lieu Test");
        float coef = (float) 1.666;
        pra = new Praticien(1 , "Pra_nom", "Pra_prenom", "8 cours Test", "00000", "TEST",coef,type_pra);
        System.out.println("Nouveau visiteur : "+pra);
        System.out.println("\nTest n°2 : mutateurs");
        pra.setPra_nom("nouveau_nom");
        pra.setPra_ville("TestVille");
        pra.setPra_cp("44000");
        System.out.println("Visiteur modifié : "+pra);
        System.out.println("\nTest n°3 : Visiteur semblable à un visiteur 'null'");
        pra1 = new Praticien(0,null, null, null, null, null, 0, null);
        System.out.println("Sont ils semblables ? " + pra1.equals(pra));
    }
    
    
}
