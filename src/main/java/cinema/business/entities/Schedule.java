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
@Table(name = "Schedule")
public class Schedule {
    private Integer scheduleId = null;
    private Integer cinemaId = null;
    private Integer movieId = null;
    private Date date = null;
    private Time time = null;
    private Integer roomID = null;
    private Integer row = null;
    private Integer column = null;
    private Float price = null;
     
    public Schedule() {
        super();
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ScheduleId")
    public Integer getScheduleId() {
        return this.scheduleId;
    }
    public void setScheduleId(final Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Column(name = "CinemaId")
    public Integer getCinemaId() {
        return this.cinemaId;
    }
    public void setCinemaId(final Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    @Column(name = "MovieId")
    public Integer getMovieId() {
        return this.movieId;
    }
    public void setMovieId(final Integer movieId) {
        this.movieId = movieId;
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

    @Column(name = "Room")
    public Integer getRoomID() {
        return this.roomID;
    }
    public void setRoomID(final Integer roomID) {
        this.roomID = roomID;
    }

    @Column(name = "RowNum")
    public Integer getRow() {
        return this.row;
    }
    public void setRow(final Integer row) {
        this.row = row;
    }

    @Column(name = "ColNum")
    public Integer getColumn() {
        return this.column;
    }
    public void setColumn(final Integer column) {
        this.column = column;
    }

    @Column(name = "Price")
    public Float getPrice() {
        return this.price;
    }
    public void setPrice(final Float price) {
        this.price = price;
    }

}
