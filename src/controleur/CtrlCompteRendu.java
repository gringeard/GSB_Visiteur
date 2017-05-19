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
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.dao.DaoPraticien;
import modele.dao.DaoRapport;
import modele.dao.DaoVisiteur;
import modele.metier.Praticien;
import modele.metier.Rapport;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class CtrlCompteRendu implements WindowListener, ActionListener{
    
    public static int index_compte_rendu;
    private VueCompteRendu vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;
    
    public CtrlCompteRendu(VueCompteRendu vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        this.vue.getjComboBoxVisiteur().addActionListener(this);
        this.vue.getjButtonCompteRenduDetails().addActionListener(this);
        this.vue.getjButtonCompteRenduFermer().addActionListener(this);
        this.vue.getjButtonCompteRenduNouveau().addActionListener(this);
        this.vue.getjButtonCompteRenduPrécédent().addActionListener(this);
        this.vue.getjButtonCompteRenduSuivant().addActionListener(this);
        this.vue.getjButtonAjouter().addActionListener(this);
        this.vue.getjComboBoxCompteRenduPraticien().addActionListener(this);
        this.vue.getjTextFieldCompteRenduMotifVisite().addActionListener(this);
        this.vue.getjTextFieldCompteRenduNumeroRapport().addActionListener(this);
        this.vue.getjTextFieldTitreCompteRendu().addActionListener(this);
        // préparer l'état iniitial de la vue
        index_compte_rendu = 0;
        rechercherTousVisiteur();
        rechercherTousPraticien();
        try {
            afficherCompteRendu((Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void rechercherTousPraticien() {
        List<Praticien> lesPraticiens = null;
        try {
            lesPraticiens = DaoPraticien.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesVisiteurs - échec de sélection des visiteurs");
        }
        afficherLesPraticiens(lesPraticiens);
    }
    
    private void rechercherTousVisiteur() {
        List<Visiteur> lesVisiteurs2 = null;
        try {
             lesVisiteurs2 = DaoVisiteur.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesVisiteurs - échec de sélection des visiteurs");
        }
        afficherLesVisiteurs(lesVisiteurs2);
    }

        /**
     * fonction permettant d'ajouter les praticiens entrés en paramètre dans la liste déroulante de la vue Praticien
     * 
     * @param lesPraticiens 
     */
    private void afficherLesPraticiens(List<Praticien> lesPraticiens) {
        //Pour chaque Praticien, on l'ajoute à la liste déroulante
        for (Praticien unPraticien :  lesPraticiens){
            getVue().getModeleComboBoxPraticien().addElement(unPraticien);
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
    
    public VueCompteRendu getVue() {
        return vue;
    }
    
    
    public void setVue(VueCompteRendu vue) {
        this.vue = vue;
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
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vue.getjButtonCompteRenduFermer())){
            quitter();
        }
        if (e.getSource().equals(vue.getjComboBoxVisiteur())){
            Visiteur visiteur = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
            //réinitialisation de l'index
            index_compte_rendu = 0;
            try {
                afficherCompteRendu(visiteur);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(vue.getjButtonCompteRenduSuivant())){
            Visiteur visiteur = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
            try {
                compteRenduSuivant(visiteur);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(vue.getjButtonCompteRenduPrécédent())){
            Visiteur visiteur = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
            try {
                compteRenduPrecedant(visiteur);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(vue.getjButtonCompteRenduNouveau())){
            nouveauCompteRendu();
        }
        if (e.getSource().equals(vue.getjButtonAjouter())){
            try {
                ajouterCompteRendu();
            } catch (ParseException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void quitter() {
        ctrlPrincipal.gotoMenu();
    }
     
    
    private void afficherCompteRendu(Visiteur visiteur) throws SQLException {
        List<Rapport> rapport_list = DaoRapport.selectAllByVisiteur(visiteur);
        int rapport_list_size = rapport_list.size();
        //le booléan permettra de lancer la fonction nouveauCompteRendu si on est arrivé
        //au bout de la liste des comptes rendus
        boolean isMax = false;
        if (index_compte_rendu > (rapport_list_size - 1)){
            //l'index prend la valeur max 
            index_compte_rendu = rapport_list_size;
            isMax = true;
        }
        else if (index_compte_rendu < 0){
            index_compte_rendu = 0;
        }
        if (!isMax) {
            Rapport le_rapport = rapport_list.get(index_compte_rendu);
            Praticien le_praticien = le_rapport.getPra_num();
            getVue().getjTextFieldCompteRenduNumeroRapport().setText("" + le_rapport.getRap_num());
            getVue().getModeleComboBoxPraticien().setSelectedItem(le_praticien);
            String str_date = le_rapport.getRap_date().toString();
            getVue().getjTextFieldCompteRenduMotifVisite().setText(le_rapport.getRap_motif());
            getVue().getjTextAreaBilan().setText(le_rapport.getRap_bilan());
            Calendar cal1 = GregorianCalendar.getInstance();
            cal1.setTime(le_rapport.getRap_date());
            getVue().getjDateChooserDateRapport().setCalendar(cal1);
            
            
            getVue().getjButtonAjouter().setEnabled(false);
            getVue().getjComboBoxCompteRenduPraticien().setEnabled(false);
            getVue().getjTextFieldCompteRenduMotifVisite().setEditable(false);
            getVue().getjTextAreaBilan().setEditable(false);
            getVue().getjDateChooserDateRapport().setEnabled(false);
        } else {
            nouveauCompteRendu();
        }
        
    }
    
    private void compteRenduSuivant(Visiteur visiteur) throws SQLException{
        index_compte_rendu += 1;
        afficherCompteRendu(visiteur);
    }
    
    private void compteRenduPrecedant(Visiteur visiteur) throws SQLException{
        index_compte_rendu -= 1;
        afficherCompteRendu(visiteur);
    }
    
    private void nouveauCompteRendu(){
        getVue().getjTextFieldCompteRenduNumeroRapport().setText("(numéroAuto)");
        getVue().getjTextFieldCompteRenduMotifVisite().setText("");
        getVue().getjTextAreaBilan().setText("");
        getVue().getjDateChooserDateRapport().setCalendar(null);
        getVue().getjButtonAjouter().setEnabled(true);
        getVue().getjComboBoxCompteRenduPraticien().setEnabled(true);
        getVue().getjTextFieldCompteRenduMotifVisite().setEditable(true);
        getVue().getjTextAreaBilan().setEditable(true);
        getVue().getjDateChooserDateRapport().setEnabled(true);
    }
    
    private void ajouterCompteRendu() throws ParseException{
        Visiteur visiteur = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
        Praticien praticien = (Praticien) getVue().getModeleComboBoxPraticien().getSelectedItem();
        Date date = getVue().getjDateChooserDateRapport().getCalendar().getTime();
        String motif = getVue().getjTextFieldCompteRenduMotifVisite().getText();
        String bilan = getVue().getjTextAreaBilan().getText();
        int id = 0;
        try {
            id = DaoRapport.selectMaxId() + 1;
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
        }
        Rapport compteRendu = new Rapport(visiteur, id, praticien, date, bilan, motif);
        try {
            DaoRapport.insert(compteRendu);
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            afficherCompteRendu(visiteur);
        } catch (SQLException ex) {
            Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
