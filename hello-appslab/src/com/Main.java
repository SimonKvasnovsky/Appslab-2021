package com;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.print("Enter third number: ");
        int num3 = in.nextInt();

        if (num1 == num2 && num1 == num3)
        {
            System.out.println("3 numbers are equal");
        }
        else if ((num1 == num2) || (num1 == num3) || (num3 == num2))
        {
            System.out.println("2 numbers are equal");
        }
        else
        {
            System.out.println("0 numbers are equal1");
        }
    }


}