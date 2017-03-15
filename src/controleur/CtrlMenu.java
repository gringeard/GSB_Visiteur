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
        this.vue.getjButtonFermerMenu().addActionListener(this);
        this.vue.getjButtonCompterendu().addActionListener(this);
        this.vue.getjButtonVisiteur().addActionListener(this);
    }
    
    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vue.getjButtonFermerVisiteur())){
            quitter();
        }
        if (e.getSource().equals(vue.getjButtonCompterendu())){
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
        
}
