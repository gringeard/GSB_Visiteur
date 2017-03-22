package controleur;

import javax.swing.JOptionPane;

/**
 * 
 * @author btssio
 */
public class CtrlPrincipal {

    CtrlVisiteur ctrlVisiteur;

    /**
     * fonction permettant d'afficher la vue associée au contrôleur Visiteur
     */
    public void afficherVisiteur() {
        this.ctrlVisiteur.getVue().setVisible(true);
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

    /**
     * fonction permettant de retourner le contrôleur Visiteur
     * 
     * @return 
     */
    public CtrlVisiteur getCtrlVisiteur() {
        return ctrlVisiteur;
    }

    /**
     * fonction permettant de modifier le contrôleur Visiteur
     * 
     * @param ctrlVisiteur 
     */
    public void setCtrlVisiteur(CtrlVisiteur ctrlVisiteur) {
        this.ctrlVisiteur = ctrlVisiteur;
    }    

}