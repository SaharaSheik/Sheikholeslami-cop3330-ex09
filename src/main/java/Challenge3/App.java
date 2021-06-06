package Challenge3;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */

import java.util.Scanner;

/*
Exercise 9 - Paint Calculator
//challenge 3 DONE
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width,
and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges
1- Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to
proceed if the value entered is not numeric.
2 - Implement support for a round room.
3- Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */
public class App {



    public static void main(String[] args) {

        final int convert = 350;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter R for a rectangular room, C for a round room, L for an L-Shaped room: ");
        char choice = input.next().charAt(0);

        double totalSF=0;

        switch (choice){

            case 'R':
                totalSF = calculateRectangleArea();
                break;

            case 'C':
                totalSF = circleAreaCalculator ();
                break;

            case 'L':
                totalSF = LshapedArea();
                break;

        }





        double totalPaintNeeded = (totalSF)/convert;

        int totalGallonNeeded =(int)Math.ceil(totalPaintNeeded );

        String output = String.format("You will need to purchase %d gallons of paint to cover %.0f square feet.", totalGallonNeeded, totalSF );

        System.out.println(output);


    }

    public static double circleAreaCalculator (){

        final double PI = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter room's radius: ");
        int radius = input.nextInt();

        double totalSF = Math.pow(radius, 2)*PI;

        return totalSF;


    }

    private static int calculateRectangleArea(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter room's length: ");
        int length = input.nextInt();

        System.out.print("Enter room's width: ");
        int width = input.nextInt();

        int totalSF =width * length;

        return totalSF;

    }

    private static double LshapedArea(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter room's Long outer side: ");
        int longLength = input.nextInt();

        System.out.print("Enter room's short outer side: ");
        int shortLength = input.nextInt();

        System.out.print("Enter room's width: ");
        int width = input.nextInt();

        double totalSF = (width * longLength)+((shortLength-width)*width);

        return totalSF;

    }


}


