package com.codewithsana;

import java.util.Scanner;

public class Main {

    static void myMethod() {
        Scanner scanneruserinput = new Scanner(System.in);
        System.out.println("please enter number to find out whether it is divisible by 3, 5, 15 \t");
        int userinput = scanneruserinput.nextInt();

        int expression1 = userinput % 3;
        int expression2 = userinput % 5;
       int expression3 =0;

        System.out.println(expression1);
        System.out.println(expression2);
        System.out.println(expression3);

        if (expression1 == 0) {
        	expression3=expression3+3;
           // System.out.println("buzz divisible by 3");
        }  if (expression2 == 0) {
        	expression3=expression3+5;
            //System.out.println("fizz divisible by 5");
        }  if (expression3 == 8) {
           
            System.out.println("buzzfizz divisible by 15");
       
        }   if (expression3 == 3) {
            System.out.println("fizz divisible by 3");
            
        }
        if (expression3 == 5) {
            System.out.println("buzz divisible by 5");
            
        }
        if (expression3 == 0) {
            System.out.println("not divisible by 3,5,15");
            
        }

        System.out.println("want one more time press Y for yes or N for No");
        Scanner scanneruserYorN = new Scanner(System.in);
        String userinputYorN = scanneruserYorN.next();

        if (userinputYorN.equalsIgnoreCase("Y")) {
            myMethod(); // Call the method recursively
        }
        else {
            System.out.println("Exiting program. Goodbye!");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
