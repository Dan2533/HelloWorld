package com.Danielle;

public class Main {

       /* 1st Challenge  Hello World!
          Step 1: add psvm to create the main method */

    public static void main(String[] args) {
        /* Step 2: In the method body print a message that says "Hello World!"
           Step 3: In the method body print a message that says "Hello Danielle!" */

        System.out.println("Hello, World!");
        System.out.println("Hello, Danielle!");

        /* 2nd Challenge Create a Declaration Statement
           Step 1: Define a variable (data type and name) data type = (int) (Variables must be assigned before they can be used.)
           Step 2: Name the variable (myFirstNumber)
           Step 3: Set the variable = 5 */

        int myFirstNumber = 5;

        //Step 4: use system.out.println to print out the value of the variable.

        System.out.println(myFirstNumber);

        /* 3rd Challenge
           Step 1: Define a variable (data type and name) data type = (int)
           Step 2: Name the variable (firstNumber), we must change it to be able to print because myFirstNumber is already defined in the scope.
           Step 3: Set the variable = 10 + 5 */

        int firstNumber = 10 + 5;

        // Step 4: use system.out.println to print out the value of the variable

        System.out.println(firstNumber);

        /* 4th Challenge adding parentheses
           Step 1: Define a variable (data type and name) data type = (int)
           Step 2: Name the variable (firstParentheses), we must change it to be able to print because firstNumber is already defined in the scope.
           Step 3: Set the variable = 10 + 5
           Step 4: use system.out.println to print out the value of the variable( firstParentheses) */

        int firstParentheses = (10 + 5) +(2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = firstParentheses + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);

        /* 5th Challenge  Expressions
            Step 1: Create and declare additional variables and add to our program.
            Step 2: mySecondNumber which is an in and assign a value of 12 to it.
            Step 3: myThirdNumber, also an int with a value of 6
            Step 4: Put the declaration statements above the sout line.
            Step 5: Sum the value of firstParentheses + mySecondNumber + myThirdNumber into a variable named myTotal.
            Step 6: Use system.out.println to print out the value of the variable(myTotal)

         */

    }
}