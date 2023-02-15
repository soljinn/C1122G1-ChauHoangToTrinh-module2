package casestudy1.furama_resort.utils.UserException;

import casestudy1.furama_resort.models.CustomerModel;
import casestudy1.furama_resort.models.FacilityModel;
import casestudy1.furama_resort.models.RoomModel;
import casestudy1.furama_resort.models.VillaModel;
import casestudy1.furama_resort.services.impl.CustomerServiceImpl;
import casestudy1.furama_resort.services.impl.FacilityServiceImpl;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteCustomer;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteFileRoom;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteFileVilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookingInfoUtil {
    private static final Scanner scanner = new Scanner(System.in);
    public static final String PATH_CUSTOMER ="D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\customer.csv";
    public static final String PATH_VILLA = "D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\villa.csv";
    public static final String PATH_ROOM = "D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\room.csv";
    public static String getCustomerId(){
        new CustomerServiceImpl().displayCustomer();
        List<CustomerModel> customerModelList = ReadWriteCustomer.readFile(PATH_CUSTOMER);
        System.out.println("Enter customer code: ");
        String customerID;
        do {
            customerID = scanner.nextLine();
            for (CustomerModel customer: customerModelList) {
                if (customerID.equals(customer.getCustomerID())){
                    return customerID;
                }
            }
            System.out.println("Customer code does not exist, please re-enter");
        }while (true);
    }
    public static String getServiceIDBooking(){
        new FacilityServiceImpl().displayFacility();
        Map<VillaModel, Integer> villaList = ReadWriteFileVilla.readFileVilla(PATH_VILLA);
        Map<RoomModel, Integer> roomList = ReadWriteFileRoom.readFileRoom(PATH_ROOM);
        System.out.println("Enter service code: ");
        String serviceID;
        do {
            serviceID = scanner.nextLine();
            for (FacilityModel villa: villaList.keySet()) {
                if (serviceID.equals(villa.getFicitilyID())){
                    villaList.put((VillaModel) villa,villaList.get(villa) + 1);
                    ReadWriteFileVilla.writeFileVilla(PATH_VILLA,villaList);
                    if (villaList.get(villa) + 1 > 4){
                        System.out.println("The facility needs a maintenance check!");
                    }
                    return serviceID;
                }
            }
            for (FacilityModel room: roomList.keySet()) {
                if (serviceID.equals(room.getFicitilyID())){
                    roomList.put((RoomModel) room,roomList.get(room)+1);
                    ReadWriteFileRoom.writeFileRoom(PATH_ROOM,roomList);
                    if (roomList.get(room)+1>4){
                        System.out.println("The facility needs a maintenance check!");
                    }
                    return serviceID;
                }
            }
            System.out.println("Service code does not exist. Please re-enter!");
        }while (true);
    }
}
