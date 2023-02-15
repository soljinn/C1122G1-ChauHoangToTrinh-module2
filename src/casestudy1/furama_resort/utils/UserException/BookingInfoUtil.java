package casestudy1.furama_resort.utils.UserException;

import casestudy1.furama_resort.models.CustomerModel;
import casestudy1.furama_resort.services.impl.CustomerServiceImpl;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingInfoUtil {
    private static final Scanner scanner = new Scanner(System.in);
    public static final String PATH_CUSTOMER ="D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\customer.csv";
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
            System.out.println("");
        }while (true);
    }
}
