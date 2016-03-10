package org.teachingkidsprogramming.section07objects;

import org.teachingextensions.WindowUtils.MultiTurtleWindow;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.Turtle;

public class SuperTurtles
{
  public MultiTurtleWindow mtw = new MultiTurtleWindow();
  public SuperTurtles()
  {
    showSomeTurtles();
  }
  public static void main(String[] args)
  {
    new SuperTurtles();
  }
  private void showSomeTurtles()
  {
    //  makeSpeedyTurtle (recipe below) --#2.0
    makeSpeedyTurtle();
    //  makeSlowTurtle (recipe below) --#4.0
    makeSlowTurtle();
    //  makeCrazyTurtle (recipe below) --#6.0
    madeCrazyTurtle();
  }
  private void madeCrazyTurtle()
  {
    //  ------------- Recipe for makeCrazyTurtle --#5.1
    //        Create a new crazyTurtle instance  
    Turtle crazyTurtle = new Turtle();
    //        Add your crazyTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(crazyTurtle);
    //        Have your crazyTurtle draw a 55 pixel long lightning bolt
    crazyTurtle.drawLightning(55);
    //  ------------- End of makeCrazyTurtle --#5.2
    new Sound(Sound.TKPSound.Gong);
    crazyTurtle.speak();
  }
  private void makeSlowTurtle()
  {
    //  ------------- Recipe for makeSlowTurtle --#3.0
    //        Create a new slowTurtle instance 
    Turtle slowTurtle = new Turtle();
    //        Add your slowTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(slowTurtle);
    //        Have your slowTurtle draw a upside down triangle with 50 pixel sides
    slowTurtle.drawTriangle(-50);
    //  ------------- End of makeSlowTurtle --#3.1
  }
  private void makeSpeedyTurtle()
  {
    //  ------------- Recipe for makeSpeedyTurtle --#1.0
    //        Create a new speedyTurtle instance  
    Turtle speedyTurtle = new Turtle();
    //        Add your speedyTurtle to your MultiTurtleWindow
    mtw.addAndShowTurtle(speedyTurtle);
    //        Set the speed of your speedyTurtle to the fastest possible  
    speedyTurtle.setSpeed(10);
    //        Have your speedyTurtle draw a triangle with 100 pixel sides
    speedyTurtle.drawTriangle(100);
    //  ------------- End of makeSpeedyTurtle --#1.1 
  }
}
