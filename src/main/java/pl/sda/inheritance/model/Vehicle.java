package pl.sda.inheritance.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Vehicle")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle extends AbstractEntity {



    @Column(name="name")
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
