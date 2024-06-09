import java.util.Date;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String fullName;
    private int groupNo;
    private double point;
    private final Date createdDate;
    private Date updatedDate;

    public Student() {
        while (true) {
            System.out.println("FullName daxil et");
            this.fullName = scanner.nextLine();
            if (fullName.length() <= 2) {
                System.out.println("Fullname min 2 herfden ibaret olmalidir!");
                continue;
            }
            this.fullName = fullName;
            break;
        }
        while (true) {
            System.out.println("Grup no daxil et");
            this.groupNo = scanner.nextInt();
            if (groupNo<=0) {
                System.out.println("Grup no 0 dan boyuk olmalidir!");
                continue;
            }
            this.groupNo = groupNo;
            break;
        }
        while (true) {
            System.out.println("Bal daxil et");
            this.point = scanner.nextDouble();
            if (point<0 || point>700) {
                System.out.println("Bal 0 dan boyuk ve 700 den kicik olmalidir!");
                continue;
            }
            this.point = point;
            break;
        }

        this.createdDate = new Date();
    }

    public Student(String fullName, int groupNo, double point) {
        this.fullName = fullName;
        this.groupNo = groupNo;
        this.point = point;
        this.createdDate = new Date();
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", groupNo=" + groupNo +
                ", point=" + point +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getGroupNo() {
        return groupNo;
    }

    public double getPoint() {
        return point;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
