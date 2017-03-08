/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsb_visiteurs2;

import Vue.VueVisiteurs;
import controleur.CtrlPrincipal;
import controleur.CtrlVisiteur;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.dao.Jdbc;

/**
 *
 * @author btssio
 */
public class GSB_visiteurs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "gsb", "gsb");
       try {
           Jdbc.getInstance().connecter();
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(GSB_visiteurs2.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(GSB_visiteurs2.class.getName()).log(Level.SEVERE, null, ex);
       }
       CtrlPrincipal leControleurPrincipal = new CtrlPrincipal();
       VueVisiteurs laVueVisiteur = new VueVisiteurs();
       CtrlVisiteur leControleurVisiteur = new CtrlVisiteur(laVueVisiteur, leControleurPrincipal);
       leControleurPrincipal.setCtrlVisiteur(leControleurVisiteur);
       
        

        // afficher la vue
        laVueVisiteur.setVisible(true);
    }
    
}
