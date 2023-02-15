package casestudy1.furama_resort.services.impl;

import casestudy1.furama_resort.models.FacilityModel;
import casestudy1.furama_resort.models.RoomModel;
import casestudy1.furama_resort.models.VillaModel;
import casestudy1.furama_resort.services.IFacilityService;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteFileRoom;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteFileVilla;
import casestudy1.furama_resort.utils.Regex.Regex;
import casestudy1.furama_resort.utils.UserException.ExceptionCondition;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    Scanner scanner = new Scanner(System.in);
    private final String PATH_ROOM = "D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\room.csv";
    public static final String PATH_VILLA = "D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\villa.csv";
    private Regex regex = new Regex();
    private ExceptionCondition exceptionCondition = new ExceptionCondition();
    public void writeFileRoom(Map<RoomModel, Integer> roomModelIntegerMap){
        ReadWriteFileRoom.writeFileRoom(PATH_ROOM,roomModelIntegerMap);
    }
    public void writeFileVilla(Map<VillaModel, Integer> villaModelIntegerMap){
        ReadWriteFileVilla.writeFileVilla(PATH_VILLA, villaModelIntegerMap);
    }
    @Override
    public void displayFacility() {
        Map<FacilityModel, Integer> readFileFacility = new LinkedHashMap<>();
        Map<RoomModel, Integer> roomModelIntegerMap = ReadWriteFileRoom.readFileRoom(PATH_ROOM);
        readFileFacility.putAll(roomModelIntegerMap);
        Map<VillaModel, Integer> villaModelIntegerMap = ReadWriteFileVilla.readFileVilla(PATH_VILLA);
        readFileFacility.putAll(villaModelIntegerMap);
        for (Map.Entry<FacilityModel, Integer> facilityMap : readFileFacility.entrySet()) {
            System.out.println(facilityMap.getKey().toString() + " , " + facilityMap.getValue());
        }
    }

    @Override
    public void displayFacilityMaintenance() {
        Map<FacilityModel, Integer> readFileFacility = new LinkedHashMap<>();
        Map<RoomModel, Integer> roomModelIntegerMap = ReadWriteFileRoom.readFileRoom(PATH_ROOM);
        readFileFacility.putAll(roomModelIntegerMap);
        Map<VillaModel, Integer> villaModelIntegerMap = ReadWriteFileVilla.readFileVilla(PATH_VILLA);
        readFileFacility.putAll(villaModelIntegerMap);
        for (Map.Entry<FacilityModel, Integer> facilityMap : readFileFacility.entrySet()) {
            if (facilityMap.getValue() >= 5){
                System.out.println(facilityMap.getKey().toString()+ " , "+facilityMap.getValue());
            }
        }
    }

    @Override
    public void addRoom() {
        Map<RoomModel, Integer> roomModelIntegerMap = ReadWriteFileRoom.readFileRoom(PATH_ROOM);
        RoomModel roomModel = new RoomModel();
        System.out.println("Please add new information:");
        System.out.println("Service code: ");
        roomModel.setFicitilyID(regex.roomInfo());
        System.out.println("service name: ");
        roomModel.setName(regex.nameInfo());
        System.out.println("Usable area: ");
        roomModel.setArea(exceptionCondition.areaInfo());
        System.out.println("Rental costs: ");
        roomModel.setPrice(exceptionCondition.rentInf());
        System.out.println("Maximum number of people: ");
        roomModel.setAmount(exceptionCondition.numberOfPeople());
        System.out.println("Rental type: ");
        roomModel.setRentalType(scanner.nextLine());
        System.out.println("Free service included: ");
        roomModel.setFreeService(scanner.nextLine());
        roomModelIntegerMap.put(roomModel,0);
        writeFileRoom(roomModelIntegerMap);
    }

    @Override
    public void addVilla() {
        Map<VillaModel, Integer> villaModelIntegerMap = ReadWriteFileVilla.readFileVilla(PATH_VILLA);
        VillaModel villaModel = new VillaModel();
        System.out.println("Please add new information: ");
        System.out.println("Service code: ");
        villaModel.setFicitilyID(regex.villaInfo());
        System.out.println("service name: ");
        villaModel.setName(regex.nameInfo());
        System.out.println("Usable area: ");
        villaModel.setArea(exceptionCondition.areaInfo());
        System.out.println("Rental costs: ");
        villaModel.setPrice(exceptionCondition.rentInf());
        System.out.println("Maximum number of people: ");
        villaModel.setAmount(exceptionCondition.numberOfPeople());
        System.out.println("Rental type: ");
        villaModel.setRentalType(scanner.nextLine());
        System.out.println("Room standard: ");
        villaModel.setRoom(regex.nameInfo());
        System.out.println("Pool area: ");
        villaModel.setPoolArea(exceptionCondition.areaInfo());
        System.out.println("number of floors: ");
        villaModel.setNumberOfFloors(exceptionCondition.numberOF());
        villaModelIntegerMap.put(villaModel,0);
        writeFileVilla(villaModelIntegerMap);
    }
}

