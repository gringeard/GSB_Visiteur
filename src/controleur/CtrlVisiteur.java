/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import Vue.VueVisiteurs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modele.dao.DaoVisiteur;
import modele.metier.Visiteur;
import Vue.VueVisiteurs;
import javax.swing.JComboBox;

/**
 *
 * @author btssio
 */
public class CtrlVisiteur implements WindowListener, ActionListener{
    
    private VueVisiteurs vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;
    
    /**
     * constructeur du contrôleur
     * 
     * @param vue
     * @param ctrl 
     */
    public CtrlVisiteur(VueVisiteurs vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        // le contrôleur écoute les différents boutons de la vue
//        this.vue.getjComboBoxChercherVisiteur().addActionListener(this);
        this.vue.getjButtonValiderNomVisiteur().addActionListener(this);
        this.vue.getjButtonFermerVisiteur().addActionListener(this);
        this.vue.getjButtonPrécédentVisiteur().addActionListener(this);
        this.vue.getjButtonSuivantVisiteur().addActionListener(this);
        // préparer l'état initial de la vue
        rechercherTousVisiteur();
    }

    /**
     * fonction permettant de récupérer tous les visiteurs de la bdd
     */
    private void rechercherTousVisiteur() {
        List<Visiteur> lesVisiteurs = null;
        try {
            lesVisiteurs = DaoVisiteur.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesVisiteurs - échec de sélection des visiteurs");
        }
        // On lance ensuite la fonction d'affichage des visiteurs dans la vue
        afficherLesVisiteurs(lesVisiteurs);
    }

    public VueVisiteurs getVue() {
        return vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    @Override
    public void windowOpened(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        ctrlPrincipal.gotoMenu();
    }

    @Override
    public void windowClosed(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vue.getjButtonFermerVisiteur())){
            quitter();
        }
        if (e.getSource().equals(vue.getjButtonValiderNomVisiteur())){
            Visiteur visiteurSelectionne = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
            afficherVisiteur(visiteurSelectionne);
        }
        if (e.getSource().equals(vue.getjButtonSuivantVisiteur())){
            selectionnerVisiteurSuivant();
        }
        if (e.getSource().equals(vue.getjButtonPrécédentVisiteur())){
            selectionnerVisiteurPrecedent();
        }
    }

    /**
     * fonction permettant d'ajouter les visiteurs entrés en paramètre dans la liste déroulante de la vue Visiteurs
     * 
     * @param lesVisiteurs 
     */
    private void afficherLesVisiteurs(List<Visiteur> lesVisiteurs) {
        //Pour chaque visiteur, on l'ajoute à la liste déroulante
        for (Visiteur unVisiteur :  lesVisiteurs){
            getVue().getModeleComboBoxVisiteur().addElement(unVisiteur);
        }
    }
    
    /**
     * fonction permettant d'appeler la fonction, pour quitter l'application, du contrôleur principal
     */
    private void quitter(){
        ctrlPrincipal.gotoMenu();
    }
    
    /**
     * fonction permettant d'afficher toutes les informations du visiteur en paramètre
     * dans les jTextFields de la vue Visiteurs
     * 
     * @param leVisiteur 
     */
    private void afficherVisiteur(Visiteur leVisiteur) {
        //Chaque ligne modifie le texte du jTextField correspondant avec le nom, prénom, etc...
        getVue().getjTextFieldNomVisiteur().setText(leVisiteur.getVis_nom());
        getVue().getjTextFieldPrenomVisiteur().setText(leVisiteur.getVis_prenom());
        getVue().getjTextFieldAdresseVisiteur().setText(leVisiteur.getVis_adresse());
        getVue().getjTextFieldCodePostalVisiteur().setText(leVisiteur.getVis_cp());
        getVue().getjTextFieldVilleVisiteur().setText(leVisiteur.getVis_ville());
        //Si le visiteur à un secteur, on modifie le text en mettant celui du secteur en question
        if(leVisiteur.getSecteur() != null) {
            getVue().getjTextFieldSecteurVisiteur().setText(leVisiteur.getSecteur().getSec_libelle());
        }
        //idem au secteur
        if(leVisiteur.getLaboratoire() != null){
            getVue().getjTextFieldLaboVisiteur().setText(leVisiteur.getLaboratoire().getLab_nom());
        }
    }
    /**
     * fonction qui permet de récupérer le visiteur suivant celui affiché
     * en le récupérant dans la liste déroulante
     */
    private void selectionnerVisiteurSuivant() {
        Visiteur visiteurSuivant;
        int index;
        //l'index prend la valeur de celui du visiteur sélectionné
        index = getVue().getjComboBoxChercherVisiteur().getSelectedIndex();
        //si l'index est celui du dernier visiteur, l'index prend la valeur du premier
        if(getVue().getjComboBoxChercherVisiteur().getItemCount() == (index + 1)){
            index = 0;
        //sinon on l'incrémente
        } else {
            index += 1;
        }      
        //on récupềre le visiteur correspondant au nouvel index
        visiteurSuivant = (Visiteur) getVue().getModeleComboBoxVisiteur().getElementAt(index);
        //on séléctionne ce visiteur dans la liste déroulante
        getVue().getjComboBoxChercherVisiteur().setSelectedIndex(index);
        //on lance la fonction permettant d'afficher le contenu de ce visiteur
        afficherVisiteur(visiteurSuivant);
    }
    
    /**
     * idem à la fonction selectionnerVisiteurSuivant() mais en décrémentant l'index
     */
    private void selectionnerVisiteurPrecedent() {
        Visiteur visiteurPrecedent;
        int index;
        index = getVue().getjComboBoxChercherVisiteur().getSelectedIndex();
        if(index == 0){
            index = getVue().getjComboBoxChercherVisiteur().getItemCount() - 1;
        } else {
            index -= 1;
        }      
        visiteurPrecedent = (Visiteur) getVue().getModeleComboBoxVisiteur().getElementAt(index);
        getVue().getjComboBoxChercherVisiteur().setSelectedIndex(index);
        afficherVisiteur(visiteurPrecedent);
    }
    
}
    
