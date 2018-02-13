import java.util.Scanner;  // needed for Scanner



/*
Ducci Challenge

A Ducci sequence is a sequence of n-tuples of integers, sometimes known as "the Diffy game", because it is based on sequences.

Given an n-tuple of integers (a_1,a_2,...,a_n)} , the next n-tuple in the sequence is formed by taking the absolute differences of neighbouring integers:

(a_1,a_2,...,a_n) --> (|a_1-a_}|,|a_2-a_3|,...,|a_n-a_1|)

It has been found that starting with any n-tuple of integers, and repeating the procedure you will always get (0,0,....,0)

We will write a program that given a starting tuple, will print how many steps it takes to get to have a tuple where all elements are zero.

*/


public class Ducci{


    /**
     * Returns the number of steps it takes to get the zero tuple (all elements are zero)
     * 
     * @param sequence the starting tuple represented as an array of integers.
     * @return the number of steps
     */
    private static int getNumberOfSteps(int[] sequence){
        //TODO Your code goes here

        return 0;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input; // to store the user's input
        
        System.out.print("Enter how many numbers do you want to start with: ");
        input = scanner.nextLine();
        int size = Integer.parseInt( input );  // converts a String into an int value

        int[] values = new int[size];

        System.out.println("Enter the number, each in a new line");

        for (int i=0;i<size;i++){
            input = scanner.nextLine();
            values[i]=Integer.parseInt(input);
        }

        System.out.println("It took "+String.valueOf(getNumberOfSteps(values)+" steps"));
    }
}