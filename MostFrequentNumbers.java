package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Elif Pulukçu
 * @since February 19, 2019
 * Program Explanation: This program takes data from an input text file(.txt), 
 * and then display the most frequent numbers with their frequency
 */
public class MostFrequentNumbers {
    /**
     * In this method, the length of the received array is determined and a new array of the same length is created.
     * All the numbers are kept in this new array
     * @param inputFile This method takes an input which is our text file's name
     * @return This method returns an integer array that named dataArray. It stores all the numbers from the input text file
     */
    public static int[] loadNumbers(String inputFile){
        File file = new File (inputFile);
        Scanner input = null;
        Scanner input2 = null;
        
        try { 
            input = new Scanner (file);
            input2 = new Scanner (file);
            System.out.println ("File is available"); //What to do if normal flow is provided
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage() + "\nThe program is closing...");
            System.exit(1); //In an exceptional case (the file cannot be found) we receive a warning
        }
        
        int lineMeter = 0;
        while(input2.hasNext()){ //The counter continues if the line is not empty
            String lines;
            lines = input2.nextLine();
            lineMeter++;
        }
        
        int[] dataArray = new int[lineMeter];
        int register = 0;
        while(input.hasNext()){
            String line;
            line = input.nextLine();
            line = line.trim(); //This String method eliminates leading and trailing spaces
            dataArray[register] = Integer.parseInt(line); //In JAVA, parseInt()method converts string to integer
            register++;
        }
        return dataArray;
    }
    
    /**
     * In this method, most commonly used numbers are identified and kept their frequency of use in an array
     * @param numbers This method takes an integer array that contain numbers
     * @return This method returns an array of frequency
     */
    
    public static int[] computeFrequency(int[] numbers){
        int[] frequency = new int [1000];
        for(int i=0; i<numbers.length; i++)
            frequency[numbers[i]] += 1;
        return frequency;
    }
    /**
     * This method finds most repetitive number/numbers
     * @param frequency This method uses the array of frequencies we create
     */
    public static void mostFrequent (int[] frequency){
        int mostRepetitive = 0;
        for(int i=0; i<frequency.length; i++) //Get most repetitive number/numbers
            if(frequency[i]>= mostRepetitive)
                mostRepetitive = frequency[i];

        for(int i=0; i<frequency.length; i++)
            if(frequency[i]==mostRepetitive)
                System.out.println("Number: " + i + ", Frequency: " + frequency[i]); //Print out most frequent number/numbers
    }
    
    public static void main (String[]args){
        int[] numbers = loadNumbers("data2.txt"); //Declare an array for the data from file
        int[] frequency = computeFrequency(numbers); //Declare an array for the frequency
            System.out.println("Most Frequent Numbers:".toUpperCase());
            mostFrequent(frequency);     
    }
}
