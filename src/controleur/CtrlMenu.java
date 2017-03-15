/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import Vue.VueMenu;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

/**
 *
 * @author btssio
 */
public class CtrlMenu implements WindowListener, ActionListener{
       
    private VueMenu vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;    
    
    public CtrlMenu(VueMenu vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        this.vue.getjButtonQuitter().addActionListener(this);
        this.vue.getjButtonCompteRendu().addActionListener(this);
        this.vue.getjButtonVisiteur().addActionListener(this);
    }
    
    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vue.getjButtonQuitter())){
            quitter();
        }
        if (e.getSource().equals(vue.getjButtonCompteRendu())){
            gotoCompterendu();
        }
        if (e.getSource().equals(vue.getjButtonVisiteur())){
            gotoVisiteur();
        }
    }
    
    private void quitter(){
        ctrlPrincipal.quitterApplication();
    }
    
    private void gotoCompterendu(){
        ctrlPrincipal.gotoCompterendu();
    }
    
    private void gotoVisiteur(){
        ctrlPrincipal.gotoVisiteur();
    }
    
    public VueMenu getVue() {
        return vue;
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
        
}
