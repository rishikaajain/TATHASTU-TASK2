package com.company;
import java.util.*;
//        Write a Java program to perform basic Calculator operations.
public class CALCULATOR{
    public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS:-");
	  int a= sc.nextInt();
	  int b= sc.nextInt();
        System.out.println("WHICH OPERATION YOU WANT TO PERFORM? /n 1. ADDITION /n 2. SUBTRACTION /n 3. MULTIPLICATION /n 4.Division /n 5. EXIT");
        char op= sc.next().charAt(0);
        int result=0;
      switch (op){
          case '1' -> System.out.println(result=a+b);
          case '2' -> System.out.println(result=a-b);
          case '3' -> System.out.println(result=a*b);
          case '4' -> System.out.println(result=a/b);
          default ->  System.out.println("invalid option!");
      }
        System.out.println("The final result is :- " + result);
    }

}
