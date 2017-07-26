package pl.sda.inheritance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle extends AbstractEntity {

    @Column(name="name")
    protected String name;
}
