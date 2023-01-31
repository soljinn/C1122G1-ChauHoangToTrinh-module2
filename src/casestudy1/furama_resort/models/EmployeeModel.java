package casestudy1.furama_resort.models;

public class EmployeeModel extends Person {
    private String idEmployee;
    private String levelEmployee;
    private String positionEmployee;
    private String salaryEmployee;

    public EmployeeModel() {
    }

    public EmployeeModel(String name, String dateOfBirth, String gender, String id, String phoneNumber, String email, String idEmployee, String levelEmployee, String positionEmployee, String salaryEmployee) {
        super(name, dateOfBirth, gender, id, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.levelEmployee = levelEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public String getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(String salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "idEmployee='" + idEmployee + '\'' +
                ", levelEmployee='" + levelEmployee + '\'' +
                ", positionEmployee='" + positionEmployee + '\'' +
                ", salaryEmployee='" + salaryEmployee + '\'' +
                '}';
    }
}
