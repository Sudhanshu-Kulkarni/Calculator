# Calculator Program

This repository contains a simple calculator program written in Java. The program supports basic arithmetic operations such as addition, subtraction, multiplication, and division, as well as advanced operations like generating the Fibonacci sequence, calculating the sum, and computing the mean of an array.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [How to Run](#how-to-run)


## Overview
This program allows the user to perform various mathematical operations using a command-line interface. The user is prompted to choose an operation, and based on the choice, the program performs the calculation and displays the result.

The program includes three main classes:
- `Calculator`: Contains methods for arithmetic operations, Fibonacci sequence generation, and array-related operations.
- `UserInput`: Handles user input for numbers, arrays, and menu choices.
- `Main`: The entry point of the program, where the user interacts with the menu and selects operations.

## Features
- **Basic Operations**: Addition, subtraction, multiplication, and division of two numbers.
- **Fibonacci Sequence**: Generate a Fibonacci sequence up to the `n`th term.
- **Array Operations**: Calculate the sum and mean of an array of numbers.

## Classes and Methods

### Calculator Class
This class performs arithmetic operations and other mathematical functions.

- **Constructor: `Calculator(int[] numbers)`**  
  Initializes the calculator with two numbers (provided as an integer array).

- **Method: `int addition()`**  
  Returns the sum of the two numbers stored in the `numbers` array.

- **Method: `int subtraction()`**  
  Returns the difference between the two numbers stored in the `numbers` array.

- **Method: `int multiplication()`**  
  Returns the product of the two numbers stored in the `numbers` array.

- **Method: `int division()`**  
  Returns the quotient of the two numbers stored in the `numbers` array.  
  If division by zero occurs, it prints a warning and returns 0.

- **Method: `int[] fibonacci(int n)`**  
  Returns an array containing the Fibonacci sequence up to the `n`th term.

- **Method: `int sumOfArray(int[] array)`**  
  Returns the sum of all the elements in the provided array.

- **Method: `double meanOfArray(int[] array)`**  
  Returns the mean (average) of the elements in the provided array.

### UserInput Class
This class handles user input for the calculator program.

- **Method: `int[] userInput()`**  
  Prompts the user to input two integers and returns them in an integer array.

- **Method: `int[] userInputArray()`**  
  Prompts the user to input an array of integers, returning the array.

- **Method: `int getUserChoice()`**  
  Displays a menu of operations and returns the user's choice.


## How to Run

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Sudhanshu-Kulkarni/calculator-program.git

Compile the Java files:
- javac *.java

Run the Main class:
- java Main

Follow the prompts in the console to select the desired operation.
