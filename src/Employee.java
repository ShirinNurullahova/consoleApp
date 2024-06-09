import java.util.Date;
import java.util.Scanner;

class Employee {
    Scanner scanner = new Scanner(System.in);
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
        while (true) {
            System.out.println("Full name daxil et");
            this.fullName = scanner.next();
            if (fullName.length() <= 2) {
                System.out.println("Full name min 2 herfden ibaret olmalidir!");
                continue;
            }
            this.fullName = fullName;
            break;
        }
        while (true) {
            System.out.println("position daxil et");
            this.position = scanner.next();
            if (position.length() <= 2) {
                System.out.println("Pozisiya min 2 herfden ibaret olmalidir!");
                continue;
            }
            this.position = position;
            break;
        }

        while (true) {
            System.out.println("Salary daxil et:");
            double salary = scanner.nextDouble();
            if (salary < 250) {
                System.out.println("Maas 250den ashagi ola bilmez!");
                continue;
            }
            this.salary = salary;
            break;
        }


        while (true) {
            System.out.println("Department name daxil et");
            this.departmentName = scanner.next();
            if (departmentName.length() <= 2) {
                System.out.println("Dep name min 2 herfden ibaret olmalidir!");
                continue;
            }
            this.departmentName = departmentName;
            break;
        }
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

    @Override
    public String toString() {
        return "Employee{" +
                "no='" + no + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", departmentName='" + departmentName + '\'' +
                '}';
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

            if (position.length() >= 2) {
                this.position = position;
            } else {
                System.out.println("Minimum 2 herfden ibaret olmalidir");
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