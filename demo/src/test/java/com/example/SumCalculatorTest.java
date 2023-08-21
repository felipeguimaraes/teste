package com.example;


import org.junit.Test;

import static org.junit.Assert.*;


public class SumCalculatorTest {
  
  @Test
  public void testSum() {
    SumCalculator calculator = new SumCalculator();
    int result = calculator.sum(2, 3);
    assertEquals(5, result);
  }
  
  @Test
  public void testSumWithNegativeNumbers() {
    SumCalculator calculator = new SumCalculator();
    int result = calculator.sum(-2, -3);
    assertEquals(-5, result);
  }
  
  @Test
  public void testSumWithZero() {
    SumCalculator calculator = new SumCalculator();
    int result = calculator.sum(0, 5);
    assertEquals(5, result);
  }


}