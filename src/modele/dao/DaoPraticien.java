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
import java.util.List;
import modele.metier.Laboratoire;
import modele.metier.Praticien;
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class DaoPraticien {
    
    public static Praticien selectOneById(int num_pra) throws SQLException {
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        
        // préparer la requête
        String requete = "SELECT * FROM PRATICIEN WHERE PRA_NUM = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        String str_num_pra = Integer.toString(num_pra);
        pstmt.setString(1, str_num_pra);
        rs = pstmt.executeQuery();
        Praticien unPraticien = null;
        if (rs.next()) {
            int pra_num = rs.getInt("PRA_NUM");
            String pra_nom = rs.getString("PRA_NOM");
            String pra_prenom = rs.getString("PRA_PRENOM");
            String pra_adresse = rs.getString("PRA_ADRESSE");
            String pra_cp = rs.getString("PRA_CP");
            String pra_ville = rs.getString("PRA_VILLE");
            float pra_coefnotoriete = rs.getFloat("PRA_COEFNOTORIETE");
            String type_pra_code = rs.getString("TYP_CODE");
            
            TypePraticien type_pra = DaoTypePraticien.selectOneById(type_pra_code);
            
            
            unPraticien = new Praticien(pra_num,pra_nom,pra_prenom,pra_adresse,pra_cp,pra_ville,pra_coefnotoriete,type_pra);
        }
        pstmt.close();
        rs.close();
        return unPraticien;
    }
    
    public static List<Praticien> selectAll() throws SQLException {
        List<Praticien> lesPraticiens = new ArrayList<Praticien>();
        Praticien unPraticien;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM PRATICIEN";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int pra_num = rs.getInt("PRA_NUM");
            String pra_nom = rs.getString("PRA_NOM");
            String pra_prenom = rs.getString("PRA_PRENOM");
            String pra_adresse = rs.getString("PRA_ADRESSE");
            String pra_cp = rs.getString("PRA_CP");
            String pra_ville = rs.getString("PRA_VILLE");
            float pra_coefnotoriete = rs.getFloat("PRA_COEFNOTORIETE");
            String type_pra_code = rs.getString("TYP_CODE");
            TypePraticien type_pra = DaoTypePraticien.selectOneById(type_pra_code);
            unPraticien = new Praticien(pra_num,pra_nom,pra_prenom,pra_adresse,pra_cp,pra_ville,pra_coefnotoriete,type_pra);
            lesPraticiens.add(unPraticien);
        }
        pstmt.close();
        rs.close();
        return lesPraticiens;
    }
    
}
