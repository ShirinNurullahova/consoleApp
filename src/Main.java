import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static University university;

    public static void main(String[] args) {
        university = createUniversity();
        while (true) {
            menu();
            System.out.println("Secim et");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1 -> university.addStudent();
                 case 2-> university.addEmployee();
            }
        }
    }

    public static University createUniversity() {
        System.out.println(" Universitet Adi daxil et");
        String uniname = scanner.nextLine();
        System.out.println("Ishci limiti");
        int workerLimit = scanner.nextInt();
        System.out.println("Maash limiti daxil et");
        double salaryLimit = scanner.nextDouble();
        scanner.nextLine();
        University university = new University(uniname, workerLimit, salaryLimit, new Student[2], new Employee[2]);
        return university;
    }

    public static void menu() {
        System.out.println("1. Student yarat");
        System.out.println("2. Ishci yarat");
    }
}
