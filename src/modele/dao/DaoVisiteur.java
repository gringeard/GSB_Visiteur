/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class DaoVisiteur {
    
    /**
     * Extraction d'un visiteur, sur son identifiant
     * @param idVisiteur identifiant
     * @return objet Visiteur
     * @throws SQLException 
     */
    public static Visiteur selectOne(String idVisiteur) throws SQLException {
        Visiteur unVisiteur = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM ADRESSE WHERE ID= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, idVisiteur);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String id = rs.getString("VIS_MATRICULE");
            String nom = rs.getString("VIS_NOM");
            String prenom = rs.getString("Vis_PRENOM");
            String adresse = rs.getString("VIS_ADRESSE");
            String cp = rs.getString("VIS_CP");
            String ville = rs.getString("VIS_VILLE");
            Date dateEmb = rs.getDate("VIS_DATEEMBAUCHE");
            String secCode = rs.getString("SEC_CODE");
            String labCode = rs.getString("LAB_CODE");
            
            unVisiteur = new Visiteur(id, nom, prenom, adresse, cp, ville, dateEmb, secCode, labCode);
        }
        return unVisiteur;
    }
    
}
