package org.teachingkidsprogramming.ourProjects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Browns;

public class Pong
{
  public static MultiTurtleWindow mtw = new MultiTurtleWindow();
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setAnimal(Animals.Unicorn);
    Tortoise.setY(NumberUtils.getRandomInt(50, 1400));
    Tortoise.setX(NumberUtils.getRandomInt(50, 2500));
    Tortoise.setPenWidth(10);
    Tortoise.setPenColor(Browns.Maroon);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
  }
}
