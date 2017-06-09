package cinema.business.entities;

import java.util.Calendar;

public class Order {
    private Integer id = null;
    private float price = 0;
    private Calendar date = null;
    private Customer customer = null;
    private Cinema cinema = null;
    private Movie movie = null;
    private Seat seat = null;
    
    public Order() {
        super();
    }

    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public float getPrice() {
    	return this.price;
    }
    public void setPrice(float price) {
    	this.price = price;
    }

    public Calendar getDate() {
        return this.date;
    }
    public void setDate(final Calendar date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public Cinema getCinema() {
        return this.cinema;
    }
    public void setCinema(final Cinema cinema) {
        this.cinema = cinema;
    }
    

    public Movie getMovie() {
        return this.movie;
    }
    public void setMovie(final Movie movie) {
        this.movie = movie;
    }

    public Seat getSeat() {
        return this.seat;
    }
    public void setSeat(final Seat seat) {
        this.seat = seat;
    }

}
