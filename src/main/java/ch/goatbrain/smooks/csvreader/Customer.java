/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.goatbrain.smooks.csvreader;

/**
 *
 * @author bazong
 */
public class Customer {

    private String FirstName;
    private String LastName;
    private String City;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    @Override
    public String toString() {
        return "Customer{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", City=" + City + '}';
    }
    
    
}
