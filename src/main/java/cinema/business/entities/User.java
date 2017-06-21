package cinema.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class User {

    private Integer id = null;
    private String name = null;
    private String password = null;
    private String phone = null;
    
    public User() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CustomerId")
    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    
    @Column(name = "UserName")
    public String getName() {
        return this.name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    @Column(name = "Password")
    public String getPassword() {
        return this.password;
    }
    public void setPassword(final String password) {
        this.name = password;
    }

    @Column(name = "Phone")
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(final String phone) {
        this.phone = phone;
    }
    
}
