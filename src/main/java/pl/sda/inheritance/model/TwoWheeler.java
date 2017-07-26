package pl.sda.inheritance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Adrian on 26.07.2017.
 */
@Entity
@Table(name = "two_wheeler")
public class TwoWheeler extends Vehicle {
    @Column
    private String steeringType;

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
}
