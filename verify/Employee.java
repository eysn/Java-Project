package verify;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private String email;
    private String phoneNumber;
    private String gender;
    private String dateOfBirth;
    private String status;
    private String rating;
    private String dateJoined;
    private String age;
    private String address;
    private String taxiId;

    // Constructor
    public Employee(String name, String email, String phoneNumber, String gender, String dateOfBirth, String status, String rating, String dateJoined, String age, String taxiId) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.rating = rating;
        this.dateJoined = dateJoined;
        this.age = age;
        this.taxiId = taxiId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStatus() {
        return status;
    }

    public String getRating() {
        return rating;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public String getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getTaxiId() {
        return taxiId;
    }
}
