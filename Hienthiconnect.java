/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ketnoi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 84333
 */
public class Hienthiconnect {
    
    private Connection conn;
    private Statement stmt;
    
    public Hienthiconnect() {
        try {
            ConnectSQL myCon = new ConnectSQL();
            conn = myCon.getConnection();
            stmt = conn.createStatement();
        } catch (Exception ex) {

        }
    }
    
    public int Update(String str) {
        try {
            int i = stmt.executeUpdate(str);
            return i;
        } catch (Exception ex) {
            return -1;
        }
    }
    
    //SELECT
    public ResultSet Query(String str) {
        try {
            ResultSet rs = stmt.executeQuery(str);
            return rs;
        } catch (Exception ex) {
            return null;
        }

    }
}
