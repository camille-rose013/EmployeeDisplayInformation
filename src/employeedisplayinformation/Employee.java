/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeedisplayinformation;

/**
 *
 * @author camil
 */
public class Employee {
    private String firstName;
    private String middleName;
    private String sureName;
    private String birthMonth;
    private int birthDay;
    private int birthYear;
    private String departmentName;

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSureName() {
        return sureName;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public String formatEmployeeName() {
        return this.firstName + " " + this.middleName + " " + this.sureName;
    }
    
    
    public String formatBirthday(int birthYear, String birthMonth, int birthDay) 
    {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        
        return birthMonth + " " + String.valueOf(birthDay) + ", " + String.valueOf(birthYear);
    }
    
    
    
}
