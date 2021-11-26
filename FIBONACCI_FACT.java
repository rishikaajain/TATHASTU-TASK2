package com.company;
import java.util.*;
//        Write a Java program to calculate Fibonacci Series up to n numbers.
//        Write a Java program to calculate a Factorial of a number.
public class FIBONACCI_FACT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first two terms :- ");
//        int firstno= sc.nextInt();
//        int secondno= sc.nextInt();
//        System.out.println("Enter the value of n:- ");
//        int n= sc.nextInt();
//        System.out.println("THE FABONACCI SERIES TILL " + n +"TERMS IS :- ");
//        for (int i = 1; i < n; i++) {
//            System.out.print(firstno + " , ");
//            int nextno=firstno+secondno;
//            firstno=secondno;
//            secondno=nextno;
//        }
        System.out.println("Enter the value of n to find the factorial :- ");
        int n1 = sc.nextInt();
        System.out.println(fact(n1));

    }
    static int  fact(int n1){
        int factorial=1;
        for (int i = 1; i <=n1; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial of n is :- " );
        return factorial;
    }
}
