package org.teachingkidsprogramming.ourProjects;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;

public class NumberTwo implements MouseLeftClickListener
{
  private ProgramWindow programWindow;
  public NumberTwo()
  {
    //    Create a ProgramWindow titled My Bubble --#1.1
    programWindow = new ProgramWindow("My Bubble");
    //    Uncomment the line below -- #1.2
    programWindow.setWindowVisible(true);
    //    Have SimpleBubble listen for when the left mouse button is clicked in your program window --#2.2
    programWindow.addMouseLeftClickListener(this);
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    //Show Tortoise
    Tortoise.show();
    //Set the speed of the Tortoise to 10
    Tortoise.setSpeed(10);
    //Make a rectangular button with Tortoise 1
    beforePlayingTheGame();
    int Block1X = NumberUtils.getRandomInt(100, 525);
    int Block1Y = NumberUtils.getRandomInt(200, 425);
  }
  private void beforePlayingTheGame()
  {
    Tortoise.setPenWidth(5);
    Tortoise.setX(200);
    Tortoise.setY(75);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setX(150);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setX(200);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setX(250);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //Make a finish line
    Tortoise.setPenColor(Grays.Black);
    Tortoise.setPenWidth(2);
    Tortoise.setX(575);
    Tortoise.setY(0);
    Tortoise.setAngle(180);
    Tortoise.move(500);
    //Make game boundary line
    Tortoise.setX(0);
    Tortoise.setY(175);
    Tortoise.setAngle(90);
    Tortoise.move(625);
    //Move Tortoise to 100X 300Y
    Tortoise.setX(75);
    Tortoise.setY(300);
    Tortoise.setAngle(90);
  }
  public void onLeftMouseClick(int x, int y)
  {
    //If button is pressed (Hint: Find X First, then find Y)(Mouse Left Click Listener) #5.1
    Tortoise.show();
    if (x >= 200 && x <= 225)
    {
      if (y >= 125 && y <= 150)
      {
        //Move Tortoise 25 pixels up #6
        Tortoise.setAngle(180);
        Tortoise.move(25);
      }
      else if (y >= 75 && y <= 100)
      {
        //Move Tortoise 25 pixels up #6
        Tortoise.setAngle(0);
        Tortoise.move(25);
      }
    }
    else if (x >= 150 && x <= 175)
    {
      if (y >= 125 && y <= 150)
      {
        //Move Tortoise 25 pixels to the left #6
        Tortoise.setAngle(-90);
        Tortoise.move(25);
      }
    }
    else if (x >= 250 && x <= 275)
    {
      if (y >= 125 && y <= 150)
      {
        //Move Tortoise 25 pixels to the left #6
        Tortoise.setAngle(90);
        Tortoise.move(25);
      }
    }
    //Make a box around controls that you can't go into
    if (Tortoise.getY() <= 175 && Tortoise.getY() >= 50)
    {
      if (Tortoise.getX() <= 300 && Tortoise.getX() >= 125)
      {
        Tortoise.move(-25);
      }
    }
  }
  public static void main(String[] args)
  {
    new NumberTwo();
  }
}