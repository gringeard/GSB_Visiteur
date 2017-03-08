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
import modele.metier.Secteur;
import modele.metier.Laboratoire;
import modele.dao.DaoLaboratoire;
import modele.dao.DaoSecteur;

/**
 *
 * @author btssio
 */
public class DaoVisiteur {
    
    /**
     * Extraction d'un visiteur, sur son identifiant
     * @param matriculeVisiteur identifiant
     * @return objet Visiteur
     * @throws SQLException 
     */
    public static Visiteur selectOneById(String matricule) throws SQLException {
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR WHERE VIS_MATRICULE = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, matricule);
        rs = pstmt.executeQuery();
        Visiteur unVisiteur = null;
        if (rs.next()) {
            String id = rs.getString("VIS_MATRICULE");
            String nom = rs.getString("VIS_NOM");
            String prenom = rs.getString("VIS_PRENOM");
            String adresse = rs.getString("VIS_ADRESSE");
            String cp = rs.getString("VIS_CP");
            String ville = rs.getString("VIS_VILLE");
            Date dateEmb = rs.getDate("VIS_DATEEMBAUCHE");
            String secCode = rs.getString("SEC_CODE");
            String labCode = rs.getString("LAB_CODE");
            
            Laboratoire labo = DaoLaboratoire.selectOneById(labCode);
            Secteur sec = DaoSecteur.selectOneById(secCode);
            unVisiteur = new Visiteur(id, nom, prenom, adresse, cp, ville, dateEmb, sec, labo);
        }
        return unVisiteur;
    }
    
}
