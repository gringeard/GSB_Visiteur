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
import modele.metier.Secteur;

/**
 *
 * @author btssio
 */
public class DaoSecteur {
    
    public static Secteur selectOneById(String code) throws SQLException {
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        
        // préparer la requête
        String requete = "SELECT * FROM SECTEUR WHERE SEC_CODE = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, code);
        rs = pstmt.executeQuery();
        Secteur unSecteur = null;
        if (rs.next()) {
            String id = rs.getString("SEC_CODE");
            String libelle = rs.getString("SEC_LIBELLE");
            
            unSecteur = new Secteur(id, libelle);
        }
        return unSecteur;
    }
    
}
