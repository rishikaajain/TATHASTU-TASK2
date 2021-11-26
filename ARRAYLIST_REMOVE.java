package com.company;
import java.util.*;
//        Write a Java program to remove elements from an ArrayList
public class ARRAYLIST_REMOVE {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=5;
         ArrayList<Integer> arrayList=new ArrayList<Integer>(n);
        for (int i = 1; i <=n ; i++) {
            arrayList.add(i);
            arrayList.remove(3);
            System.out.println(arrayList);
            System.out.println(arrayList);
            for (int j= 0; j < arrayList.size(); i++) {
                System.out.println(arrayList.get(i) + " ");
            }

        }
    }}

