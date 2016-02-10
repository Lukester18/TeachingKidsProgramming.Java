package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Browns;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Greens;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#10
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    //    The current branch length = 60 --#1.2
    int currentBranchLength = 60;
    //    drawBranch(recipe below) --#2.1
    //
    drawBranch(currentBranchLength);
  }
  private static void drawBranch(int currentBranchLength)
  {
    //    ------------- Recipe for drawBranch --#2.2
    //        If the current branch length is greater than zero, do the rest of this recipe --#5
    if (currentBranchLength > 0)
    {
      //        adjustColor (recipe below)--#15.1
      //        ------------- Recipe for adjustColor --#15.2
      HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
      if (currentBranchLength = 10)
      {
        //            A 10 pixel long branch is lime --#20
        Tortoise.setPenColor(Greens.Lime);
      }
      else if (currentBranchLength = 20)
      {
        //            A 20 pixel long branch is forest green --#19
        Tortoise.setPenColor(Greens.ForestGreen);
      }
      else if (currentBranchLength = 30)
      {
        //            A 30 pixel long branch is dark green --#18
        Tortoise.setPenColor(Greens.DarkGreen);
      }
      else if (currentBranchLength = 40)
      {
        //            A 40 pixel long branch is olive --#17
        Tortoise.setPenColor(Greens.Olive);
      }
      else if (currentBranchLength = 50)
      {
        //            A 50 pixel long branch is sienna --#14
        Tortoise.setPenColor(Browns.Sienna);
      }
      else if (currentBranchLength = 60)
      {
        //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13 
        Tortoise.setPenColor(Browns.SaddleBrown);
      }
      else
      {
        Tortoise.getPenColor();
      }
      //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
      //        ------------- End of adjustColor --#15.3
      //
      //        Move the tortoise the length of the current branch --#1.1
      Tortoise.move(currentBranchLength);
      //        drawLowerBranches (recipe below) --#6.1
      //
      drawLowerBranch(currentBranchLength);
      //
      //    ------------- End of drawBranch recipe --#2.3
    }
  }
  private static void drawLowerBranch(int currentBranchLength)
  {
    //        ------------- Recipe for drawLowerBranches --#6.2
    //            Turn the Tortoise 30 degrees to the right --#3
    Tortoise.turn(30);
    //            drawShorterBranch (recipe below) --#8.1
    //
    drawShorterBranch(currentBranchLength);
    //
    //            Turn the Tortoise 60 degrees to the left --#7
    Tortoise.turn(-60);
    //            drawShorterBranch --#9
    drawShorterBranch(currentBranchLength);
    //            Turn the Tortoise 30 degrees to the right --#12
    Tortoise.turn(30);
    //            adjustColor --#16
    //            Move the tortoise backward the length of the current branch --#11
    Tortoise.move(currentBranchLength * -1);
    //        ------------- End of drawLowerBranches recipe --#6.3
  }
  private static void drawShorterBranch(int currentBranchLength)
  {
    //            ------------- Recipe for drawShorterBranch --#8.2
    //                drawBranch (10 pixels shorter) --#4
    drawBranch(currentBranchLength - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
}