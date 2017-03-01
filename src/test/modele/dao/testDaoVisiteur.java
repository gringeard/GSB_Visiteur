/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.dao;

import java.sql.SQLException;
import modele.dao.Jdbc;

/**
 *
 * @author btssio
 */
public class testDaoVisiteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                java.sql.Connection cnx = null;

                test0_Connexion();
                System.out.println("Test0 effectué : connexion\n");
        
        
    }

    private static void test0_Connexion() {
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "GSB", "gsb");
    }
    
}
