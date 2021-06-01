/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemsdevresearchassignment;

/**
 *
 * @author katie.pijohn
 */
public class Staff {
    private int id;
    private String Username;
    private String Password;
    private String Role;
    
    public Staff(int id, String Username, String Password, String Role){
        this.id = id;
        this.Username = Username;
        this.Password = Password;
        this.Role = Role;
        
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
    
}
