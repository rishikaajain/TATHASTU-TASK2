package com.company;
import  java.util.*;
//        Write a Java program to calculate Permutation and Combination of 2 numbers.
public class nCr_nPr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int r= sc.nextInt();
        int p =n-r;
        System.out.println("nCr of 2 nos " + fact(n)/(fact(r)*fact(p)));
        System.out.println("nPr of 2 nos " + fact(n)/fact(p));
    }
    static int  fact(int n1){
        int factorial=1;
        for (int i = 1; i <=n1; i++) {
            factorial=factorial*i;
        }
        return factorial;
    }
}
