package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the CUSTOMERS database table.
 * 
 */
@Entity
@Table(name="Jeux")

public class Jeux {
    private String platform;

    public Jeux(){}
    
    public void setPlatform(String paltform) {
        this.platform=platform;
    } 
    public String getPlatform() {
        return this.platform;
    } 
}
