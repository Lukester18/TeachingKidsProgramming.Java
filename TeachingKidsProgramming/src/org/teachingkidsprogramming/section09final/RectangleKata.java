package org.teachingkidsprogramming.section09final;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;

public class RectangleKata
{
  public static void main(String[] args)
  {
    //    Draw a rectangle
    Tortoise.drawShape(4, Grays.Black, 80, 5);
    //    Write the steps to code your rectangle out in English 
    //    First, show the tortoise. Then, set the pen width to 5. After that, make a for loop, and change args.length to 4.
    //    Next, inside the brackets, make the tortoise move 80 pixels. Then, make the tortoise turn 90 degrees to the 
    //    right. Now you are done!
    //    Translate from English to Java one line at a time
    Tortoise.show();
    Tortoise.setPenWidth(5);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(80);
      Tortoise.turn(90);
    }
    //    Run your code after each line of Java to make sure it works as expected
  }
}
