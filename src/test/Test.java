/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Vue.RapportsVisite;

/**
 *
 * @author btssio
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RapportsVisite fenetre = new RapportsVisite();
        fenetre.setTitle("Rapports de visite");
        fenetre.setSize(650, 450);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
    }
    
}
