package com;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd=0,even=0,sub=0;
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
            if(i%2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        sub = Math.abs(even-odd);
        System.out.println(sub);
    }
}
