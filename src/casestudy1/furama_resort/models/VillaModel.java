package casestudy1.furama_resort.models;

public class VillaModel extends FacitilyModel{
    private String room;
    private Double poolArea;
    private int numberOfFloors;

    public VillaModel() {
    }

    public VillaModel(String room, double poolArea, int numberOfFloors) {
        this.room = room;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public VillaModel(String facitilyID, String name, Double area, Double price, int amount, String rentalType, String room,double poolArea, int numberOfFloors) {
        super(facitilyID, name, area, price, amount, rentalType);
        this.room = room;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "VillaModel{" + super.toString() +
                "room='" + room + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine()+COMMA+this.room+COMMA+this.poolArea+COMMA+this.numberOfFloors;
    }
}
