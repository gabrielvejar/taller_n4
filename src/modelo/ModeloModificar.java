/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import db.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Daniela
 */
public class ModeloModificar {
    public void modificaProducto(Integer idproducto, String nombreproducto, Integer precio) throws SQLException{
        System.out.println("Modificar producto...");
        Statement dec;
        dec=db.Conexion.createStatement();
        String query1="UPDATE PRODUCTO SET NOMBRE='"+nombreproducto+"' WHERE IDPRODUCTO="+idproducto;
        dec.executeUpdate(query1);
    }


    public void modificaVenta(Integer idventa,String fechacontratacion,String fechaterminopcional,String fechaterminocontrato,Integer tipoventa, Integer valorventa,Integer rut, String idproducto ) throws SQLException{
        System.out.println("Modificar venta...");
        Statement dec;
        dec=db.Conexion.createStatement();
        String query1="UPDATE VENTA SET RUT='"+rut+"' WHERE IDPRODUCTO="+idproducto;
        dec.executeUpdate(query1);
    }

    public void modificaVenta(Integer idventa, String fechacontratacion, String fechaterminopcional, String fechaterminocontrato, Integer tipoventa, Integer valorventa, Integer rut) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
   