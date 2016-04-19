package org.teachingkidsprogramming.ourProjects;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Grays;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Oranges;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;

public class NumberTwo implements MouseLeftClickListener
{
  public ProgramWindow programWindow;
  public NumberTwo()
  {
    //    Create a ProgramWindow titled My Bubble --#1.1
    programWindow = new ProgramWindow("My Bubble");
    //    Uncomment the line below -- #1.2
    //programWindow.setWindowVisible(true);
    //    Have SimpleBubble listen for when the left mouse button is clicked in your program window --#2.2
    programWindow.addMouseLeftClickListener(this);
    Tortoise.getBackgroundWindow().addMouseLeftClickListener(this);
    //Show Tortoise
    Tortoise.show();
    //Set the speed of the Tortoise to 10
    Tortoise.setSpeed(10);
    //Make a rectangular button with Tortoise 1
    beforePlayingTheGame();
    makingTheObstacles();
    //MessageBox.showMessage("" + Block1X);
    //
    //
    //
    //3
    //
    //obstacleCoding();
    //Move Tortoise to 100X 300Y
    Tortoise.setX(75);
    Tortoise.setY(300);
    Tortoise.setAngle(90);
    //
    //
    //
    //
    //
  }
  public void makingTheObstacles()
  {
    int Block1X = NumberUtils.getRandomInt(100, 525);
    int Block1Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block1X);
    Tortoise.setY(Block1Y);
    Tortoise.setPenColor(Blues.Blue);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    Tortoise.setPenColor(Grays.Black);
    int Block2X = NumberUtils.getRandomInt(100, 525);
    int Block2Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block2X);
    Tortoise.setY(Block2Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    int Block3X = NumberUtils.getRandomInt(100, 525);
    int Block3Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block3X);
    Tortoise.setY(Block3Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    int Block4X = NumberUtils.getRandomInt(100, 525);
    int Block4Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block4X);
    Tortoise.setY(Block4Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    int Block5X = NumberUtils.getRandomInt(100, 525);
    int Block5Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block5X);
    Tortoise.setY(Block5Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    int Block6X = NumberUtils.getRandomInt(100, 525);
    int Block6Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block6X);
    Tortoise.setY(Block6Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    int Block7X = NumberUtils.getRandomInt(100, 525);
    int Block7Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block7X);
    Tortoise.setY(Block7Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    int Block8X = NumberUtils.getRandomInt(100, 525);
    int Block8Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block8X);
    Tortoise.setY(Block8Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    int Block9X = NumberUtils.getRandomInt(100, 525);
    int Block9Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block9X);
    Tortoise.setY(Block9Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    int Block10X = NumberUtils.getRandomInt(100, 525);
    int Block10Y = NumberUtils.getRandomInt(200, 425);
    Tortoise.setX(Block10X);
    Tortoise.setY(Block10Y);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.move(25);
      Tortoise.turn(90);
    }
    //
    //
    //
    //
    //
    if (Tortoise.getX() <= Block1X + 0 && Tortoise.getX() >= Block1X - 25)
    {
      if (Tortoise.getY() <= Block1Y + 0 && Tortoise.getY() >= Block1Y + 25)
      {
        Tortoise.hide();
      }
    }
    if (Tortoise.getX() <= Block1X + 0 && Tortoise.getX() >= Block1X - 25)
    {
      if (Tortoise.getY() <= Block1Y + 0 && Tortoise.getY() >= Block1Y - 25)
      {
        Tortoise.hide();
      }
    }
  }
  public void beforePlayingTheGame()
  {
    Tortoise.getBackgroundWindow().setBackground(Oranges.DarkOrange);
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
    Tortoise.setY(175);
    Tortoise.setAngle(180);
    Tortoise.move(500);
    //Make game boundary line
    Tortoise.setX(0);
    Tortoise.setY(175);
    Tortoise.setAngle(90);
    Tortoise.move(575);
    Tortoise.setX(0);
    Tortoise.setY(443);
    Tortoise.setAngle(90);
    Tortoise.move(575);
    Tortoise.setX(0);
    Tortoise.setY(175);
    Tortoise.setAngle(180);
    Tortoise.move(268);
  }
  public void onLeftMouseClick(int x, int y)
  {
    //If button is pressed (Hint: Find X First, then find Y)(Mouse Left Click Listener) #5.1
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
    //Make a box around arena that you can't go into
    if (Tortoise.getY() <= 175 && Tortoise.getY() >= 50)
    {
      Tortoise.move(-25);
    }
    if (Tortoise.getY() >= 450)
    {
      Tortoise.move(-25);
    }
    if (Tortoise.getX() >= 575)
    {
      MessageBox.showMessage("You Win! :D");
    }
    if (Tortoise.getX() <= 0)
    {
      Tortoise.move(-25);
    }
    if (Tortoise.getX() >= 625)
    {
      Tortoise.move(-25);
    }
  }
  public static void main(String[] args)
  {
    new NumberTwo();
  }
}