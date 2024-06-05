public class University {
    private String name;
    private int workerLimit;
    private double salaryLimit;
    private Employee employees;
    private Student students;

    public University(String name, int workerLimit, double salaryLimit,Student students, Employee employees) {
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
        this.students = students;
        this.employees = employees;
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

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {

    }

    public void addStudent(Student student) {
    }

    public void updateEmployee(Employee employee) {

    }

    public void updateStudent(Student student) {

    }

    public void deleteEmployee(String employeeNo) {
    }

    public void calcSalaryAverage() {}

    public void calcStudentsAverage() {}

    public void calcStudentsAverage(String groupNo) {}
}
