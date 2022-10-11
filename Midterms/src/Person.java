
import java.util.LinkedList;
import java.util.Scanner;
 class Person {
    private  String firstname,lastname,address,gender;
    private int id, phoneNum;

     public  void  setid (int id) {this.id = id;}
     public Integer getid(){
         return id;
     }

     public void setfirstname (String firstname) {this.firstname = firstname;}
     public String  getfirstname() {return firstname;}

     public void setlastname (String lastname){this.lastname = lastname;}
     public String  getlastname() {return lastname;}

     public void setgender (String gender) {this.gender = gender;}
     public String  getgender()
     {
         return gender;
     }

     public void  setaddress (String address)  {this.address = address;}
     public String  getaddress ()
     {
         return address;
     }

     public void setphoneNum (int phoneNum) {this.phoneNum = phoneNum;}
     public Integer getphoneNum(){
         return phoneNum;
     }

     Person (int id, String firstname, String lastname, String gender, String address, int phoneNum)
     {
         this.id = id;
         this.phoneNum = phoneNum;
         this.firstname = firstname;
         this.lastname = lastname;
         this.gender = gender;
         this.address = address;
     }
}