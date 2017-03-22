/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class DaoTypePraticien {
    
    public static TypePraticien selectOneById(String type_code) throws SQLException {
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        
        // préparer la requête
        String requete = "SELECT * FROM TYPE_PRATICIEN WHERE TYP_CODE = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, type_code);
        rs = pstmt.executeQuery();
        TypePraticien unTypePraticien = null;
        if (rs.next()) {
            String type_praticien_code = rs.getString("TYP_CODE");
            String type_praticien_libelle = rs.getString("TYP_LIBELLE");
            String type_praticien_lieu = rs.getString("TYP_LIEU");
            
            unTypePraticien = new TypePraticien(type_praticien_code, type_praticien_libelle, type_praticien_lieu);
        }
        pstmt.close();
        rs.close();
        return unTypePraticien;
    }
    
}
