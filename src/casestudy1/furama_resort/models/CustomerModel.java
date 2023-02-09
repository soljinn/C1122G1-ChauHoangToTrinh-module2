package casestudy1.furama_resort.models;

public class CustomerModel extends Person{
    private int customerID;
    private String typeCustomer;
    private String address;

    public CustomerModel() {
    }

    public CustomerModel(String name, int dateOfBirth, String gender, String id,
                         String phoneNumber, String email, int customerID,
                         String typeCustomer, String address) {
        super(name, dateOfBirth, gender, id, phoneNumber, email);
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
        return "CustomerModel{" + super.toString() +
                "customerID=" + customerID +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine() + COMMA + this.customerID + COMMA + this.typeCustomer + COMMA + this.address;
    }
}
