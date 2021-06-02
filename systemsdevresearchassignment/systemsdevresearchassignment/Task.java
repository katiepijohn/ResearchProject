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
public class Task {
    private int id;
    private String task;
    private int taskcost;
    private int projectID;
    private int assignedResearcher;
    
        public Task(int id, String task, int taskcost, int projectID, int assignedResearcher) {
        this.id = id;
        this.task = task;
        this.taskcost = taskcost;
        this.projectID = projectID;
        this.assignedResearcher = assignedResearcher;

    }

    public int getAssignedResearcher() {
        return assignedResearcher;
    }

    public void setAssignedResearcher(int assignedResearcher) {
        this.assignedResearcher = assignedResearcher;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getTaskcost() {
        return taskcost;
    }

    public void setTaskcost(int taskcost) {
        this.taskcost = taskcost;
    }

}
