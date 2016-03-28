package org.teachingkidsprogramming.section09final;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTDD
{
  public static String convert(int i)
  {
    //    For the numbers being tested, print out either that number, or, 
    //    If that number is evenly divisible by 3, then print the word 'Fizz', 
    if (0 == i % 3) { return "Fizz"; }
    //    If that number is evenly divisible by 5, then print the word 'Buzz', 
    if (0 == i % 5) { return "Buzz"; }
    //    If that number is evenly divisible by either 3 or 5, then print the word 'FizzBuzz'
    if (0 == i % 15) { return "FizzBuzz"; }
    return "" + i;
    //
    //    Write tests using the Assert object via the TDD style
    //
    //    For more complete directions see this page
    //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  }
  @Test
  public void WhatAbout20()
  {
    String result = FizzBuzzTDD.convert(20);
    assertEquals("Buzz", result);
  }
  @Test
  public void YourFace()
  {
    String result = FizzBuzzTDD.convert(12);
    assertEquals("Fizz", result);
  }
}
