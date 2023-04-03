package firstTerm;

public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private final int id;
    private static int idCounter = 1;
    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = idCounter;
        idCounter++;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department)  {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        else {
            this.department = department;
        }
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата указана неверно");
        }
        else {
            this.salary = salary;
        }
    }
    @Override
    public String toString() {
        return "ФИО: " + fullName + ", " +
                "Отдел: " + department + ", " +
                "Зарплата: " + salary + ", " +
                "ID: " + id;
    }
}
