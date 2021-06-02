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
public class Quotes {
    private int id;
    private String quoteOfTheDay;
    
    public Quotes( int id, String quoteOfTheDay){
        this.id = id;
        this.quoteOfTheDay = quoteOfTheDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuoteOfTheDay() {
        return quoteOfTheDay;
    }

    public void setQuoteOfTheDay(String quoteOfTheDay) {
        this.quoteOfTheDay = quoteOfTheDay;
    }
    
}
