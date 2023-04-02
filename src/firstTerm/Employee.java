package firstTerm;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int id;
    private int idCounter() {
        id++;
        return id;
    }
    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter();
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ФИО: " + fullName + ", " +
                "Отдел: " + department + ", " +
                "Зарплата: " + salary;
    }
}
