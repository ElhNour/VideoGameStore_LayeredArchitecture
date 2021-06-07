package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the CUSTOMERS database table.
 * 
 */
@Entity
@Table(name="Client")

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int customerID;

    private String name;

    private int accountBalance;    

    public Client(){}

    public void setAccountBalance(int accountBalance) {
        this.accountBalance=accountBalance;
    } 
    public int getAccountBalance() {
        return this.accountBalance;
    } 
    public void setName(String name) {
        this.name=name;
    } 
    public String getName() {
        return this.name;
    } 
    public void setCustomerID(int customerID) {
        this.customerID=customerID;
    } 
    public int getCustomerID() {
        return this.customerID;
    } 
}
