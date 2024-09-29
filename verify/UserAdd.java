package verify;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UserAdd {
    String DateOfJoin;
    LocalDateTime TimeOfJoin;
    DateTimeFormatter dtf;
    String Rating;
    String Status;
    String Name;
    String Email;
    String Adress;
    Long PhoneNumber;
    String Dob;
    String gender;
    String TaxiID; // Added TaxiID field

    public UserAdd(String Name, String Email, String Adress, Long PhoneNumber, String Dob, String gender) {
        TimeOfJoin = LocalDateTime.now();
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateOfJoin = dtf.format(TimeOfJoin);
        Rating = "0.0";
        Status = "pending";
        this.Name = Name;
        this.Email = Email;
        this.Adress = Adress;
        this.PhoneNumber = PhoneNumber;
        this.Dob = Dob;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Adress;
    }

    public void setAddress(String Adress) {
        this.Adress = Adress;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Long PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfJoin() {
        return DateOfJoin;
    }

    public void setDateOfJoin(String DateOfJoin) {
        this.DateOfJoin = DateOfJoin;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getTaxiID() {
        return TaxiID;
    }

    public void setTaxiID(String TaxiID) {
        this.TaxiID = TaxiID;
    }
    public int getage(){
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    try {
        LocalDate birthDate = LocalDate.parse(Dob, formatter);
        LocalDate currentDate = LocalDate.now();
        
        Period age = Period.between(birthDate, currentDate);
        return age.getYears();
    } catch (DateTimeParseException e) {
        System.out.println("Invalid date format");
        return -1; 
    }
    }
   
}
