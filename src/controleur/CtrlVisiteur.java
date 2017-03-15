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
    
    public CtrlVisiteur(VueVisiteurs vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
//        this.vue.getjComboBoxChercherVisiteur().addActionListener(this);
        this.vue.getjButtonValiderNomVisiteur().addActionListener(this);
        this.vue.getjButtonFermerVisiteur().addActionListener(this);
        this.vue.getjButtonPrécédentVisiteur().addActionListener(this);
        this.vue.getjButtonSuivantVisiteur().addActionListener(this);
       // préparer l'état iniitial de la vue
//        rechercherUnVisiteur();
        rechercherTousVisiteur();
    }

//    private void rechercherUnVisiteur() {
//        List<Adresse> lesAdresses = null;
//        try {
//            lesAdresses = DaoAdresse.selectAllByVille(extraitVille);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(getVue(), "CtrlLesAdresses - échec de sélection des adresses");
//        }
//        afficherLesAdresses(lesAdresses);
//    }


    private void rechercherTousVisiteur() {
        List<Visiteur> lesVisiteurs = null;
        try {
            lesVisiteurs = DaoVisiteur.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesVisiteurs - échec de sélection des visiteurs");
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        ctrlPrincipal.gotoMenu();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    private void afficherLesVisiteurs(List<Visiteur> lesVisiteurs) {
        for (Visiteur unVisiteur :  lesVisiteurs){
            getVue().getModeleComboBoxVisiteur().addElement(unVisiteur);
        }
        String test = getVue().getModeleComboBoxVisiteur().toString();
        //VueVisiteurs.setjComboBoxChercherVisiteur(jComboBoxChercherVisiteur);
        
    }
    
    private void quitter(){
        ctrlPrincipal.gotoMenu();
    }
    
    private void afficherVisiteur(Visiteur leVisiteur) {
        getVue().getjTextFieldNomVisiteur().setText(leVisiteur.getVis_nom());
        getVue().getjTextFieldPrenomVisiteur().setText(leVisiteur.getVis_prenom());
        getVue().getjTextFieldAdresseVisiteur().setText(leVisiteur.getVis_adresse());
        getVue().getjTextFieldCodePostalVisiteur().setText(leVisiteur.getVis_cp());
        getVue().getjTextFieldVilleVisiteur().setText(leVisiteur.getVis_ville());
        if(leVisiteur.getSecteur() != null) {
            getVue().getjTextFieldSecteurVisiteur().setText(leVisiteur.getSecteur().getSec_libelle());
        }
        if(leVisiteur.getLaboratoire() != null){
            getVue().getjTextFieldLaboVisiteur().setText(leVisiteur.getLaboratoire().getLab_nom());
        }
    }
    
    private void selectionnerVisiteurSuivant() {
        Visiteur visiteurSuivant;
        int index;
        index = getVue().getjComboBoxChercherVisiteur().getSelectedIndex();
        if(getVue().getjComboBoxChercherVisiteur().getItemCount() == (index + 1)){
            index = 0;
        } else {
            index += 1;
        }      
        visiteurSuivant = (Visiteur) getVue().getModeleComboBoxVisiteur().getElementAt(index);
        getVue().getjComboBoxChercherVisiteur().setSelectedIndex(index);
        afficherVisiteur(visiteurSuivant);
    }
    
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
    
