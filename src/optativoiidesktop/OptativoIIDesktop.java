/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optativoiidesktop;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lab216 DT
 */
public class OptativoIIDesktop {

    private static String userDB = "postgres";
    private static String passDB = "0000";
    private static String portDB = "5432";
    private static String dataBase = "postgres";
    
    private static String url = "jdbc:postgresql://localhost:5432/"+dataBase;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
             Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, userDB, passDB);
        } catch (SQLException ex) {
            Logger.getLogger(OptativoIIDesktop.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OptativoIIDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
