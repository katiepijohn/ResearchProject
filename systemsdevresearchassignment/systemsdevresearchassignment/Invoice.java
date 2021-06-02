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
public class Invoice {
    
    private int id;
    private int totalcost;
    private int amountPaid;
    private int amountOwed;
    private int projectID;
    
    public Invoice(int id, int totalcost, int amountPaid, int amountOwed, int projectID){
        this.id = id;
        this.totalcost = totalcost;
        this.amountPaid = amountPaid;
        this.amountOwed = amountOwed;
        this.projectID = projectID;
    
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(int totalcost) {
        this.totalcost = totalcost;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(int amountOwed) {
        this.amountOwed = amountOwed;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }
}
