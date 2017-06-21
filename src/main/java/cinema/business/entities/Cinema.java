package cinema.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cinema")
public class Cinema {

    private Integer id = null;
    private String name = null;
    private String address = null;
    
    public Cinema() {
        super();
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CinemaId")
    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    
    @Column(name = "CinemaName")
    public String getName() {
        return this.name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    @Column(name = "CinemaAddr")
    public String getAddress() {
        return this.address;
    }
    public void setAddress(final String address) {
        this.address = address;
    }

}
