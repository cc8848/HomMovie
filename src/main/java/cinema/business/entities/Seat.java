package cinema.business.entities;

public class Seat {

    private Integer roomID = null;
    private Integer row = null;
    private Integer column = null;
    
    public Seat() {
        super();
    }

    public Integer getRoomID() {
        return this.roomID;
    }
    public void setRoomID(final Integer roomID) {
        this.roomID = roomID;
    }

    public Integer getRow() {
        return this.row;
    }
    public void setRow(final Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return this.column;
    }
    public void setColumn(final Integer column) {
        this.column = column;
    }
    

}
