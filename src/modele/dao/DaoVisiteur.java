/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author btssio
 */
public class DaoVisiteur {
    private static Object Jdbc;
    
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
        pstmt.setInt(1, idAdresse);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            int id = rs.getInt("ID");
            String rue = rs.getString("RUE");
            String cdp = rs.getString("CDP");
            String ville = rs.getString("VILLE");
            uneAdresse = new Adresse(id, rue, cdp, ville);
        }
        return uneAdresse;
    }
    
}
