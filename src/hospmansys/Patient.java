/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospmansys;

/**
 *
 * @author Myriam
 */
public class Patient {
    private int ID,Age,RoomNum;
    private String Date,Name,Gender,Address,Status,Disease,PhoneNumber;

    public Patient(int ID, int Age, int RoomNum, String Date, String Name, String Gender, String Address, String Status, String Disease, String PhoneNumber) {
        this.ID = ID;
        this.Age = Age;
        this.RoomNum = RoomNum;
        this.Date = Date;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Status = Status;
        this.Disease = Disease;
        this.PhoneNumber = PhoneNumber;
    }

  

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getRoomNum() {
        return RoomNum;
    }

    public void setRoomNum(int RoomNum) {
        this.RoomNum = RoomNum;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }
    
    
}
