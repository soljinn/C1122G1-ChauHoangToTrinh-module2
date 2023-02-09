package casestudy1.furama_resort.models;

public class EmployeeModel extends Person {
    private int idEmployee;
    private String levelEmployee;
    private String positionEmployee;
    private String salaryEmployee;

    public EmployeeModel() {
    }

    public EmployeeModel(String name, int dateOfBirth, String gender, String id,
                         String phoneNumber, String email, int idEmployee, String levelEmployee,
                         String positionEmployee, String salaryEmployee) {
        super(name, dateOfBirth, gender, id, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.levelEmployee = levelEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
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
        return "EmployeeModel{" + super.toString() +
                "idEmployee='" + idEmployee + '\'' +
                ", levelEmployee='" + levelEmployee + '\'' +
                ", positionEmployee='" + positionEmployee + '\'' +
                ", salaryEmployee='" + salaryEmployee + '\'' +
                '}';
    }
    public String convertLine(){
        String COMMA = ",";
        return super.convertLine()+COMMA + this.idEmployee + COMMA + levelEmployee + COMMA + positionEmployee + COMMA + this.salaryEmployee;
    }
}
