package com.example.studentsback.model;

public class Student {

    private String name;
    private String registerNumber;  // corrected field
    private String password;

    public Student() {}

    // Getters and Setters
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public String getRegisterNumber() {   // renamed getter
        return registerNumber; 
    }
    public void setRegisterNumber(String registerNumber) {  // renamed setter
        this.registerNumber = registerNumber; 
    }

    public String getPassword() { 
        return password; 
    }
    public void setPassword(String password) { 
        this.password = password; 
    }
}
