import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Teacher extends Person {

    private String dept, designation;
    private int hrs, nsalary;
    ArrayList<Teacher> Tdetails = new ArrayList();
    Scanner myObj = new Scanner(System.in);

    Teacher(int id, String firstname, String lastname, String gender, String address, int phoneNum, String dept,
            String designation, int hrs, int nsalary) 
    {
        super(id, firstname, lastname, gender, address, phoneNum);
        this.dept = dept;
        this.designation = designation;
        this.hrs = hrs;
        this.nsalary = nsalary;
    }

    public void setdept(String dept) {
        this.dept = dept;
    }

    public String getdept() {
        return dept;
    }

    public void setdesignation(String designation) {
        this.designation = designation;
    }

    public String getdesignation() {
        return designation;
    }

    public void sethrs(int hrs) {
        this.hrs = hrs;
    }

    public Integer gethrs() {
        return hrs;
    }

    public void setnsalary(int nsalary) {
        this.nsalary = nsalary;
    }

    public Integer nsalary() {
        return nsalary;
    }

    public void insertT() {
        System.out.println("id");
        int id = myObj.nextInt();
        System.out.println("fname");
        String fname = myObj.next();
        System.out.println("lname");
        String lname = myObj.next();
        System.out.println("gender");
        String gender = myObj.next();
        System.out.println("add");
        String ad = myObj.next();
        System.out.println("pnum");
        int pnum = myObj.nextInt();
        System.out.println("dept");
        String dept = myObj.next();
        System.out.println("des");
        String des = myObj.next();
        System.out.println("hrs");
        int hrs = myObj.nextInt();
        System.out.println("sal");
        int nsalary = myObj.nextInt();
        Teacher teacher = new Teacher(id, fname, lname, gender, ad, pnum, dept, des, hrs, nsalary);
        Tdetails.add(teacher);
    }

    public void displayT() {
        System.out.println("display all records ");
        for (int i = 0; i < Tdetails.size(); i++) {
            System.out.println("Teacher's ID: " + Tdetails.get(i).getid());
            System.out.println("Teacher's Firstname: " + Tdetails.get(i).getfirstname());
            System.out.println("Teacher's Lastname: " + Tdetails.get(i).getlastname());
            System.out.println("Teacher's Gender: " + Tdetails.get(i).getgender());
            System.out.println("Teacher's Address: " + Tdetails.get(i).getaddress());
            System.out.println("Teacher's Phone no.: " + Tdetails.get(i).getphoneNum());
            System.out.println("Teacher's Department: " + Tdetails.get(i).getdept());
            System.out.println("Teacher's Faculty Position: " + Tdetails.get(i).getdesignation());
        }

    }

    public void deleteT() {
        if (Tdetails.size() == 0) {
            System.out.println("The file is empty..");
        } else {
            System.out.print("Enter Teacher's ID: ");
            int checker = myObj.nextInt();
            for (int y = 0; y < Tdetails.size(); y++)
                if (checker == Tdetails.get(y).getid()) {
                    System.out.println(Tdetails.get(y).getid() + " Has been removed from the database!!");
                    Tdetails.remove(y);
                } else {
                    System.out.println("The inputed ID is not in the database");
                }

        }

    }
}
