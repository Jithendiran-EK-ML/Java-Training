package com.example;

public class Employee {

    private int id;
    private byte[] data;
    private String firstName, lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte[] getData()  {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String toString() {
        return "Employe {id : "+id+" , name : "+firstName + " "+ lastName+", data : "+ data+ "}";
    }
}
