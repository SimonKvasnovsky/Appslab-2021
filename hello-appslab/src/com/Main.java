package com;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String[] a1 = new String[]{"A1"};
        String[] a2 = new String[]{"B1"};
        String[] a3 = new String[]{"A1"};
        String[] a4 = new String[]{"C4"};
        if (Arrays.equals(a1,a3))
        {
            System.out.println("They are both equal.");
        }
        else
        {
             System.out.println("false");
        }
        boolean contains = Arrays.stream(a1).anyMatch("A"::equals) && Arrays.stream(a2).anyMatch("A"::equals) || Arrays.stream(a1).anyMatch("1"::equals) && Arrays.stream(a2).anyMatch("1"::equals);

            System.out.println(contains);
    }
}
