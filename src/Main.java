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
        }
    }
}
