package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestJava {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the first number: ");
      int firstNumber = scanner.nextInt();

      System.out.print("Enter the second number: ");
      int secondNumber = scanner.nextInt();

      SumCalculator calculator = new SumCalculator();
      int sum = calculator.sum(firstNumber, secondNumber);

      System.out.printf("The sum of %d and %d is %d\n", firstNumber, secondNumber, sum);
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter a valid number.");
    }
  }
}