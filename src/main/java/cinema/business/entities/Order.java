package cinema.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Time;
import java.sql.Date;


@Entity
@Table(name = "OrderList")
public class Order {
    private Integer id = null;
    private float price = 0;
    private Integer customer = null;
    private Integer cinema = null;
    private Date date = null;
    private Time time = null;
    private Integer movie = null;
    private Integer room = null;
    private Integer row = null;
    private Integer col = null;
    
    public Order() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrderId")
    public Integer getId() {
        return this.id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    
    @Column(name = "Price")
    public float getPrice() {
    	return this.price;
    }
    public void setPrice(float price) {
    	this.price = price;
    }

    @Column(name = "Date")
    public Date getDate() {
        return this.date;
    }
    public void setDate(final Date date) {
        this.date = date;
    }

    @Column(name = "Time")
    public Time getTime() {
        return this.time;
    }
    public void setTime(final Time time) {
        this.time = time;
    }

    @Column(name = "UserId")
    public Integer getCustomer() {
        return this.customer;
    }
    public void setCustomer(final Integer customer) {
        this.customer = customer;
    }

    @Column(name = "CinemaId")
    public Integer getCinema() {
        return this.cinema;
    }
    public void setCinema(final Integer cinema) {
        this.cinema = cinema;
    }

    @Column(name = "MovieId")
    public Integer getMovie() {
        return this.movie;
    }
    public void setMovie(final Integer movie) {
        this.movie = movie;
    }

    @Column(name = "Room")
    public Integer getRoom() {
        return this.room;
    }
    public void setRoom(final Integer room) {
        this.room = room;
    }

    @Column(name = "Row")
    public Integer getRow() {
        return this.row;
    }
    public void setRow(final Integer row) {
        this.row = row;
    }

    @Column(name = "Col")
    public Integer getCol() {
        return this.col;
    }
    public void setCol(final Integer col) {
        this.col = col;
    }

}
