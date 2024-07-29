import java.util.ArrayList;
import java.util.Date;

public class Flight {
    //initialize variable so that we can use it later for references.
    public String departure;
    public String arrival;
    Date departureDate;
    Date arrivalDate;
    public ArrayList<Seats> seats;

    public ArrayList<Seats> findAvailableSeats()
    {

    }
    //get info
    public String getDeparture() {
        return departure;
    }
    public String getArrival() {
        return arrival;
    }
    public Date getDepartureDate() {
        return departureDate;
    }
    public Date getArrivalDate() {
        return arrivalDate;
    }

    //set info if we got input.
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}

