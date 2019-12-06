package com.profile;

public class Student {
	private String firstName;
	private String lastName;
	private String department;
    private String cls; 
    private String yoe; 
    // Parameterized Constructor to set Student 
    // name, age, course enrolled in. 
    public Student(String fn, String ln, String d, String c, String y) 
    { 
        this.firstName = fn; 
        this.lastName = ln;
        this.department = d; 
        this.cls = c; 
        this.yoe=y;
    } 
    // Setter Methods to set table data to be 
    // displayed 
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDepartment() { return department; }
    public String getCls() { return cls; }
    public String getYoe() { return yoe; }
}
