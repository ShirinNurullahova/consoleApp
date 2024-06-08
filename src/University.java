import java.util.Date;
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
        this.employees = new Employee[0];
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

    public void updateStudent() {
        scanner.nextLine();
        while (true) {
            System.out.println("Deyishmek istediyiniz telebenin adini daxil edin:");
            String fullName = scanner.nextLine();
            System.out.println("GroupNo daxil edin:");
            int groupNo = scanner.nextInt();
            for (Student student : students) {
                if (student.getFullName().equals(fullName)) {
                    student.setGroupNo(groupNo);
                    return;
                }
            }
            System.out.println("Telebe tapilmadi");
        }
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

    public Student[] getAllStudents() {
        if (students.length == 0) {
            System.out.println("Telebe yoxdur");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
        return students;
    }

    public Employee[] getAllEmployees() {
        if (employees.length == 0) {
            System.out.println("Ischi yoxdur");
        } else {
            for (Employee employee : employees) {
                if (employee.getDeletedDate() != null) {
                    System.out.println(employee);
                }
            }
        }
        return employees;
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
        Employee employee = new Employee();
        boolean hasEmpty = true;
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = employee;
                hasEmpty = false;
                break;
            }
        }
        if (hasEmpty) {
            Employee[] newEmployee = new Employee[employees.length + 5];
            for(int i = 0; i < employees.length; i++){
                newEmployee[i] = employees[i];
            }
            int setToIndex= employees.length;
            employees = newEmployee;
            employees[setToIndex] = employee;
        }
        System.out.println("Yeniden davam etmek isteyirsiniz ?\n1. Yeni ishchi elave et\n2. Menuya qayit\n3. Cixish et");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> addEmployee();
            case 2 -> Main.menu();
            case 3 ->  System.exit(0);
        }
//        Employee student = new Employee();
//        Employee[] newEmployeesArray = new Employee[employees.length + 1];
//        for (int i = 0; i < employees.length; i++) {
//            newEmployeesArray[i] = employees[i];
//        }
//        newEmployeesArray[employees.length] = student;
//        employees = newEmployeesArray;
//        System.out.println("Yeniden davam etmek isteyirsiniz ?\n1. Yeni telebe elave et\n2. Menuya qayiq\n3.Cixish et");
//        int choice = scanner.nextInt();
//        switch (choice) {
//            case 1 -> addEmployee();
//            case 2 -> Main.menu();
//            case 3 -> System.exit(0);
//        }
    }

    public void addStudent() {
        Student student = new Student();
        Student[] newStudentsArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudentsArray[i] = students[i];
        }
        newStudentsArray[students.length] = student;
        students = newStudentsArray;
        System.out.println("Yeniden davam etmek isteyirsiniz ?\n1. Yeni telebe elave et\n2. Menuya qayiq\n3.Cixish et");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> addStudent();
            case 2 -> Main.menu();
            case 3 -> System.exit(0);
        }
    }

    public void deleteEmployee() {
        System.out.println("Silmek istediyiniz iscinin nomresini daxil edin:");
        String employeeNo = scanner.next();
        for (Employee employee : employees) {
            if (employee != null && employee.getNo().equals(employeeNo)) {
                employee.setDeletedDate(new Date());
                return;
            }
        }
    }

    public void calcSalaryAverage() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.getDeletedDate() == null) {
                sum += employee.getSalary();
            }
        }
        double avg = employees.length == 0 ? 0 : (sum / employees.length);
        System.out.println(avg);
    }

    public void calcStudentsAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getPoint();
        }
        double avg = students.length == 0 ? 0 : (sum / students.length);
        System.out.println(avg);
    }

    public void calcStudentsAverageByGroup() {
        double sum = 0;
        System.out.println("Group NO daxil et:");
        int groupNo = scanner.nextInt();
        int groupCount = 0;
        for (Student student : students) {
            if (student.getGroupNo() == groupNo) {
                sum += student.getPoint();
                groupCount++;
            }
        }
        double avg = students.length == 0 ? 0 : (sum / groupCount);
        System.out.println(avg);
    }
}
