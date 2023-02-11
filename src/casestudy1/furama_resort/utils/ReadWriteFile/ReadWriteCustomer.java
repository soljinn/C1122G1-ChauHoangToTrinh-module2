package casestudy1.furama_resort.utils.ReadWriteFile;

import casestudy1.furama_resort.models.CustomerModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCustomer {
    public static List<CustomerModel> readFile(String path){
        List<CustomerModel> customers = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()){
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                String[] item;
                while ((line = bufferedReader.readLine()) != null){
                    item = line.split(",");
                    String name = item[0];
                    int dateOfBirth = Integer.parseInt(item[1]);
                    String gender = item[2];
                    String id = item[3];
                    String phoneNumber = item[4];
                    String email = item[5];
                    int customerID = Integer.parseInt(item[6]);
                    String typeCustomer = item[7];
                    String address = item[8];
                    CustomerModel customer = new CustomerModel(name,dateOfBirth,gender,id,phoneNumber,email,customerID,typeCustomer,address);
                    customers.add(customer);
                }
            } catch (FileNotFoundException e) {
               e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return customers;
    }
    public static void writeFile(String path, List<CustomerModel> customerModels){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (CustomerModel customer : customerModels) {
                bufferedWriter.write(customer.convertLine());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
