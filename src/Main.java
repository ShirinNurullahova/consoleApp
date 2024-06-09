import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static University university;

    public static void main(String[] args) {
        university = new University();
        while (true) {
            menu();
        }
    }

    public static void menu() {
        System.out.println("1. Telebe yarat");
        System.out.println("2. Ishci yarat");
        System.out.println("3. Telebelerin siyahisini goster");
        System.out.println("4. Telebeni update et (groupNo)");
        System.out.println("5. Butun telebelerin ortalama ballarini goster");
        System.out.println("6. Grup telebelerinin ortalama ballarini goster");
        System.out.println("7. Iscini sil (Employee No.)");
        System.out.println("8. Iscilerin maas ortalamasini goster");
        System.out.println("9. Ishchilerin siyahisini goster");
        System.out.println("10.Universitetdeki ishcilerin siyahisini goster(Department Name.)");
        System.out.println("11.Telebelerin siyahisini goster(Grup No.)");
        System.out.println("12.Ishcini update et (position ve salary)");
        System.out.println("13.Ishci adina gore axtarish et");
        System.out.println("14.Telebe adina gore axtarish et");
        System.out.println("15.Telebenin balina gore axtarish et");
        System.out.println("16.Telebenin grup no  gore axtarish et");
        System.out.println("17.Ishci  maashina gore axtarish et");
        System.out.println("18.Ishci depName  gore axtarish et");
        System.out.println("19.Ishci tipine  gore axtarish et");
        System.out.println("20.Cixish");
        System.out.println("Secim et");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> university.addStudent();
            case 2 -> university.addEmployee();
            case 3 -> university.getAllStudents();
            case 4 -> university.updateStudent();
            case 5 -> university.calcStudentsAverage();
            case 6 -> university.calcStudentsAverageByGroup();
            case 7 -> university.deleteEmployee();
            case 8 -> university.calcSalaryAverage();
            case 9 -> university.getAllEmployees();
            case 10-> university.getEmployeesByDepartmentName();
            case 11-> university.getStudentsByGroupNo();
            case 12->university.updateEmployee();
            case 13->university.searchEmployeeByName();
            case 14->university.searchStudentByName();
            case 15->university.searchStudentByPoint();
            case 16->university.searchStudentByGroupNumber();
            case 17->university.searchEmployeeBySalary();
            case 18->university.searchEmployeeByDepartmentName();
            case 19->university.searchEmployeeByType();
            case 20 -> System.exit(0);
            default -> System.out.println("Yanlish secim!");
        }
    }
}
