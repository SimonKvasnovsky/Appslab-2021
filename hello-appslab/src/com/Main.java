package com;

public class Main {

    public static void main(String[] args)
    {
        String one = "abc";
        boolean bc = one.contains("bc");
        if(bc)
        {
            System.out.println(bc);;
        }
        else
        {
            System.out.println(false);
        }

        
        String two = "Car";
        if(two.endsWith("ar"))
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
