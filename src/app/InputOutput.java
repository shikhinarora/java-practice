package app;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class InputOutput {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();
        // String number = sc.nextLine();
        String text = sc.nextLine();

        
        System.out.println(number * 2);
        // System.out.println(Integer.parseInt(number) * 2);
        System.out.println(text);
        sc.close();
    }
}
