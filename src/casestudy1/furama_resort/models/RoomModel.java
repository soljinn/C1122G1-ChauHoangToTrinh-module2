package casestudy1.furama_resort.models;

public class RoomModel extends FacilityModel {
    private String freeService;

    public RoomModel() {
    }

    public RoomModel(String freeService) {
        this.freeService = freeService;
    }

    public RoomModel(String facitilyID, String name, Double area, Double price, int amount, String rentalType, String freeService) {
        super(facitilyID, name, area, price, amount, rentalType);
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
        return "RoomModel{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine() + COMMA + this.freeService;
    }
}
