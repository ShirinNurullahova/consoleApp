import java.util.Date;
import java.util.Scanner;

class Employee {
    private static int employeeCounter = 1000;

    private final String no;
    private String fullName;
    private String position;
    private double salary;
    private String departmentName;
    private EmployeeType employeeType;
    private final Date createdDate;
    private Date updatedDate;
    private Date deletedDate;

    public Employee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Full name daxil et");
        this.fullName = scanner.next();
        System.out.println("position daxil et");
        this.position = scanner.next();
        scanner.nextLine();
        while (true) {
            if (this.salary < 250) {
                System.out.println("Salary daxil et");
                this.salary = scanner.nextInt();
            } else {
                break;
            }
        }
        System.out.println("Department name daxil et");
        this.departmentName = scanner.nextLine();
        EmployeeType employeeType;
        System.out.println("Employee type daxil et (1: FullTime, 2: PartTime, 3: Adjunct)");
        int employeeTypeChoice = scanner.nextInt();
        switch (employeeTypeChoice) {
            case 1 -> employeeType = EmployeeType.FullTime;
            case 2 -> employeeType = EmployeeType.PartTime;
            case 3 -> employeeType = EmployeeType.Adjunct;
            default -> {
                employeeType = EmployeeType.FullTime;
                System.out.println("Invalid choice. Defaulting to FullTime");
            }
        }
        this.no = departmentName.substring(0, 2).toUpperCase() + employeeCounter++;
        this.employeeType = employeeType;
        this.createdDate = new Date();
    }

    public Employee(String fullName, String position, double salary, String departmentName, EmployeeType employeeType) {
        this.no = departmentName.substring(0, 2).toUpperCase() + employeeCounter++;
        this.fullName = fullName;
        setPosition(position);
        setSalary(salary);
        this.departmentName = departmentName;
        this.employeeType = employeeType;
        this.createdDate = new Date();
    }

    public String getNo() {
        return no;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        while (true) {
            if (position.length() >= 2) {
                this.position = position;
                break;
            } else {
                System.out.println("Minimum 2 herfden ibaret olmalidir");
            }
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 250) {
            this.salary = salary;
        } else {
            System.out.println("Ishcinin maashi 250 den ashagi ola bilmez");
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }
}