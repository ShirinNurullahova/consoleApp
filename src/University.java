import java.util.Date;
import java.util.Scanner;

public class University {
    Scanner scanner = new Scanner(System.in);
    private Student[] students;
    private String name;
    private int workerLimit;
    private double salaryLimit;
    private Employee[] employees;

    public University(String name, int workerLimit, double salaryLimit, Student[] students, Employee[] employees) {
        if (name.length() < 2) {
            System.out.println("Universitet adi minimum 2 herfden ibaret olmalidir");
        }
        if (workerLimit < 1) {
            System.out.println("Ishci sayi minimum 1 ola biler.");
        }
        if (salaryLimit < 250) {
            System.out.println("Salary limit minimum 250 ola biler");
        }

        this.name = name;
        this.workerLimit = workerLimit;
        this.salaryLimit = salaryLimit;
        this.students = students != null ? students : new Student[5];
        this.employees = employees != null ? employees : new Employee[5];
    }

    public String getName() {
        return name;
    }

    public int getWorkerLimit() {
        return workerLimit;
    }

    public double getSalaryLimit() {
        return salaryLimit;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee() {
        boolean addedEmployee= true;
        while (addedEmployee) {
            System.out.println("ishci No daxil et");
            int  no = scanner.nextInt();
            System.out.println("Full name daxil et");
            String fullname = scanner.nextLine();
            System.out.println("position daxil et");
            String position = scanner.nextLine();
            System.out.println("Salary daxil et");
            int salary = scanner.nextInt();
            System.out.println("Department name daxil et");
            String departmentName = scanner.nextLine();
            System.out.println("Employee type daxil et (1: FullTime, 2: PartTime, 3: Adjunct)");
            int employeeTypeChoice = scanner.nextInt();
            scanner.nextLine();
            EmployeeType employeeType;
            switch (employeeTypeChoice) {
                case 1 -> employeeType = EmployeeType.FullTime;
                case 2 -> employeeType = EmployeeType.PartTime;
                case 3 -> employeeType = EmployeeType.Adjunct;
                default -> {
                    System.out.println("Invalid choice, defaulting to FullTime");
                    employeeType = EmployeeType.FullTime;
                }
            }
            Employee employee = new Employee(no, fullname, position, salary, departmentName, employeeType);
            boolean hasEmpty = true;
            for(int i=0; i<employees.length; i++){
                if(employees[i]==null){
                    employees[i]=employee;
                    hasEmpty=false;
                    break;
                }
            }
            if(hasEmpty){
                Employee[] newEmployee = new Employee[employees.length + 5];
                for(int i=0; i< employees.length; i++){
                    newEmployee[i]= employees[i];
                }
                int setToIndex= employees.length;
                employees= newEmployee;
                employees[setToIndex]=employee;
            }

            System.out.println("Yeniden davam etmek isteyirsiniz ? 1 or 2");
            int choise = scanner.nextInt();
            if(choise == 1){
                addedEmployee=false;
            }else if(choise ==2){
                System.exit(0);
            }
        }
    }

    public void addStudent() {
        boolean addedStudents= true;
        while (addedStudents) {
            System.out.println("FullName daxil et");
            String  fullname = scanner.nextLine();
            System.out.println("Grup no daxil et");
            int grupNo = scanner.nextInt();
            System.out.println("Bal daxil et");
            int point = scanner.nextInt();
            Student student = new Student(fullname,grupNo,point);
            boolean hasEmpty = true;
            for(int i=0; i<students.length; i++){
                if(students[i]==null){
                    students[i]=student;
                    hasEmpty=false;
                    break;
                }
            }
            if(hasEmpty){
                Student[] newStudent = new Student[students.length + 5];
                for(int i=0; i< students.length; i++){
                    newStudent[i]= students[i];
                }
                int setToIndex= students.length;
                students= newStudent;
                students[setToIndex]=student;
            }

            System.out.println("Yeniden davam etmek isteyirsiniz ? 1 or 2");
            int choise = scanner.nextInt();
            if(choise == 1){
                addedStudents=false;
            }else if(choise ==2){
                System.exit(0);
            }
        }

    }

    public void updateEmployee(Employee employee) {
        // Logic to update an employee
    }

    public void updateStudent(Student student) {
        // Logic to update a student
    }

    public void deleteEmployee(String employeeNo) {
        // Logic to delete an employee
    }

    public void calcSalaryAverage() {
        // Logic to calculate the average salary
    }

    public void calcStudentsAverage() {
        // Logic to calculate the average of students
    }

    public void calcStudentsAverage(String groupNo) {
        // Logic to calculate the average of students for a specific group
    }
}
