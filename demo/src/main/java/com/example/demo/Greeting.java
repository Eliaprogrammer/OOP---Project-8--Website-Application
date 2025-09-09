//Greeting class provide variables to use in the form
package com.example.demo;

public class Greeting {
    //Form input fields/instance variables
    private String studentID;
    private Integer month;
    private Integer day;
    private Integer year;
    private String message;

    //Lines 12 - 50 are getters and setters methods
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
