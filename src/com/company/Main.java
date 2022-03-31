// Isaias Hernandez
// CSCD210

package com.company;
import java.util.*; // scanner
import java.lang.*; // exceptions


 class Lab7Methods {

     public static int Factorial(int n) { // Method uses recursion to calculate Factorial

         if (n == 0) {

             return 1; // error checks

         } else {

             return (n * Factorial(n - 1)); // keeps recurring until returns 0

         }


     }


     public static int readPosNum(int num) { // Methods that read positive numbers

         return 0;
     }


     public static int oddEvenZero(int num) { // Calculates odd, even, zero

         // Used to find numbers needed
         int copy = num;
         int zero = 0;
         int even = 0;
         int odd = 0;


         while (copy > 0) {

             if (copy % 10 == 0) { // Checks for Zeros

                 zero++;

             } else if (copy % 2 == 0) { // Checks for even

                 even++;

             } else { // checks for odd

                 odd++;

             }

             copy = copy / 10; // shifts last digit


         }


         System.out.print("\n");
         System.out.print("Zero(s): " + zero + "\n" + "Even: " + even + "\n" + "Odd: " + odd);
         return 0;
     }

     public static int lightOrHeavy(int num, int input) { // Calculates average of digits passing through.

         double average = 0.0;
         double copy = 0.0;

         while (copy != num) { // converts num into a copy as a double

             copy++;

         }

         double digits = Math.log10(copy) + 1; // finds number of digits
         double sum = 0; // gets sum

         while (copy != 0) {

             sum = sum + copy % 10;
             copy = copy / 10;

         }

         average = sum / digits;

         if (average > num){

             System.out.println("Number is heavy");

         }
         else if(average < num){

             System.out.println("Number is light");

         }

         return 0;
     }


     public static int printE(int num) { // Calculates E



         int E = 1;
         int counter = num; // grabs number of iterations

         while (counter > 0) {

             // Sequence algorithm

             E = E + (1 / Factorial(counter)); // uses a recursion function to set up algorithm


             counter--;

         }

         return E;
     }


     public static int printReverse(int num) { // reverses digits

         int rev = 0; // sets return value
         int r; // Remainder


         while (num > 0) {

             r = num % 10; //gets single digit

             rev = rev * 10 + r; // shifts number then adds digit

             num = num / 10; // shifts digit


         }

         return rev;
     }

 }



