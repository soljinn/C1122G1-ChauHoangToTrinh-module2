package casestudy1.furama_resort.models;

public class CustomerModel {
    private int customerID;
    private String typeCustomer;
    private String address;

    public CustomerModel() {
    }

    public CustomerModel(int customerID, String typeCustomer, String address) {
        this.customerID = customerID;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "customerID=" + customerID +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
