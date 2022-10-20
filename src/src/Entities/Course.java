package Entities;

public class Course {
    private int id;
    private String courseName;
    private String courseTeacher;
    private String description;
    private double unitPrice;


    public Course() {
    }

    public Course(int id, String courseName, String courseTeacher, String description, double unitPrice) {
        this.id = id;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }



}
