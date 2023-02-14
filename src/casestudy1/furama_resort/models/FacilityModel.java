package casestudy1.furama_resort.models;

public abstract class FacilityModel {
    private String facilityID;
    private String name;
    private Double area;
    private Double price;
    private int amount;
    private String rentalType;

    public FacilityModel() {
    }

    public FacilityModel(String facitilyID, String name, Double area, Double price, int amount, String rentalType) {
        this.facilityID = facitilyID;
        this.name = name;
        this.area = area;
        this.price = price;
        this.amount = amount;
        this.rentalType = rentalType;
    }

    public String getFicitilyID() {
        return facilityID;
    }

    public void setFicitilyID(String ficitilyID) {
        this.facilityID = ficitilyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "FacilityModel{" +
                "facilityID=" + facilityID +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return this.facilityID+ COMMA + this.name + COMMA + this.area + COMMA + this.price + COMMA + this.amount + COMMA + this.rentalType;
    }
}
