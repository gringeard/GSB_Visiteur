/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.metier.Laboratoire;

/**
 *
 * @author btssio
 */
public class DaoLaboratoire {
    
    /**
     *
     * @param lab_code
     * @return
     * @throws SQLException 
     */
    public static Laboratoire selectOneById(String lab_code) throws SQLException {
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        
        // préparer la requête
        String requete = "SELECT * FROM LABO WHERE LAB_CODE = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, lab_code);
        rs = pstmt.executeQuery();
        Laboratoire unLaboratoire = null;
        if (rs.next()) {
            String id = rs.getString("LAB_CODE");
            String lab_nom = rs.getString("LAB_NOM");
            String lab_chefvente = rs.getString("LAB_CHEFVENTE");
            
            unLaboratoire = new Laboratoire(id, lab_nom, lab_chefvente);
        }
        pstmt.close();
        rs.close();
        return unLaboratoire;
    }
    
}
