/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import Vue.VueCompteRendu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author btssio
 */
public class CtrlCompteRendu implements WindowListener, ActionListener{
    
    private VueCompteRendu vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;
    
    public CtrlCompteRendu(VueCompteRendu vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
//        this.vue.getjComboBoxChercherVisiteur().addActionListener(this);
        this.vue.getjButtonCompteRenduDetails().addActionListener(this);
        this.vue.getjButtonCompteRenduFermer().addActionListener(this);
        this.vue.getjButtonCompteRenduNouveau().addActionListener(this);
        this.vue.getjButtonCompteRenduPrécédent().addActionListener(this);
        this.vue.getjButtonCompteRenduSuivant().addActionListener(this);
        this.vue.getjComboBoxCompteRenduPraticien().addActionListener(this);
        this.vue.getjTextFieldCompteRenduBilan().addActionListener(this);
        this.vue.getjTextFieldCompteRenduDateRapport().addActionListener(this);
        this.vue.getjTextFieldCompteRenduMotifVisite().addActionListener(this);
        this.vue.getjTextFieldCompteRenduNumeroRapport().addActionListener(this);
        this.vue.getjTextFieldTitreCompteRendu().addActionListener(this);
        // préparer l'état iniitial de la vue
//        rechercherTousPraticien();
    }
    
//    private void rechercherTousPraticien() {
//        List<Praticien> lesVisiteurs = null;
//        try {
//            lesVisiteurs = DaoVisiteur.selectAll();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(getVue(), "CtrlLesVisiteurs - échec de sélection des visiteurs");
//        }
//        afficherLesVisiteurs(lesVisiteurs);
//    }

    public VueCompteRendu getVue() {
        return vue;
    }

    public void setVue(VueCompteRendu vue) {
        this.vue = vue;
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
        if (e.getSource().equals(vue.getjButtonCompteRenduFermer())){
            quitter();
        }
    }

    private void quitter() {
        ctrlPrincipal.gotoMenu();
    }
    
}
