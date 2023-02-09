package casestudy1.furama_resort.models;

public class BookingModel {
    private int bookingID;
    private String startDay;
    private String endDay;
    private int customerID;
    private String serviceName;

    public BookingModel() {
    }

    public BookingModel(int bookingID, String startDay, String endDay, int customerID, String serviceName) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerID = customerID;
        this.serviceName = serviceName;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "BookingModel{" +
                "bookingID=" + bookingID +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerID=" + customerID +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
