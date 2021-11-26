package com.company;
import java.util.*;
//        Write a Java Program to check whether the given array is Mirror Inverse or not.
public class MIRROR {
    public static void main(String[] args) {
        int arr[]={3,4,2,0,1};
        if(Mirrorinverse(arr))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    static boolean Mirrorinverse(int arr []){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[arr[i]] !=i)
                return false;
        }
        return true;
    }
}
