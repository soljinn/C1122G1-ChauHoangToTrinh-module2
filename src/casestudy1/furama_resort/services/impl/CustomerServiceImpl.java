package casestudy1.furama_resort.services.impl;

import casestudy1.furama_resort.models.CustomerModel;
import casestudy1.furama_resort.services.ICustomerService;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteCustomer;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteEmployee;

import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    final String PATH_CUSTOMER ="D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\customer.csv";
    public void writeFile(List<CustomerModel> customerModels){
        ReadWriteCustomer.writeFile(PATH_CUSTOMER, customerModels);
    }
    @Override
    public void displayCustomer() {
        List<CustomerModel> customerModelList = ReadWriteCustomer.readFile(PATH_CUSTOMER);
        for (CustomerModel customer: customerModelList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        List<CustomerModel> customerModelList = ReadWriteCustomer.readFile(PATH_CUSTOMER);
        CustomerModel customerModel = new CustomerModel();
        System.out.println("Please enter information: ");
        System.out.println("Customer name: ");
        customerModel.setName(scanner.nextLine());
        System.out.println("Day of birth: ");
        customerModel.setDateOfBirth(Integer.parseInt(scanner.nextLine()));
        System.out.println("Gender: ");
        customerModel.setGender(scanner.nextLine());
        System.out.println("Id: ");
        customerModel.setId(scanner.nextLine());
        System.out.println("Phone number: ");
        customerModel.setPhoneNumber(scanner.nextLine());
        System.out.println("Email: ");
        customerModel.setEmail(scanner.nextLine());
        System.out.println("Customer id:");
        customerModel.setCustomerID(Integer.parseInt(scanner.nextLine()));
        System.out.println("Type customer: ");
        customerModel.setTypeCustomer(scanner.nextLine());
        System.out.println("Address: ");
        customerModel.setAddress(scanner.nextLine());
        customerModelList.add(customerModel);
        writeFile(customerModelList);
    }

    @Override
    public void editCustomer() {
        List<CustomerModel> customerModelList = ReadWriteCustomer.readFile(PATH_CUSTOMER);
        System.out.println("enter the customer code you want to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (CustomerModel customer: customerModelList) {
            if (customer.getCustomerID() == id){
                System.out.println("re-enter new customer code: ");
                customer.setCustomerID(Integer.parseInt(scanner.nextLine()));
                System.out.println("re-enter new customer name: ");
                customer.setName(scanner.nextLine());
                System.out.println("re-enter new customer day of birth: ");
                customer.setDateOfBirth(Integer.parseInt(scanner.nextLine()));
                System.out.println("re-enter new customer gender: ");
                customer.setGender(scanner.nextLine());
                System.out.println("re-enter new id: ");
                customer.setId(scanner.nextLine());
                System.out.println("re-enter new customer number phone: ");
                customer.setPhoneNumber(scanner.nextLine());
                System.out.println("re-enter new customer email: ");
                customer.setEmail(scanner.nextLine());
                System.out.println("re-enter new type customer: ");
                customer.setTypeCustomer(scanner.nextLine());
                System.out.println("re-enter new address: ");
                customer.setAddress(scanner.nextLine());
                writeFile(customerModelList);
                System.out.println("fixed successfully!");
            }
        }
    }
}
