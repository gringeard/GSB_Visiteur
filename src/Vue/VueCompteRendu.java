/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author latatiasteph
 */
public class VueCompteRendu extends javax.swing.JFrame {

    private DefaultComboBoxModel modeleComboBoxVisiteur;
    private DefaultComboBoxModel modeleComboBoxPraticien;
    /**
     * Creates new form RapportsVisite
     */
    public VueCompteRendu() {
        initComponents();
        this.setSize(625, 430);
        this.setLocationRelativeTo(null);
        modeleComboBoxVisiteur = new DefaultComboBoxModel();
        jComboBoxVisiteur.setModel(modeleComboBoxVisiteur);
        modeleComboBoxPraticien = new DefaultComboBoxModel();
        jComboBoxCompteRenduPraticien.setModel(modeleComboBoxPraticien);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxTableau = new javax.swing.JComboBox();
        jTextFieldTitreRapportVisite = new javax.swing.JTextField();
        jLabelRapportsVisiteNumeroRapport = new javax.swing.JLabel();
        jLabelRapportsVisitePraticien = new javax.swing.JLabel();
        jLabelRapportsVisiteDateRapport = new javax.swing.JLabel();
        jLabelRapportsVisiteMotifVisite = new javax.swing.JLabel();
        jLabelRapportsVisiteBilan = new javax.swing.JLabel();
        jComboBoxCompteRenduPraticien = new javax.swing.JComboBox<String>();
        jButtonCompteRenduDetails = new javax.swing.JButton();
        jTextFieldCompteRenduMotifVisite = new javax.swing.JTextField();
        jButtonCompteRenduPrécédent = new javax.swing.JButton();
        jButtonCompteRenduSuivant = new javax.swing.JButton();
        jButtonCompteRenduNouveau = new javax.swing.JButton();
        jTextFieldCompteRenduNumeroRapport = new javax.swing.JTextField();
        jButtonCompteRenduFermer = new javax.swing.JButton();
        jLabelVisiteur = new javax.swing.JLabel();
        jComboBoxVisiteur = new javax.swing.JComboBox();
        jButtonAjouter = new javax.swing.JButton();
        jDateChooserDateRapport = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaBilan = new javax.swing.JTextArea();
        jLabelRapportsVisiteLogo = new javax.swing.JLabel();

        jComboBoxTableau.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldTitreRapportVisite.setEditable(false);
        jTextFieldTitreRapportVisite.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextFieldTitreRapportVisite.setForeground(new java.awt.Color(51, 51, 153));
        jTextFieldTitreRapportVisite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitreRapportVisite.setText("RAPPORTS DE VISITE");
        getContentPane().add(jTextFieldTitreRapportVisite, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 570, -1));

        jLabelRapportsVisiteNumeroRapport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisiteNumeroRapport.setForeground(new java.awt.Color(160, 160, 160));
        jLabelRapportsVisiteNumeroRapport.setText("NumeroRapport");
        getContentPane().add(jLabelRapportsVisiteNumeroRapport, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabelRapportsVisitePraticien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisitePraticien.setForeground(new java.awt.Color(51, 51, 153));
        jLabelRapportsVisitePraticien.setText("Praticien");
        getContentPane().add(jLabelRapportsVisitePraticien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabelRapportsVisiteDateRapport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisiteDateRapport.setForeground(new java.awt.Color(51, 51, 153));
        jLabelRapportsVisiteDateRapport.setText("Date Rapport");
        getContentPane().add(jLabelRapportsVisiteDateRapport, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabelRapportsVisiteMotifVisite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisiteMotifVisite.setForeground(new java.awt.Color(51, 51, 153));
        jLabelRapportsVisiteMotifVisite.setText("Motif Visite");
        getContentPane().add(jLabelRapportsVisiteMotifVisite, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabelRapportsVisiteBilan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRapportsVisiteBilan.setForeground(new java.awt.Color(51, 51, 153));
        jLabelRapportsVisiteBilan.setText("BILAN");
        getContentPane().add(jLabelRapportsVisiteBilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jComboBoxCompteRenduPraticien.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCompteRenduPraticien.setEnabled(false);
        getContentPane().add(jComboBoxCompteRenduPraticien, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, -1));

        jButtonCompteRenduDetails.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonCompteRenduDetails.setForeground(new java.awt.Color(51, 51, 153));
        jButtonCompteRenduDetails.setText("Détails");
        getContentPane().add(jButtonCompteRenduDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jTextFieldCompteRenduMotifVisite.setEditable(false);
        getContentPane().add(jTextFieldCompteRenduMotifVisite, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, -1));

        jButtonCompteRenduPrécédent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCompteRenduPrécédent.setForeground(new java.awt.Color(51, 51, 153));
        jButtonCompteRenduPrécédent.setText("Précédent");
        getContentPane().add(jButtonCompteRenduPrécédent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jButtonCompteRenduSuivant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCompteRenduSuivant.setForeground(new java.awt.Color(51, 51, 153));
        jButtonCompteRenduSuivant.setText("Suivant");
        getContentPane().add(jButtonCompteRenduSuivant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jButtonCompteRenduNouveau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCompteRenduNouveau.setForeground(new java.awt.Color(51, 51, 153));
        jButtonCompteRenduNouveau.setText("Nouveau");
        getContentPane().add(jButtonCompteRenduNouveau, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jTextFieldCompteRenduNumeroRapport.setEditable(false);
        jTextFieldCompteRenduNumeroRapport.setForeground(new java.awt.Color(160, 160, 160));
        jTextFieldCompteRenduNumeroRapport.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCompteRenduNumeroRapport.setText("(NuméroAuto)");
        getContentPane().add(jTextFieldCompteRenduNumeroRapport, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));

        jButtonCompteRenduFermer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCompteRenduFermer.setForeground(new java.awt.Color(51, 51, 153));
        jButtonCompteRenduFermer.setText("Fermer");
        getContentPane().add(jButtonCompteRenduFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabelVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jLabelVisiteur.setText("Visiteur");
        getContentPane().add(jLabelVisiteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jComboBoxVisiteur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxVisiteur.setNextFocusableComponent(jLabelRapportsVisiteLogo);
        getContentPane().add(jComboBoxVisiteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, -1));

        jButtonAjouter.setForeground(new java.awt.Color(51, 51, 153));
        jButtonAjouter.setText("Ajouter");
        jButtonAjouter.setEnabled(false);
        getContentPane().add(jButtonAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));
        getContentPane().add(jDateChooserDateRapport, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, -1));

        jTextAreaBilan.setColumns(20);
        jTextAreaBilan.setRows(5);
        jScrollPane2.setViewportView(jTextAreaBilan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 240, -1));

        jLabelRapportsVisiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/gsb.png"))); // NOI18N
        getContentPane().add(jLabelRapportsVisiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 390));

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
            java.util.logging.Logger.getLogger(VueCompteRendu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueCompteRendu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueCompteRendu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueCompteRendu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueCompteRendu().setVisible(true);
            }
        });
    }

    public JButton getjButtonCompteRenduDetails() {
        return jButtonCompteRenduDetails;
    }

    public JButton getjButtonCompteRenduFermer() {
        return jButtonCompteRenduFermer;
    }

    public JButton getjButtonCompteRenduNouveau() {
        return jButtonCompteRenduNouveau;
    }

    public JButton getjButtonCompteRenduPrécédent() {
        return jButtonCompteRenduPrécédent;
    }

    public JButton getjButtonCompteRenduSuivant() {
        return jButtonCompteRenduSuivant;
    }

    public JButton getjButtonAjouter() {
        return jButtonAjouter;
    }

    public void setjButtonAjouter(JButton jButtonAjouter) {
        this.jButtonAjouter = jButtonAjouter;
    }
    
    public JComboBox<String> getjComboBoxCompteRenduPraticien() {
        return jComboBoxCompteRenduPraticien;
    }

    public JComboBox getjComboBoxVisiteur() {
        return jComboBoxVisiteur;
    }

    public void setjComboBoxVisiteur(JComboBox jComboBoxVisiteur) {
        this.jComboBoxCompteRenduPraticien = jComboBoxVisiteur;
    }

    public JTextArea getjTextAreaBilan() {
        return jTextAreaBilan;
    }

    public JTextField getjTextFieldCompteRenduMotifVisite() {
        return jTextFieldCompteRenduMotifVisite;
    }

    public JTextField getjTextFieldCompteRenduNumeroRapport() {
        return jTextFieldCompteRenduNumeroRapport;
    }

    public JTextField getjTextFieldTitreCompteRendu() {
        return jTextFieldTitreRapportVisite;
    }

    public DefaultComboBoxModel getModeleComboBoxVisiteur() {
        return modeleComboBoxVisiteur;
    }

    public void setModeleComboBoxVisiteur(DefaultComboBoxModel modeleComboBoxVisiteur) {
        this.modeleComboBoxVisiteur = modeleComboBoxVisiteur;
    }

    public DefaultComboBoxModel getModeleComboBoxPraticien() {
        return modeleComboBoxPraticien;
    }

    public void setModeleComboBoxPraticien(DefaultComboBoxModel modeleComboBoxPraticien) {
        this.modeleComboBoxPraticien = modeleComboBoxPraticien;
    }

    public JDateChooser getjDateChooserDateRapport() {
        return jDateChooserDateRapport;
    }

    public void setjDateChooserDateRapport(JDateChooser jDateChooserDateRapport) {
        this.jDateChooserDateRapport = jDateChooserDateRapport;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAjouter;
    private javax.swing.JButton jButtonCompteRenduDetails;
    private javax.swing.JButton jButtonCompteRenduFermer;
    private javax.swing.JButton jButtonCompteRenduNouveau;
    private javax.swing.JButton jButtonCompteRenduPrécédent;
    private javax.swing.JButton jButtonCompteRenduSuivant;
    private javax.swing.JComboBox<String> jComboBoxCompteRenduPraticien;
    private javax.swing.JComboBox jComboBoxTableau;
    private javax.swing.JComboBox jComboBoxVisiteur;
    private com.toedter.calendar.JDateChooser jDateChooserDateRapport;
    private javax.swing.JLabel jLabelRapportsVisiteBilan;
    private javax.swing.JLabel jLabelRapportsVisiteDateRapport;
    private javax.swing.JLabel jLabelRapportsVisiteLogo;
    private javax.swing.JLabel jLabelRapportsVisiteMotifVisite;
    private javax.swing.JLabel jLabelRapportsVisiteNumeroRapport;
    private javax.swing.JLabel jLabelRapportsVisitePraticien;
    private javax.swing.JLabel jLabelVisiteur;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaBilan;
    private javax.swing.JTextField jTextFieldCompteRenduMotifVisite;
    private javax.swing.JTextField jTextFieldCompteRenduNumeroRapport;
    private javax.swing.JTextField jTextFieldTitreRapportVisite;
    // End of variables declaration//GEN-END:variables
}
