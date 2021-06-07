package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the CUSTOMERS database table.
 * 
 */
@Entity
@Table(name="StockItem")

public class StockItem {
    @Id
    private int itemID;

    private String title;

    private int rentalPrice;

    public StockItem(){}

    public void setRentalPrice(int price) {
        this.rentalPrice=price;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public void setItemID(int id) {
        this.itemID=id;
    }
    public int getRentalPrice() {
       return this.rentalPrice;
    }
    public String getTitle() {
        return this.title;
    }
    public int getItemID() {
        return this.itemID;
    }
}
