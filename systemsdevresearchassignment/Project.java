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
public class Project {
    private int id;
    private String name;
    private int totalcost;
    private String notes;
    private String assignedResearcher;

    public Project(int id, String name, int totalcost, String notes, String assignedResearcher ) {
        this.id = id;
        this.name = name;
        this.totalcost = totalcost;
        this.notes = notes;
        this.assignedResearcher = assignedResearcher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getTotalCost() {
    return totalcost;
    }

    public void setTotalCost(int totalcost) {
    this.totalcost = totalcost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAssignedResearcher() {
        return assignedResearcher;
    }

    public void setAssignedResearcher(String assignedResearcher) {
        this.assignedResearcher = assignedResearcher;
    }
        
}

