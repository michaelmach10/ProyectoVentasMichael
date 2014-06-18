/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alum.fial7
 */
public class ProductoDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    int op;
    public int registrarProducto(int idc, String prod, double pr, int cant){
        sql = "INSERT INTO Producto VALUES (null,'"+prod+"','"+pr+"','"+cant+"','"+idc+"')";
        try{
            cx = Conexion.getConex();
            st = cx.createStatement();        
            op = st.executeUpdate(sql);
            cx.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return op;
    }
}
