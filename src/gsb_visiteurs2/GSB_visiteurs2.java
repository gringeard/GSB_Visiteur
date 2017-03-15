/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsb_visiteurs2;

import Vue.VueMenu;
import Vue.VueVisiteurs;
import controleur.CtrlMenu;
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
       VueMenu laVueMenu = new VueMenu();
       CtrlVisiteur leControleurVisiteur = new CtrlVisiteur(laVueVisiteur, leControleurPrincipal);
       CtrlMenu leControleurMenu = new CtrlMenu(laVueMenu, leControleurPrincipal);
       leControleurPrincipal.setCtrlVisiteur(leControleurVisiteur);
       leControleurPrincipal.setCtrlMenu(leControleurMenu);
       
        

        // afficher la vue
        laVueMenu.setVisible(true);
    }
    
}
