package pl.sda.inheritance.model;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "added", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL", nullable = false, insertable = false)
    protected Date added;

    @Column(name = "modified", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL", nullable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
