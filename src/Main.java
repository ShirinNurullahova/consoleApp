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
        System.out.println("1. Student yarat");
        System.out.println("2. Ishci yarat");
        System.out.println("Secim et");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> university.addStudent();
            case 2 -> university.addEmployee();
        }
    }
}
