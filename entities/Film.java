package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the CUSTOMERS database table.
 * 
 */
@Entity
@Table(name="Film")

public class Film {
    private String acteur;

    public Film (){
    }
    public void setActor(String acteur) {
        this.acteur=acteur;
    }
    public String getActor() {
       return this.acteur;
    }
}
