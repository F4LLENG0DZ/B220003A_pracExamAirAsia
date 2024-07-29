public class Passenger {
    private String name;
    private int age;
    private String gender;
    private String passportID;
    private int contactNo;
    private String country;
    public Reservation reservation;

    //getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getPassportID() {
        return passportID;
    }
    public int getContactNo() {
        return contactNo;
    }
    public String getCountry() {
        return country;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }
    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public Reservation createReservation(Flight flight, Seats seats)
    {
        reservation.addReservation();
    }
}
