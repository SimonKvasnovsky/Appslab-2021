package com;

public class Main {

    public static void main(String[] args)
    {

       int[] numbers =  {10, 52, 14, 98};
       int smallest = numbers[0];
       int largest = numbers[0];

        for(int i=1; i< numbers.length; i++)
        {
            if(numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];

        }
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);
    }


}
