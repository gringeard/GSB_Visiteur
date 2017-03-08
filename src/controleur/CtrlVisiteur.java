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
//        this.vue.getjButtonValiderNomVisiteur().addActionListener(this);
//        this.vue.getjButtonFermerVisiteur().addActionListener(this);
//        this.vue.getjButtonPrécédentVisiteur().addActionListener(this);
//        this.vue.getjButtonSuivantVisiteur().addActionListener(this);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void afficherLesVisiteurs(List<Visiteur> lesVisiteurs) {
        JComboBox<String> jComboBoxChercherVisiteur = null;
        String nomPrenom;
        for (Visiteur unVisiteur :  lesVisiteurs){
            nomPrenom = unVisiteur.getVis_nom() + ' ' + unVisiteur.getVis_prenom();
            getVue().getModeleComboBoxVisiteur().addElement(nomPrenom);
        }
        String test = getVue().getModeleComboBoxVisiteur().toString();
        System.out.println(test);
        //VueVisiteurs.setjComboBoxChercherVisiteur(jComboBoxChercherVisiteur);
        
    }

}
    
