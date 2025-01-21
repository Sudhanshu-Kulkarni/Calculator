# Calculator Program

This repository contains a simple calculator program written in Java. The program supports basic arithmetic operations such as addition, subtraction, multiplication, and division, as well as advanced operations like generating the Fibonacci sequence, calculating the sum, and computing the mean of an array.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [How to Run](#how-to-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)

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

### `Calculator` Class
- **Constructor**: Initializes the calculator with an array of two numbers.
- **addition()**: Adds two numbers.
- **subtraction()**: Subtracts the second number from the first.
- **multiplication()**: Multiplies two numbers.
- **division()**: Divides the first number by the second and handles division by zero.
- **fibonacci(int n)**: Generates and returns a Fibonacci sequence up to the `n`th term.
- **sumOfArray(int[] array)**: Returns the sum of the elements in the array.
- **meanOfArray(int[] array)**: Returns the mean of the elements in the array.

### `UserInput` Class
- **userInput()**: Takes two numbers as input from the user.
- **userInputArray()**: Takes an array of integers as input from the user.
- **getUserChoice()**: Displays a menu to the user and returns the user's choice of operation.

### `Main` Class
- The main class contains the entry point (`main()` method) where the user interacts with the program. It handles the input, performs calculations based on user choices, and displays the results.

## How to Run

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/your-username/calculator-program.git
