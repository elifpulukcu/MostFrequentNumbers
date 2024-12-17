# Most Frequent Numbers

This Java program analyzes numbers from a text file to determine the most frequently occurring numbers and their frequencies.

## Features

- **Number Loading**: Reads numbers from a specified text file.
- **Frequency Calculation**: Calculates the frequency of numbers in the range **0 to 999**.
- **Most Frequent Numbers**: Identifies and displays the numbers with the highest frequencies.

## Usage

1. **Prepare the Input File**: Create a text file containing the numbers to be analyzed (e.g., `data2.txt`).
2. **Run the Program**: Execute the main class `MostFrequentNumbers` to display the results in the console.

## Methods

- **`loadNumbers(String inputFile)`**: Loads numbers from the specified file and returns them as an integer array.
- **`computeFrequency(int[] numbers)`**: Computes the frequency of numbers and returns a frequency array.
- **`mostFrequent(int[] frequency)`**: Finds and prints the numbers with the highest frequencies.

## Example

Assume the `data2.txt` file contains the following:
23 45 23 67 23 45

### Output

When the program runs, it will produce the following output:

MOST FREQUENT NUMBERS: Number: 23, Frequency: 3 Number: 45, Frequency: 2

## Requirements

- **Java 8** or higher.

## Contributing

Contributions are welcome! Please open an issue first to discuss any changes or improvements.
