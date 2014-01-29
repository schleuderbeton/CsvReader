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

    private static String csvFields = "firstName,lastName,city";
    private char separatorChar='|';
    private String FirstName;
    private String LastName;
    private String City;

//    public Customer(char separatorChar) {
//        this.separatorChar = separatorChar;
//    }
    
    public static String getCsvFields() {
        return csvFields;
    }

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

    public void removeSpecialCharInContent(){
        FirstName = FirstName.replace("\n", "").replace("\r", "");
        LastName = LastName.replace("\n", "").replace("\r", "");
        City = City.replace("\n", "").replace("\r", "");
    }
    
    public String toCsvString(){
        return FirstName+separatorChar+LastName+separatorChar+City;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", City=" + City + '}';
    }

}
