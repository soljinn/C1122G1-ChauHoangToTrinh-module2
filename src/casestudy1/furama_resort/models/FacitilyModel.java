package casestudy1.furama_resort.models;

public class FacitilyModel {
    private int facitilyID;
    private String name;
    private String area;
    private Double price;
    private int amount;
    private String rentalType;

    public FacitilyModel() {
    }

    public FacitilyModel(int ficitilyID, String name, String area, Double price, int amount, String rentalType) {
        this.facitilyID = ficitilyID;
        this.name = name;
        this.area = area;
        this.price = price;
        this.amount = amount;
        this.rentalType = rentalType;
    }

    public int getFicitilyID() {
        return facitilyID;
    }

    public void setFicitilyID(int ficitilyID) {
        this.facitilyID = ficitilyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
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
        return "FacitilyModel{" +
                "facitilyID=" + facitilyID +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
