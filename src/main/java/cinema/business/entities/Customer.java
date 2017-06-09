package cinema.business.entities;

public class Customer {

    private Integer id = null;
    private String name = null;
    private String password = null;
    
    public Customer() {
        super();
    }


    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    

    public String getName() {
        return this.name;
    }
    public void setName(final String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(final String password) {
        this.name = password;
    }
    
}
