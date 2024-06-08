import java.util.Date;
import java.util.Scanner;

public class Student {
    private String fullName;
    private int groupNo;
    private double point;
    private final Date createdDate;
    private Date updatedDate;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("FullName daxil et");
        this.fullName = scanner.nextLine();
        System.out.println("Grup no daxil et");
        this.groupNo = scanner.nextInt();
        System.out.println("Bal daxil et");
        this.point = scanner.nextDouble();
        this.createdDate = new Date();
    }

    public Student(String fullName, int groupNo, double point) {
        this.fullName = fullName;
        this.groupNo = groupNo;
        this.point = point;
        this.createdDate = new Date();
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

    public void setPoint(double point) {
        this.point = point;
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
}
