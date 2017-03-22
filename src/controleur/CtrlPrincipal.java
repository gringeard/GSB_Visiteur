package controleur;

import Vue.VueVisiteurs;
import javax.swing.JOptionPane;

/**
 * 
 * @author btssio
 */
public class CtrlPrincipal {

    CtrlVisiteur ctrlVisiteur;
    CtrlMenu ctrlMenu;
    CtrlCompteRendu ctrlCompteRendu;

    /**
     * fonction permettant d'afficher la vue associée au contrôleur Visiteur
     */
    public void afficherVisiteur() {
        this.ctrlVisiteur.getVue().setVisible(true);
    }
   
    public void afficherMenu() {
        this.ctrlMenu.getVue().setVisible(true);
    }
    
    public void afficherCompteRendu() {
        this.ctrlCompteRendu.getVue().setVisible(true);
    }
    
    public void cacherVisiteur() {
        this.ctrlVisiteur.getVue().setVisible(false);
    }
    
    public void cacherMenu() {
        this.ctrlMenu.getVue().setVisible(false);
    }
    
    public void cacherCompteRendu() {
        this.ctrlCompteRendu.getVue().setVisible(false);
    }
   
    /**
     * fonction permettant de fermer l'application
     */
    public void quitterApplication() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(null, "Quitter l'application\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            System.exit(0);
        }
    }
    
    public void gotoVisiteur() {
        cacherMenu();
        afficherVisiteur();
    }
    
    public void gotoCompterendu() {    
        cacherMenu();
        afficherCompteRendu();
    }
    
    public void gotoMenu() {
        afficherMenu();
        cacherCompteRendu();
        cacherVisiteur();
    }

    /**
     * fonction permettant de retourner le contrôleur Visiteur
     * 
     * @return 
     */
    public CtrlVisiteur getCtrlVisiteur() {
        return ctrlVisiteur;
    }

    public CtrlCompteRendu getCtrlCompteRendu() {
        return ctrlCompteRendu;
    }
    
    public CtrlMenu getCtrlMenu() {
        return ctrlMenu;
    }

    /**
     * fonction permettant de modifier le contrôleur Visiteur
     * 
     * @param ctrlVisiteur 
     */
    public void setCtrlVisiteur(CtrlVisiteur ctrlVisiteur) {
        this.ctrlVisiteur = ctrlVisiteur;
    } 

    public void setCtrlCompteRendu(CtrlCompteRendu ctrlCompteRendu) {
        this.ctrlCompteRendu = ctrlCompteRendu;
    }
    
    public void setCtrlMenu(CtrlMenu ctrlMenu) {
        this.ctrlMenu = ctrlMenu;
    } 

}
