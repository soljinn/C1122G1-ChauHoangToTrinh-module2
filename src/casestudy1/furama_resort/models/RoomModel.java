package casestudy1.furama_resort.models;

public class RoomModel extends FacitilyModel {
    private String freeService;

    public RoomModel() {
    }

    public RoomModel(String freeService) {
        this.freeService = freeService;
    }

    public RoomModel(int ficitilyID, String name, String area, Double price, int amount, String rentalType, String freeService) {
        super(ficitilyID, name, area, price, amount, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "RoomModel{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
