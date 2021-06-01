/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsdevresearchassignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author katie.pijohn
 */
public class SystemsDevResearchAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Connection conn = DBConnection.Connect();
            String sql = "SELECT * from tblUser";
            
            PreparedStatement pStatement = conn.prepareStatement(sql);
            
            ResultSet rs = pStatement.executeQuery();
            int count = 0;
            
            while(rs.next()){
                System.out.println("id: " +rs.getString("id"));
                System.out.println("Username: " +rs.getString("Username"));
                System.out.println("Role: " +rs.getString("Role"));
                
                count ++;
            }
             System.out.println("-----------------------------------------");
             System.out.println("Total number of Users: " +count);
        }
        catch (Exception e){
            System.out.println("Error: " + e);
            
        }
    }
    
}
