package org.example;
import java.util.Scanner;
import java.util.Date;
/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Jose Malave
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        final int MAX_GAL = 350;
        System.out.println( "What is the length? " );
        int length= sc.nextInt();
        System.out.println( "What is the width? " );
        int width= sc.nextInt();

        double area = (length * width);
        double gallons  = Math.ceil(area/MAX_GAL);

        System.out.println( "You will need to purchase "+ Math.round(gallons) +" gallons of paint to cover "+Math.round(area)+" square feet." );

    }
}