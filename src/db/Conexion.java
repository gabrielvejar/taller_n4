/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gabriel
 */
public class Conexion {
    public static Connection conect;

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Conexion() {
    }
    public static Connection conectar(){
        if (conect==null){
             String url= "jdbc:oracle:thin:@MSP-PM-04-07.aws.smartcloud.cl:1521:xe";
             String user="usuario07";
             String pass="usuario07";
             System.out.println("Proceso de Conexión...");
             
             try {
                 conect= DriverManager.getConnection(url, user, pass);
                 System.out.println("Base de datos Conectada!!");
                 
             }catch (SQLException e) {
                 System.out.println(e.getMessage());
                 e.printStackTrace();    
             }  
        }
        return conect;
    }    
}
