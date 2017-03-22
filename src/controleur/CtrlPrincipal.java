package controleur;

import javax.swing.JOptionPane;

public class CtrlPrincipal {

    CtrlVisiteur ctrlVisiteur;
    CtrlMenu ctrlMenu;
    CtrlCompteRendu ctrlCompteRendu;

    public boolean isMenuVisible(){
        boolean visible = this.ctrlMenu.getVue().isVisible();
        return visible;
    }
    
    public boolean isCompteRenduVisible(){
        boolean visible = this.ctrlCompteRendu.getVue().isVisible();
        return visible;
    }
    
    public boolean isVisiteurVisible(){
        boolean visible = this.ctrlVisiteur.getVue().isVisible();
        return visible;
    }
    
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
   
    
    public void quitterApplication() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(null, "Quitter l'application\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            System.exit(0);
        }
    }
    
    public void gotoVisiteur() {
        boolean visibility_menu = isMenuVisible();
        boolean visibility_compte_rendu = isCompteRenduVisible();
        if (visibility_menu == true){
            cacherMenu();
        }
        if (visibility_compte_rendu == true){
            cacherCompteRendu();
        }
        afficherVisiteur();
    }
    
    public void gotoCompterendu() {    
        boolean visibility_menu = isMenuVisible();
        boolean visibility_visiteur = isVisiteurVisible();
        if (visibility_menu == true){
            cacherMenu();
        }
        if (visibility_visiteur == true){
            cacherVisiteur();
        }
        afficherCompteRendu();
    }
    
    public void gotoMenu() {    
        boolean visibility_visiteur = isVisiteurVisible();
        boolean visibility_compte_rendu = isCompteRenduVisible();
        if (visibility_visiteur == true){
            cacherVisiteur();
        }
        if (visibility_compte_rendu == true){
            cacherCompteRendu();
        }
        afficherMenu();
    }


    public CtrlVisiteur getCtrlVisiteur() {
        return ctrlVisiteur;
    }
    
    public CtrlMenu getCtrlMenu() {
        return ctrlMenu;
    }

    public void setCtrlVisiteur(CtrlVisiteur ctrlVisiteur) {
        this.ctrlVisiteur = ctrlVisiteur;
    } 
    
    public void setCtrlMenu(CtrlMenu ctrlMenu) {
        this.ctrlMenu = ctrlMenu;
    } 

}