/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import modele.dao.DaoRapport;
import modele.dao.Jdbc;
import modele.metier.Rapport;

/**
 *
 * @author btssio
 */
public class testDaoRapport {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
                java.sql.Connection cnx = null;

                test0_Connexion();
                System.out.println("Test0 effectué : connexion\n");
                test1_GetOneRapport();
                System.out.println("Test1 effectué : get one\n");
                test2_GetAll();
                System.out.println("Test2 effectué : get all\n");
        
    }

    private static void test0_Connexion() throws SQLException, ClassNotFoundException {
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "gsb", "gsb");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
        System.out.println(cnx);
    }
    
    private static void test1_GetOneRapport() throws SQLException {
        Rapport test;
        int num_rap = 4;
        test = DaoRapport.selectOneById(num_rap);
        System.out.println(test);
    }
    
    private static void test2_GetAll() throws SQLException {
        List<Rapport> desRapports = DaoRapport.selectAll();
        System.out.println("Les rapports lus : "+desRapports.toString());
    }
    
    
}
