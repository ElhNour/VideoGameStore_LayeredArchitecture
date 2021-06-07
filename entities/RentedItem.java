package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the CUSTOMERS database table.
 * 
 */
@Entity
@Table(name="RentedItem")

public class RentedItem {

    private int itemID;

    private int customerID;
    
    private Date dueDate;

    public RentedItem(){}

    public void setCustomerID(int id){
        customerID=id;
    }
    public void setItemID(int id){
         itemID=id;
    }
    public void setDueDate(Date date){
        dueDate=date;
    }
    public int getCustomerID(){
        return customerID;
    }
    public int getItemID(){
        return itemID;
    }
    public Date getDueDate(){
        return dueDate;
    }
}
