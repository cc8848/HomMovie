package cinema.business.entities;

public class Cinema {

    private Integer id = null;
    private String name = null;
    private String address = null;
    
    public Cinema() {
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

    public String getAddress() {
        return this.address;
    }
    public void setAddress(final String address) {
        this.address = address;
    }

}
