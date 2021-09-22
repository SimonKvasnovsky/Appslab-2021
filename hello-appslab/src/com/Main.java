package com;

public class Main {

    public static void main(String[] args) {
        double heightOfStep = 0.3;
        double lenghtOfStep = 0.2;
        double towerHeight = 25;
        double numberOfSteps = (towerHeight/ heightOfStep) ;
        double result = numberOfSteps * (heightOfStep+lenghtOfStep) ;
        System.out.println("Total distance is " + result);
    }
}
