package org.teachingkidsprogramming.section08events;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  private ProgramWindow programWindow;
  public SimpleBubble()
  {
    //Create a ProgramWindow titled My Bubble --#1
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    //Have SimpleBubble listen for when the left mouse button is clicked in your program window --#2.2
    programWindow.addMouseLeftClickListener(this);
    //prepareColorPalette (recipe below) --#7
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    //------------- Recipe for prepareColorPalette --#7
    // Add light steel blue to the color wheel --#4
    ColorWheel.addColor(PenColors.Browns.SandyBrown);
    // Add blue to the color wheel --#5
    ColorWheel.addColor(PenColors.Grays.Black);
    // Add dark blue to the color wheel --#6
    ColorWheel.addColor(PenColors.Purples.DarkMagenta);
    // Add purple to the color wheel --#2.3
    ColorWheel.addColor(PenColors.Blues.Navy);
    //------------- End of prepareColorPalette recipe --#7
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    // createBubble (recipe below) --#8
    createBubble(x, y);
  }
  private void createBubble(int x, int y)
  {
    //------------- Recipe for createBubble --#8 changes upon changes
    // Remove previous bubbles from your program window --#9
    programWindow.clearWindow();
    // Set the radius for the circle to a random number between 10 and 50 --#2.5
    int radius = NumberUtils.getRandomInt(10, 100);
    int radius2 = NumberUtils.getRandomInt(10, 100);
    int radius3 = NumberUtils.getRandomInt(10, 100);
    int radius4 = NumberUtils.getRandomInt(10, 100);
    int radius5 = NumberUtils.getRandomInt(10, 100);
    int radius6 = NumberUtils.getRandomInt(10, 100);
    int radius7 = NumberUtils.getRandomInt(10, 100);
    int radius8 = NumberUtils.getRandomInt(10, 100);
    int radius9 = NumberUtils.getRandomInt(10, 100);
    // Create a circle with the radius and the next color from the color wheel --#2.1
    Circle circle = new Circle(radius, ColorWheel.getRandomColorFromWheel());
    Circle circle2 = new Circle(radius2, ColorWheel.getRandomColorFromWheel());
    Circle circle3 = new Circle(radius3, ColorWheel.getRandomColorFromWheel());
    Circle circle4 = new Circle(radius4, ColorWheel.getRandomColorFromWheel());
    Circle circle5 = new Circle(radius5, ColorWheel.getRandomColorFromWheel());
    Circle circle6 = new Circle(radius6, ColorWheel.getRandomColorFromWheel());
    Circle circle7 = new Circle(radius7, ColorWheel.getRandomColorFromWheel());
    Circle circle8 = new Circle(radius8, ColorWheel.getRandomColorFromWheel());
    Circle circle9 = new Circle(radius9, ColorWheel.getRandomColorFromWheel());
    // Move the center of the bubble to the current position of the mouse on the window --#3
    circle.setCenter(x, y);
    circle2.setCenter(x + 100, y);
    circle3.setCenter(x, y + 100);
    circle4.setCenter(x - 100, y);
    circle5.setCenter(x, y - 100);
    circle6.setCenter(x + 100, y + 100);
    circle7.setCenter(x - 100, y + 100);
    circle8.setCenter(x + 100, y - 100);
    circle9.setCenter(x - 100, y - 100);
    // Add the circle to your program window --#2.4
    circle.addTo(programWindow);
    circle2.addTo(programWindow);
    circle3.addTo(programWindow);
    circle4.addTo(programWindow);
    circle5.addTo(programWindow);
    circle6.addTo(programWindow);
    circle7.addTo(programWindow);
    circle8.addTo(programWindow);
    circle9.addTo(programWindow);
    //------------- End of createBubble recipe --#8
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}