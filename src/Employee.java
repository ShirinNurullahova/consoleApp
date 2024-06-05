import java.util.Date;

class Employee {
    private static int employeeCounter = 1000;

    private String no;
    private String fullName;
    private String position;
    private double salary;
    private String departmentName;
    private EmployeeType employeeType;
    private Date createdDate;
    private Date updatedDate;
    private Date deletedDate;

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