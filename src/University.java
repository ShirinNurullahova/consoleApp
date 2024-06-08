import java.util.Scanner;

public class University {
    Scanner scanner = new Scanner(System.in);
    private Student[] students;
    private String name;
    private int workerLimit;
    private double salaryLimit;
    private Employee[] employees;

    public University() {
        this.students = new Student[0];
        while (true) {
            if (this.name == null) {
                System.out.println(" Universitet Adi daxil et");
                String uniname = scanner.nextLine();
                if (uniname.length() < 2) {
                    System.out.println("Universitet adi minimum 2 herfden ibaret olmalidir");
                    continue;
                }
                this.name = uniname;
            }
            if (this.workerLimit == 0) {
                System.out.println("Ishci limiti");
                int workerLimit = scanner.nextInt();
                if (workerLimit < 1) {
                    System.out.println("Ishci sayi minimum 1 ola biler.");
                    continue;
                }
                this.workerLimit = workerLimit;
            }
            if (this.salaryLimit == 0) {
                System.out.println("Maash limiti daxil et");
                double salaryLimit = scanner.nextDouble();
                if (salaryLimit < 250) {
                    System.out.println("Salary limit minimum 250 ola biler");
                    continue;
                }
                this.salaryLimit = salaryLimit;
            }
            break;
        }
    }

    public University(String name, int workerLimit, double salaryLimit, Student[] students, Employee[] employees) {
        if (name.length() < 2) {
            System.out.println("Universitet adi minimum 2 herfden ibaret olmalidir");
            return;
        }
        if (workerLimit < 1) {
            System.out.println("Ishci sayi minimum 1 ola biler.");
            return;
        }
        if (salaryLimit < 250) {
            System.out.println("Salary limit minimum 250 ola biler");
            return;
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
//        boolean addedEmployee= true;
//        while (addedEmployee) {
//            Employee employee = askEmployeeData();
//            boolean hasEmpty = true;
//            for(int i=0; i<employees.length; i++){
//                if(employees[i]==null){
//                    employees[i]=employee;
//                    hasEmpty=false;
//                    break;
//                }
//            }
//            if(hasEmpty){
//                Employee[] newEmployee = new Employee[employees.length + 5];
//                for(int i=0; i< employees.length; i++){
//                    newEmployee[i]= employees[i];
//                }
//                int setToIndex= employees.length;
//                employees= newEmployee;
//                employees[setToIndex]=employee;
//            }
//
//            System.out.println("Yeniden davam etmek isteyirsiniz ? 1 or 2");
//            int choise = scanner.nextInt();
//            if(choise == 1){
//                addedEmployee=false;
//            }else if(choise ==2){
//                System.exit(0);
//            }
//        }
        while (true) {
            Employee employee = new Employee();
            Employee[] newEmployeesArray = new Employee[employees.length + 1];
            for (int i = 0; i < employees.length; i++) {
                newEmployeesArray[i] = employees[i];
            }
            newEmployeesArray[students.length] = employee;
            employees = newEmployeesArray;
//            boolean hasEmpty = true;
//            if(hasEmpty){
//                Student[] newStudent = new Student[students.length + 5];
//                for(int i=0; i< students.length; i++){
//                    newStudent[i]= students[i];
//                }
//                int setToIndex= students.length;
//                students= newStudent;
//                students[setToIndex]=student;
//            }
            System.out.println("Yeniden davam etmek isteyirsiniz ?\n1. Yeni ishchi elave et\n2. Menuya qayiq\n3.Cixish et");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> Main.menu();
                case 3 ->  System.exit(0);
            }
        }
    }

    public void addStudent() {
        while (true) {
            Student student = new Student();
            Student[] newStudentsArray = new Student[students.length + 1];
            for (int i = 0; i < students.length; i++) {
                newStudentsArray[i] = students[i];
            }
            newStudentsArray[students.length] = student;
            students = newStudentsArray;
//            boolean hasEmpty = true;
//            if(hasEmpty){
//                Student[] newStudent = new Student[students.length + 5];
//                for(int i=0; i< students.length; i++){
//                    newStudent[i]= students[i];
//                }
//                int setToIndex= students.length;
//                students= newStudent;
//                students[setToIndex]=student;
//            }
            System.out.println("Yeniden davam etmek isteyirsiniz ?\n1. Yeni telebe elave et\n2. Menuya qayiq\n3.Cixish et");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> Main.menu();
                case 3 ->  System.exit(0);
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
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        double avg = employees.length == 0 ? 0 : (sum / employees.length);
        System.out.println(avg);
    }

    public void calcStudentsAverage() {
        // Logic to calculate the average of students
        double sum = 0;
        for (Student student : students) {
            sum += student.getPoint();
        }
        double avg = students.length == 0 ? 0 : (sum / students.length);
        System.out.println(avg);
    }

    public void calcStudentsAverage(String groupNo) {
        // Logic to calculate the average of students for a specific group
        double sum = 0;
        for (Student student : students) {
            if (student.getGroupNo() == Integer.parseInt(groupNo)) {
                sum += student.getPoint();
            }
        }
        double avg = students.length == 0 ? 0 : (sum / students.length);
        System.out.println(avg);
    }
}
