package com.company;
import java.util.*;
//        Write a Java Program to reverse the letters present in the given String.
public class REVERSE_STRING{
    public static void main(String[] args) {
        String org1,reverse1="";
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING :-");
        org1=sc.nextLine();
        int leng=org1.length();
        for (int i = leng-1; i >=0 ; i--) {
            reverse1=reverse1+org1.charAt(i);
        }
            System.out.println("REVERSED STRING  :- " + reverse1);
    }
    }
