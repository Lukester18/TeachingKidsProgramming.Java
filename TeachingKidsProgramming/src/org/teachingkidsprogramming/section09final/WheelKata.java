package org.teachingkidsprogramming.section09final;

import org.teachingextensions.logo.Tortoise;

public class WheelKata
{
  public static void main(String[] args)
  {
    setUpTheDrawing();
    for (int i = 0; i < 20; i++)
    {
      drawTwoSides();
      Tortoise.move(150);
      Tortoise.turn(90);
    }
    Tortoise.move(2);
  }
  private static void setUpTheDrawing()
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setY(175);
    Tortoise.setPenWidth(2);
  }
  private static void drawTwoSides()
  {
    for (int i = 0; i < 2; i++)
    {
      drawASide();
    }
  }
  private static void drawASide()
  {
    Tortoise.move(150);
    Tortoise.turn(125);
  }
  //
  //    TIP: Here's one possible set of English comments to solve this challenge
  //    note the re-factoring as well
  //
  //    Show the tortoise 
  //    Make the tortoise move as fast as possible 
  //    Set the start position to 175 on the Y-axis
  //    Set the pen width to 2 pixels
  //    Do the following 20 times 
  //      Draw one side 2 times
  //        Draw a line of 150 pixels
  //        Turn to the right 125 degrees
  //      Draw line of 150 pixels
  //      Turn to the right
  //    Repeat
  //    Move 2 pixels
  //
}