package cinema.business.entities;

public class Movie {
    private Integer id = null;
    private String name = null;
    private String picurl = null;
    private String description = null;
    
    public Movie() {
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

    public String getPicurl() {
        return this.picurl;
    }
    public void setPicurl(final String picurl) {
        this.picurl = picurl;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(final String description) {
        this.description = description;
    }
}
