# Most Frequent Numbers

A Java program that finds the most frequent numbers in an input text file and displays the numbers together with their frequency. Frequency is defined as the number of times a number is repeated in the text file.

The program is written using functions, in a modular way.

* loadNumbers: Loads numbers from the text file to an integer array
  * Method Input: Input filename, e.g., “data1.txt”
  * Method Output: Integer array which stores all the numbers in the input text file
  
* computeFrequency: Computes the frequencies of numbers from 0 to 999. Assumes that numbers in the text file are in the range of [0,999]. For example, if the frequency array position 102 is 9, i.e., frequency[102]=9, it means that number 102 is repeated 9 times in the input text file.
  * Method Input: Numbers array
  * Method Output: Frequency array
