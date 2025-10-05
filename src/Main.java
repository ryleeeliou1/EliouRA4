import java.util.*;
/**
 * This is a program that reads a list of integers from the user input,
 * sorts them in ascending order, and returns the stack back to the user.
 *
 * Usage:
 * To compile: javac Main.java
 * To run: java Main
 * Javadoc: javadoc -d doc Main.java NumberLists.java
 *
 * This program also successfully demonstrates the use of the Collections
 * Framework.
 *
 * @since 1.0
 * @author ryleeeliou
 */
public class Main {
    /**
     * Main entry point of program. Reads the amount of integers and the
     * integer values from the user and sorts them using Collections.sort(),
     * then stores them in a stack and prints it.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Read n and then n integers
        System.out.println("How many numbers do you want to enter?");
        int n = input.nextInt();

        System.out.println("Enter " + n + " numbers:");
        Stack<Integer> raw = NumberLists.readIntegers(input,n);
//Builds Stack (reuses Collections.sort)

        Stack<Integer> sorted = NumberLists.sortedStack(raw);
        System.out.println("Sorted Stack: " + sorted);
//Close scanner
        input.close();
        }

    }