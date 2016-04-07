package org.teachingkidsprogramming.ourProjects;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Whites;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Yellows;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;

public class DoubleLoop implements MouseLeftClickListener
{
  private ProgramWindow programWindow;
  public DoubleLoop()
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
    Tortoise.setPenWidth(5);
    Tortoise.setX(200);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setX(150);
    Tortoise.setY(175);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setX(200);
    Tortoise.setY(175);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setX(250);
    Tortoise.setY(175);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //Colors
    //
    //
    //
    //
    //
    Tortoise.setPenWidth(5);
    //
    Tortoise.setPenColor(Yellows.Yellow);
    Tortoise.setX(300);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setPenColor(Reds.Red);
    Tortoise.setX(350);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setPenColor(Blues.Aqua);
    Tortoise.setX(400);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setPenColor(Grays.Black);
    Tortoise.setX(450);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //
    Tortoise.setPenColor(Grays.Black);
    Tortoise.setX(500);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    Tortoise.setPenWidth(3);
    Tortoise.setPenColor(Whites.White);
    Tortoise.setX(500);
    Tortoise.setY(125);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(25);
    }
    //Make a finish line
    Tortoise.setPenColor(Grays.Black);
    Tortoise.setPenWidth(2);
    Tortoise.setX(600);
    Tortoise.setY(0);
    Tortoise.setAngle(180);
    Tortoise.move(500);
    //Move Tortoise to 100X 300Y
    Tortoise.setX(100);
    Tortoise.setY(300);
    Tortoise.setAngle(0);
  }
  public void onLeftMouseClick(int x, int y)
  {
    //If button is pressed (Hint: Find X First, then find Y)(Mouse Left Click Listener) #5.1
    Tortoise.show();
    if (x >= 200 && x <= 225)
    {
      if (y >= 175 && y <= 200)
      {
        //Move Tortoise 25 pixels up #6
        Tortoise.setAngle(180);
        Tortoise.move(25);
      }
      else if (y >= 125 && y <= 150)
      {
        //Move Tortoise 25 pixels up #6
        Tortoise.setAngle(0);
        Tortoise.move(25);
      }
    }
    else if (x >= 150 && x <= 175)
    {
      if (y >= 175 && y <= 200)
      {
        //Move Tortoise 25 pixels to the left #6
        Tortoise.setAngle(-90);
        Tortoise.move(25);
      }
    }
    else if (x >= 250 && x <= 275)
    {
      if (y >= 175 && y <= 200)
      {
        //Move Tortoise 25 pixels to the left #6
        Tortoise.setAngle(90);
        Tortoise.move(25);
      }
    }
    if (Tortoise.getX() == 600)
    {
      Tortoise.explode();
      Tortoise.setPenColor(Reds.Crimson);
      Tortoise.setPenWidth(5);
    }
    if (Tortoise.getY() <= 225 && Tortoise.getY() >= 100)
    {
      if (Tortoise.getX() <= 550 && Tortoise.getX() >= 125)
      {
        Tortoise.setX(100);
        Tortoise.setY(300);
      }
    }
  }
  public static void main(String[] args)
  {
    new DoubleLoop();
  }
}