package casestudy1.furama_resort.models;

import java.util.Comparator;
import java.util.Objects;

public class BookingModel implements Comparable<BookingModel> {
    private String bookingID;
    private String startDay;
    private String endDay;
    private int customerID;
    private int serviceID;
    private String serviceName;

    public BookingModel() {
    }

    public BookingModel(String bookingID, String startDay, String endDay, int customerID, int serviceID, String serviceName) {
        this.bookingID = bookingID;
        this.startDay = startDay;
        this.endDay = endDay;
        this.customerID = customerID;
        this.serviceID = serviceID;
        this.serviceName = serviceName;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
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

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
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
                ", serviceID=" + serviceID +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }

    public String convertLine(){
        String COMMA = ",";
        return this.bookingID + COMMA +this.startDay + COMMA + this.endDay + COMMA + this.customerID + COMMA + this.serviceName;
    }

    @Override
    public int compareTo(BookingModel o) {
        return this.bookingID.compareTo(o.bookingID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        BookingModel bookingModel = (BookingModel) obj;
        return bookingModel.equals(bookingModel.bookingID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingID);
    }
}
