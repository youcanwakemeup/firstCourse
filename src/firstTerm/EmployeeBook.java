package firstTerm;


public class EmployeeBook {
    private static Employee[] repository = {
            new Employee("Ivan Ivanov", 1, 100_000),
            new Employee("Alexander Morozov", 2, 120_000),
            new Employee("Danil Smirnov", 3, 200_000),
            new Employee("Dima Kuznetsov", 4, 145_000),
            new Employee("Lev Petrov", 5, 160_000),
            new Employee("Maksim Sokolov", 1, 270_000),
            new Employee("Mikhail Zhukov", 2, 90_000),
            new Employee("Evgenii Voronov", 3, 85_000),
            new Employee("Andrei Zaitsev", 4, 110_000),
            new Employee("Vitaly Belov", 5, 130_000),
};
    public static Employee[] getRepository() {
        return repository;
    }
    public Employee employeeWithMinSalaryInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        Employee minSalary = employeeWithMaxSalary();
        for (Employee employee : repository) {
            if (employee.getDepartment() == department && employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }
    public Employee employeeWithMaxSalaryInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        Employee maxSalary = employeeWithMinSalary();
        for (Employee employee : repository) {
            if (employee.getDepartment() == department && employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
    public double totalSalaryInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        double totalSalary = 0;
        for (Employee salary : repository) {
            if (salary.getDepartment() == department) {
                totalSalary += salary.getSalary();
            }
        }
        return totalSalary;
    }
    public double avgSalaryInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        double totalSalary = totalSalaryInDepartment(department);
        int peopleInDepartment = 0;
        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                peopleInDepartment++;
            }
        }
        return totalSalary / peopleInDepartment;
    }
    public void changeSalaryInDepartment(int department, double percentage) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        for (Employee salary : repository) {
            if (salary.getDepartment() == department) {
                salary.setSalary (salary.getSalary() * percentage / 100 + salary.getSalary());
            }
        }
    }
    public void printAllEmployeesInDepartment(int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        for (Employee employee : repository) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + ", " + employee.getSalary());
            }
        }
    }
    public void employeesWithLesserSalary(double comparingSalary) {
        for (Employee employee : repository) {
            if (employee.getSalary() < comparingSalary) {
                System.out.println(employee);
            }
        }
    }
    public void employeesWithGreaterSalary(double comparingSalary) {
        for (Employee employee : repository) {
            if (employee.getSalary() >= comparingSalary) {
                System.out.println(employee);
            }
        }
    }
    public void changeSalary(double percentage) {
        for (Employee salary : repository) {
            salary.setSalary (salary.getSalary() * percentage / 100 + salary.getSalary());
        }
    }
    public void printAllEmployeesInfo() {
        for (Employee employee : repository) {
            System.out.println(employee);
        }
    }
    public double totalSalary() {
        double totalSalary = 0;
        for (Employee salary : repository) {
            totalSalary += salary.getSalary();
        }
        return totalSalary;
    }
    public Employee employeeWithMinSalary () {
        Employee minSalary = repository[0];
        for (Employee salary : repository) {
            if (minSalary.getSalary() > salary.getSalary()) {
                minSalary = salary;
            }
        }
        return minSalary;
    }
    public Employee employeeWithMaxSalary () {
        Employee maxSalary = repository[0];
        for (Employee salary : repository) {
            if (maxSalary.getSalary() < salary.getSalary()) {
                maxSalary = salary;
            }
        }
        return maxSalary;
    }
    public double avgSalary() {
        return totalSalary() / repository.length;
    }
    public  void printAllNames() {
        for (Employee name : repository) {
            System.out.println(name.getFullName());
        }
    }
    public void removeEmployee(String fullName, int id) {
        for (int i =0; i < repository.length; i++) {
            if (repository[i].getId() == id || repository[i].getFullName().equals(fullName)) {
                repository[i] = null;
                return;
            }
        }
    }
    public void addEmployee(String fullName, int department, int salary) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        for (int i =0; i < repository.length; i++) {
            if (repository[i] == null) {
                repository[i] = newEmployee;
                return;
            }
        }
        Employee[] newRepository = new Employee[repository.length + 1];
        System.arraycopy(repository, 0, newRepository, 0, repository.length);
        newRepository[newRepository.length - 1] = newEmployee;
        repository = newRepository;
    }
    public void changeEmployeeSalary(String fullName, int salary) {
        for (Employee employee : repository) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
                return;
            }
        }
    }
    public void changeEmployeeDepartment(String fullName, int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Выберите отдел от 1 до 5");
        }
        for (Employee employee : repository) {
            if (employee.getFullName().equals(fullName)) {
                employee.setDepartment(department);
                return;
            }
        }
    }
    public void printEmployeesByDepartment() {
        for (Employee department : repository) {
            System.out.println("Номер отдела: " + department.getDepartment());
            for (Employee employee : repository) {
                if (employee.getDepartment() == department.getDepartment()) {
                    System.out.println(employee);
                }
            }
        }
    }
}
