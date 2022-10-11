package com.midterm;
import java.util.LinkedList;
import java.util.Scanner;
public class Person {
    private String firstname,lastname,address,gender;
    private int id, phoneNum,

    private static void  setDetails(String fn, String ln,
                                    String g, String a,
                                    int d, int pn)
    {
        id = d;
        firstname = fn;
        lastname =  ln;
        gender =  g;
        address  = a;
        phonenumber = pn;
    }
}
