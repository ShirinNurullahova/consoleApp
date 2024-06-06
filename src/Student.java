import java.util.Date;

public class Student {
    private String fullName;
    private int groupNo;
    private double point;
    private Date createdDate;
    private Date updatedDate;

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
