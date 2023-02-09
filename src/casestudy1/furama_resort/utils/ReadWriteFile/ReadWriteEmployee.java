package casestudy1.furama_resort.utils.ReadWriteFile;

import casestudy1.furama_resort.models.EmployeeModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployee {
    public static List<EmployeeModel> readFile(String path) {
        List<EmployeeModel> employeeModelList = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                String[] item;
                EmployeeModel employeeModel;

                while ((line = bufferedReader.readLine()) != null) {
                    item = line.split(",");
                    String name = item[0];
                    int dateOfBirt =Integer.parseInt(item[1]);
                    String gender = item[2];
                    String id = item[3];
                    String phoneNumber = item[4];
                    String email = item[5];
                    int idEmployee = Integer.parseInt(item[6]);
                    String levelEmployee = item[7];
                    String positionEmployee = item[8];
                    String salaryEmployee = item[9];
                    employeeModel = new EmployeeModel(name, dateOfBirt, gender, id, phoneNumber, email, idEmployee, levelEmployee, positionEmployee, salaryEmployee);
                    employeeModelList.add(employeeModel);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return employeeModelList;
    }

    public static void writeFile(String path, List<EmployeeModel> employeeModelList) {
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (EmployeeModel employee : employeeModelList) {
                bufferedWriter.write(employee.convertLine());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
