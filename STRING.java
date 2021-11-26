package com.company;
import java.util.*;
//        Write a Java program to find out whether the given String is Palindrome or not.
public class STRING {
    public static void main(String[] args) {
        String org,reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STRING :-");
        org=sc.nextLine();
        int leng=org.length();
        for (int i = leng-1; i >=0 ; i--) {
            reverse=reverse+org.charAt(i);
        }
        if(org.equals(reverse))
            System.out.println("STRING IS A PALINDROME!");
        else
            System.out.println("STRING ISN'T A PALINDROME!");
    }
}
