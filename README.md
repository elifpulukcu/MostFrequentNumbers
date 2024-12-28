# Most Frequent Numbers

A simple Java program that reads integer values from a text file (`.txt`), stores them in an array, calculates their frequencies, and then prints out the number(s) with the highest frequency.

## About

This repository includes:
- A **file I/O** routine to load integers from a text file line by line.
- A **frequency computation** method that counts occurrences of each integer.
- A **reporting** step that identifies and prints the most frequently appearing number(s) along with their frequency.

It serves as a clear example of **basic Java file handling**, **array manipulation**, and **simple statistical analysis** in a straightforward console application.

---

## Table of Contents

1. [Features](#features)  
2. [Project Structure](#project-structure)  
3. [Usage](#usage)  
4. [How It Works](#how-it-works)  
5. [Contributing](#contributing)  
6. [License](#license)

---

## Features

- **File Loading**  
  - Uses a two-pass approach to determine the number of lines, then reads and converts each line to an integer.  
  - Gracefully handles `FileNotFoundException` by printing an error message and exiting.

- **Frequency Calculation**  
  - Maintains an integer array (e.g., `int[1000]`) to count how many times each number appears.  
  - Assumes numbers fall within a certain range (0–999).  

- **Most Frequent Number**  
  - Identifies the maximum frequency value.  
  - Prints all numbers matching that frequency (in case of ties).

---

## Project Structure

```
.
└── MostFrequentNumbers.java    # Main class with file I/O, frequency computation, and reporting
└── data2.txt                   # Example input file containing one integer per line
```

---

## Usage

1. **Compile**  
   ```bash
   javac MostFrequentNumbers.java
   ```

2. **Run**  
   ```bash
   java OOP.MostFrequentNumbers
   ```
   - If your code is in a package named `OOP`, ensure you run it from the correct directory structure, e.g.,  
     ```bash
     java OOP.MostFrequentNumbers
     ```
   - Otherwise, remove the `package OOP;` line or adjust your classpath accordingly.

3. **Check Output**  
   - The program prints “File is available” if `data2.txt` is found.  
   - It then displays all numbers that share the highest frequency and their corresponding frequency count.

4. **Customize**  
   - Update the file name `"data2.txt"` in `main()` if you want to process a different input file.  
   - Adjust the array size `frequency[1000]` if your data range is larger than 0–999.

---

## How It Works

1. **Loading the File**  
   - `loadNumbers()` checks how many lines the file has, then reads each line into an integer array.  
   - Exits gracefully if the file is not found.

2. **Computing Frequency**  
   - `computeFrequency()` initializes an array (e.g., `int[] frequency = new int[1000];`) to count each integer’s occurrences.  
   - Increments `frequency[value]` for each integer in the array.

3. **Finding Most Frequent**  
   - `mostFrequent()` scans through the frequency array to find the maximum value.  
   - Prints all integers with that frequency.

4. **Main Flow**  
   - `main()` ties everything together:
     1. Loads the numbers from `data2.txt`.
     2. Computes their frequency.
     3. Prints the most frequent number(s).

---

## Contributing

1. **Fork** this repository to your own GitHub account.  
2. **Clone** your fork locally and create a **branch** for your feature/fix.  
3. **Commit** and **push** changes to your branch.  
4. **Open a Pull Request** describing your modifications.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

Enjoy identifying the most common numbers in your dataset! If you have any questions or suggestions, feel free to open an issue in this repository.
