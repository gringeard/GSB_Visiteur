/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author latatiasteph
 */
public class RapportsVisite extends javax.swing.JFrame {

    /**
     * Creates new form RapportsVisite
     */
    public RapportsVisite() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTitreRapportVisite = new javax.swing.JTextField();
        jLabelRapportsVisiteNumeroRapport = new javax.swing.JLabel();
        jLabelRapportsVisitePraticien = new javax.swing.JLabel();
        jLabelRapportsVisiteDateRapport = new javax.swing.JLabel();
        jLabelRapportsVisiteMotifVisite = new javax.swing.JLabel();
        jLabelRapportsVisiteBilan = new javax.swing.JLabel();
        jComboBoxRapportsVisitePraticien = new javax.swing.JComboBox<>();
        jButtonRapportsVisiteDetails = new javax.swing.JButton();
        jTextFieldRapportsVisiteDateRapport = new javax.swing.JTextField();
        jTextFieldRapportsVisiteMotifVisite = new javax.swing.JTextField();
        jTextFieldRapportsVisiteBilan = new javax.swing.JTextField();
        jButtonRapportsVisitePrécédent = new javax.swing.JButton();
        jButtonRapportsVisiteSuivant = new javax.swing.JButton();
        jButtonRapportsVisiteNouveau = new javax.swing.JButton();
        jTextFieldRapportsVisiteNumeroRapport = new javax.swing.JTextField();
        jButtonRapportsVisiteFermer = new javax.swing.JButton();
        jLabelRapportsVisiteLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextFieldTitreRapportVisite.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextFieldTitreRapportVisite.setForeground(new java.awt.Color(51, 51, 153));
        jTextFieldTitreRapportVisite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitreRapportVisite.setText("RAPPORTS DE VISITE");
        getContentPane().add(jTextFieldTitreRapportVisite);
        jTextFieldTitreRapportVisite.setBounds(10, 11, 570, 28);

        jLabelRapportsVisiteNumeroRapport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisiteNumeroRapport.setForeground(new java.awt.Color(160, 160, 160));
        jLabelRapportsVisiteNumeroRapport.setText("NumeroRapport");
        getContentPane().add(jLabelRapportsVisiteNumeroRapport);
        jLabelRapportsVisiteNumeroRapport.setBounds(10, 50, 98, 15);

        jLabelRapportsVisitePraticien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisitePraticien.setForeground(new java.awt.Color(51, 51, 153));
        jLabelRapportsVisitePraticien.setText("Praticien");
        getContentPane().add(jLabelRapportsVisitePraticien);
        jLabelRapportsVisitePraticien.setBounds(10, 79, 53, 15);

        jLabelRapportsVisiteDateRapport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisiteDateRapport.setForeground(new java.awt.Color(51, 51, 153));
        jLabelRapportsVisiteDateRapport.setText("Date Rapport");
        getContentPane().add(jLabelRapportsVisiteDateRapport);
        jLabelRapportsVisiteDateRapport.setBounds(10, 118, 84, 15);

        jLabelRapportsVisiteMotifVisite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisiteMotifVisite.setForeground(new java.awt.Color(51, 51, 153));
        jLabelRapportsVisiteMotifVisite.setText("Motif Visite");
        getContentPane().add(jLabelRapportsVisiteMotifVisite);
        jLabelRapportsVisiteMotifVisite.setBounds(10, 152, 70, 15);

        jLabelRapportsVisiteBilan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisiteBilan.setForeground(new java.awt.Color(51, 51, 153));
        jLabelRapportsVisiteBilan.setText("BILAN");
        getContentPane().add(jLabelRapportsVisiteBilan);
        jLabelRapportsVisiteBilan.setBounds(10, 210, 37, 15);

        jComboBoxRapportsVisitePraticien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxRapportsVisitePraticien);
        jComboBoxRapportsVisitePraticien.setBounds(121, 77, 150, 20);

        jButtonRapportsVisiteDetails.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonRapportsVisiteDetails.setForeground(new java.awt.Color(51, 51, 153));
        jButtonRapportsVisiteDetails.setText("Détails");
        getContentPane().add(jButtonRapportsVisiteDetails);
        jButtonRapportsVisiteDetails.setBounds(289, 77, 67, 21);
        getContentPane().add(jTextFieldRapportsVisiteDateRapport);
        jTextFieldRapportsVisiteDateRapport.setBounds(121, 116, 75, 20);
        getContentPane().add(jTextFieldRapportsVisiteMotifVisite);
        jTextFieldRapportsVisiteMotifVisite.setBounds(121, 150, 150, 20);
        getContentPane().add(jTextFieldRapportsVisiteBilan);
        jTextFieldRapportsVisiteBilan.setBounds(121, 193, 174, 83);

        jButtonRapportsVisitePrécédent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRapportsVisitePrécédent.setForeground(new java.awt.Color(51, 51, 153));
        jButtonRapportsVisitePrécédent.setText("Précédent");
        getContentPane().add(jButtonRapportsVisitePrécédent);
        jButtonRapportsVisitePrécédent.setBounds(70, 350, 95, 23);

        jButtonRapportsVisiteSuivant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRapportsVisiteSuivant.setForeground(new java.awt.Color(51, 51, 153));
        jButtonRapportsVisiteSuivant.setText("Suivant");
        getContentPane().add(jButtonRapportsVisiteSuivant);
        jButtonRapportsVisiteSuivant.setBounds(170, 350, 79, 23);

        jButtonRapportsVisiteNouveau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRapportsVisiteNouveau.setForeground(new java.awt.Color(51, 51, 153));
        jButtonRapportsVisiteNouveau.setText("Nouveau");
        getContentPane().add(jButtonRapportsVisiteNouveau);
        jButtonRapportsVisiteNouveau.setBounds(260, 350, 85, 23);

        jTextFieldRapportsVisiteNumeroRapport.setEditable(false);
        jTextFieldRapportsVisiteNumeroRapport.setForeground(new java.awt.Color(160, 160, 160));
        jTextFieldRapportsVisiteNumeroRapport.setText("(NuméroAuto)");
        getContentPane().add(jTextFieldRapportsVisiteNumeroRapport);
        jTextFieldRapportsVisiteNumeroRapport.setBounds(120, 50, 74, 20);

        jButtonRapportsVisiteFermer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRapportsVisiteFermer.setForeground(new java.awt.Color(51, 51, 153));
        jButtonRapportsVisiteFermer.setText("Fermer");
        getContentPane().add(jButtonRapportsVisiteFermer);
        jButtonRapportsVisiteFermer.setBounds(500, 350, 73, 23);

        jLabelRapportsVisiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/gh,hgfb.png"))); // NOI18N
        getContentPane().add(jLabelRapportsVisiteLogo);
        jLabelRapportsVisiteLogo.setBounds(0, -20, 630, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RapportsVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RapportsVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RapportsVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RapportsVisite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RapportsVisite().setVisible(true);
            }
        });
    }

    public JButton getjButtonRapportsVisiteDetails() {
        return jButtonRapportsVisiteDetails;
    }

    public JButton getjButtonRapportsVisiteFermer() {
        return jButtonRapportsVisiteFermer;
    }

    public JButton getjButtonRapportsVisiteNouveau() {
        return jButtonRapportsVisiteNouveau;
    }

    public JButton getjButtonRapportsVisitePrécédent() {
        return jButtonRapportsVisitePrécédent;
    }

    public JButton getjButtonRapportsVisiteSuivant() {
        return jButtonRapportsVisiteSuivant;
    }

    public JComboBox<String> getjComboBoxRapportsVisitePraticien() {
        return jComboBoxRapportsVisitePraticien;
    }

    public JTextField getjTextFieldRapportsVisiteBilan() {
        return jTextFieldRapportsVisiteBilan;
    }

    public JTextField getjTextFieldRapportsVisiteDateRapport() {
        return jTextFieldRapportsVisiteDateRapport;
    }

    public JTextField getjTextFieldRapportsVisiteMotifVisite() {
        return jTextFieldRapportsVisiteMotifVisite;
    }

    public JTextField getjTextFieldRapportsVisiteNumeroRapport() {
        return jTextFieldRapportsVisiteNumeroRapport;
    }

    public JTextField getjTextFieldTitreRapportVisite() {
        return jTextFieldTitreRapportVisite;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRapportsVisiteDetails;
    private javax.swing.JButton jButtonRapportsVisiteFermer;
    private javax.swing.JButton jButtonRapportsVisiteNouveau;
    private javax.swing.JButton jButtonRapportsVisitePrécédent;
    private javax.swing.JButton jButtonRapportsVisiteSuivant;
    private javax.swing.JComboBox<String> jComboBoxRapportsVisitePraticien;
    private javax.swing.JLabel jLabelRapportsVisiteBilan;
    private javax.swing.JLabel jLabelRapportsVisiteDateRapport;
    private javax.swing.JLabel jLabelRapportsVisiteLogo;
    private javax.swing.JLabel jLabelRapportsVisiteMotifVisite;
    private javax.swing.JLabel jLabelRapportsVisiteNumeroRapport;
    private javax.swing.JLabel jLabelRapportsVisitePraticien;
    private javax.swing.JTextField jTextFieldRapportsVisiteBilan;
    private javax.swing.JTextField jTextFieldRapportsVisiteDateRapport;
    private javax.swing.JTextField jTextFieldRapportsVisiteMotifVisite;
    private javax.swing.JTextField jTextFieldRapportsVisiteNumeroRapport;
    private javax.swing.JTextField jTextFieldTitreRapportVisite;
    // End of variables declaration//GEN-END:variables
}
