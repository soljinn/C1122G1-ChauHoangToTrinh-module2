package casestudy1.furama_resort.models;

public class VillaModel extends FacitilyModel{
    private String room;
    private String poolArea;
    private String numberOfFloors;

    public VillaModel() {
    }

    public VillaModel(String room, String poolArea, String numberOfFloors) {
        this.room = room;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public VillaModel(int ficitilyID, String name, String area, Double price, int amount, String rentalType, String room, String poolArea, String numberOfFloors) {
        super(ficitilyID, name, area, price, amount, rentalType);
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

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "VillaModel{" +
                "room='" + room + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
}
