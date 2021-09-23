package com.danieljbishop;

public class PrimitiveTypes {

    public static void main(String[] args) {

        byte myAge = 27;            // Byte is the size of 1 byte (range: -128 to 127)
        short stepsToday = 4_000;   // Short is the size of 2 bytes (range: -32,768 to 32,767)
        int carMileage = 167_547;   // Int is the size of 4 bytes (range: -2,147,483,648 to 2,147,483,647)
        long worldPopulation = 7_790_998_057L;  // Long is the size of 8 bytes (range: -9 Quintillion to 9 Quintillion)

        // Print out of a byte
        System.out.println(myAge);

        // Print out of a short
        System.out.println(stepsToday);

        // Print out of a int
        System.out.println(carMileage);

        // Print out of a long
        System.out.println(worldPopulation);

        /*
        Here are a few reasons why we have different Integer data types in Java:

            1. Memory - Being able to allocate memory better and not wasting memory (for instance,
            if we only had long as out only data type we would lose a lot of memory faster to store variables.)
            2. Efficiency - When is comes to a CPU being able to process this information, having code with
            variables that take more time to process means less time of actual processing
            3. Floating Point Numbers - What we will learn in the next episode is that what if you want a decimal?
            you won't be able to use any of these Integer data types of that type of variable. Give it a shot!
            What is the error that you get when trying to type in this code?

                int myAge = 27.5;
         */

    } // End Main
} // End Class
