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
