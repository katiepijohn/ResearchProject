/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsdevresearchassignment;
import java.sql.*;
/**
 *
 * @author katie.pijohn
 */
public class DBConnection {
    public static Connection Connect(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\katie.pijohn\\source\\repos\\SQLiteDB\\test.db");
            return conn;
    }
        catch (Exception e){
            System.out.println("Error: " + e);
            return null;
        }
    }
    
}
