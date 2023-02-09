package casestudy1.furama_resort.services.impl;

import casestudy1.furama_resort.models.EmployeeModel;
import casestudy1.furama_resort.services.IEmployeeService;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    final String PATH_EMPLOYEE = "D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\employee.csv";
    public void writeFile(List<EmployeeModel> employeeModelList){
        ReadWriteEmployee.writeFile(PATH_EMPLOYEE,employeeModelList);
    }
    @Override
    public void displayEmployee() {
        List<EmployeeModel> employeeModels = ReadWriteEmployee.readFile(PATH_EMPLOYEE);
        for (EmployeeModel employee: employeeModels) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        List<EmployeeModel> employeeModels = ReadWriteEmployee.readFile(PATH_EMPLOYEE);
        EmployeeModel employeeModel = new EmployeeModel();
        System.out.println("Please enter information: ");
        System.out.println("enter first and last name: ");
        employeeModel.setName(scanner.nextLine());
        System.out.println("Day of birth: ");
        employeeModel.setDateOfBirth(Integer.parseInt(scanner.nextLine()));
        System.out.println("Gender: ");
        employeeModel.setGender(scanner.nextLine());
        System.out.println("Enter id: ");
        employeeModel.setId(scanner.nextLine());
        System.out.println("Phone Number: ");
        employeeModel.setPhoneNumber(scanner.nextLine());
        System.out.println("Email: ");
        employeeModel.setEmail(scanner.nextLine());
        System.out.println("Id employee");
        employeeModel.setIdEmployee(Integer.parseInt(scanner.nextLine()));
        System.out.println("Level: ");
        employeeModel.setLevelEmployee(scanner.nextLine());
        System.out.println("Position: ");
        employeeModel.setPositionEmployee(scanner.nextLine());
        System.out.println("Salary: ");
        employeeModel.setSalaryEmployee(scanner.nextLine());
        employeeModels.add(employeeModel);
        writeFile(employeeModels);
    }

    @Override
    public void deleteEmployee() {
        List<EmployeeModel> employeeModels = ReadWriteEmployee.readFile(PATH_EMPLOYEE);
        System.out.println("Enter the code to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        EmployeeModel employeeModel = null;
        for (EmployeeModel employee: employeeModels) {
            if (employee.getIdEmployee() == id){
                employeeModel = employee;
                break;
            }
        }
        if (employeeModel != null){
            employeeModels.remove(employeeModel);
            System.out.println("Delete successfully!");
            writeFile(employeeModels);
        }
        System.out.println("Employee code not found!");
    }

    @Override
    public void editEmployee() {
        List<EmployeeModel> employeeModels = ReadWriteEmployee.readFile(PATH_EMPLOYEE);
        System.out.println("Enter the member code you need to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (EmployeeModel employee : employeeModels) {
            if (employee.getIdEmployee() == id){
                System.out.println("Enter new employee code: ");
                employee.setIdEmployee(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter new name: ");
                employee.setName(scanner.nextLine());
                System.out.println("Enter new day of birth: ");
                employee.setDateOfBirth(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter new gender: ");
                employee.setGender(scanner.nextLine());
                System.out.println("Enter phone number: ");
                employee.setPhoneNumber(scanner.nextLine());
                System.out.println("Enter new email: ");
                employee.setEmail(scanner.nextLine());
                System.out.println("Enter new id: ");
                employee.setId(scanner.nextLine());
                System.out.println("enter new level: ");
                employee.setLevelEmployee(scanner.nextLine());
                System.out.println("enter new position: ");
                employee.setPositionEmployee(scanner.nextLine());
                System.out.println("Enter new salary: ");
                employee.setSalaryEmployee(scanner.nextLine());
                writeFile(employeeModels);
                return;
            }
        }
    }
}
