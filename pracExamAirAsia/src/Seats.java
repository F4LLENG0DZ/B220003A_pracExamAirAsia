public class Seats extends Flight{
    public int seatNumber;
    public String seatClass;
    public boolean availability;

    public int getSeatNumber() {
        return seatNumber;
    }
    public String getSeatClass() {
        return seatClass;
    }
    public boolean isAvailability() {
        return availability;
    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber;
    }
    public void setSeatClass() {
        this.seatClass = seatClass;
    }

}
