/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modele.metier.Praticien;
import modele.metier.Rapport;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class DaoRapport {
    
    public static Rapport selectOneById(int rap_num) throws SQLException {
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE WHERE RAP_NUM = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        String str_rap_num = Integer.toString(rap_num);
        pstmt.setString(1, str_rap_num);
        rs = pstmt.executeQuery();
        Rapport unRapport = null;
        if (rs.next()) {
            String visit_mat = rs.getString("VIS_MATRICULE");
            int num_rap = rs.getInt("RAP_NUM");
            String pra_num = rs.getString("PRA_NUM");
            Date rap_date = rs.getDate("RAP_DATE");
            String rap_bilan = rs.getString("RAP_BILAN");
            String rap_motif = rs.getString("RAP_MOTIF");
            
            Praticien pra = DaoPraticien.selectOneById(num_rap);
            Visiteur visit = DaoVisiteur.selectOneById(visit_mat);
            unRapport = new Rapport(visit,num_rap,pra,rap_date,rap_bilan,rap_motif);
        }        
        pstmt.close();
        rs.close();
        return unRapport;
    }
    
    /**
     * 
     * @return
     * @throws SQLException 
     */
    public static List<Rapport> selectAll() throws SQLException {
        List<Rapport> lesRapports = new ArrayList<Rapport>();
        Rapport unRapport;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String visit_mat = rs.getString("VIS_MATRICULE");
            int num_rap = rs.getInt("RAP_NUM");
            String pra_num = rs.getString("PRA_NUM");
            Date rap_date = rs.getDate("RAP_DATE");
            String rap_bilan = rs.getString("RAP_BILAN");
            String rap_motif = rs.getString("RAP_MOTIF");
            Praticien pra = DaoPraticien.selectOneById(num_rap);
            Visiteur visit = DaoVisiteur.selectOneById(visit_mat);
            unRapport = new Rapport(visit,num_rap,pra,rap_date,rap_bilan,rap_motif);
            lesRapports.add(unRapport);
        }
        pstmt.close();
        rs.close();
        return lesRapports;
    }

    
    //TO DO
//        public static int insert(int idAdresse, Adresse uneAdresse) throws SQLException {
//        int nb;
//        Jdbc jdbc = Jdbc.getInstance();
//        String requete;
//        ResultSet rs;
//        PreparedStatement pstmt;
//        requete = "INSERT INTO ADRESSE (ID, RUE, CDP , VILLE) VALUES (?, ?, ?, ?)";
//        pstmt = jdbc.getConnexion().prepareStatement(requete);
//        pstmt.setInt(1, idAdresse);
//        pstmt.setString(2, uneAdresse.getRue());
//        pstmt.setString(3, uneAdresse.getCp());
//        pstmt.setString(4, uneAdresse.getVille());
//        nb = pstmt.executeUpdate();
//        return nb;
//    }
    
    /**
     * 
     * @param unVisiteur
     * @return
     * @throws SQLException 
     */
    public static List<Rapport> selectAllByVisiteur(Visiteur unVisiteur) throws SQLException {
        List<Rapport> lesRapports = new ArrayList<Rapport>();
        Rapport unRapport;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE WHERE VIS_MATRICULE = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        String vis_matr = unVisiteur.getVis_matricule();
        pstmt.setString(1, vis_matr);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String visit_mat = rs.getString("VIS_MATRICULE");
            int num_rap = rs.getInt("RAP_NUM");
            String pra_num = rs.getString("PRA_NUM");
            Date rap_date = rs.getDate("RAP_DATE");
            String rap_bilan = rs.getString("RAP_BILAN");
            String rap_motif = rs.getString("RAP_MOTIF");
            Praticien pra = DaoPraticien.selectOneById(num_rap);
            Visiteur visit = DaoVisiteur.selectOneById(visit_mat);
            unRapport = new Rapport(visit,num_rap,pra,rap_date,rap_bilan,rap_motif);
            lesRapports.add(unRapport);
        }
        return lesRapports;
    }
    
}
