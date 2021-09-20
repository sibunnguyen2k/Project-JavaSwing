/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ketnoi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 84333
 */

public class ConnectSQL {
    
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName + ";sslProtocol=TLSv1.2;";
        System.out.println("ket noi thanh cong");
        System.out.println(url);
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    private final String serverName = "DESKTOP-VF7R4NA";
    private final String dbName = "QL_Banxe";
    private final String portNumber = "1433";
    private final String userID = "QuangVazno";
    private final String password = "NQ0709@";
    
}
