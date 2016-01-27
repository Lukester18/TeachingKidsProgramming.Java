package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 8; i++)
    {
      //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
      int randomNumber = NumberUtils.getRandomInt(1, 100);
      //    Do the following 8 times --#9.1
      //         Ask the user for a guess --#1
      int guess = MessageBox.askForNumericalInput("guess");
      if (guess == randomNumber)
      {
        //         If the guess is correct --#4
        //               Play a bell --#2
        Sound.playBeep();
        //               Tell the user that they won the game  --#3
        MessageBox.showMessage("You Won!!!");
        //               and exit --#10
        System.exit(0);
      }
      else if (guess >= 9)
      {
        //         Otherwise, if the guess is too high --#6
        //               Tell the end user that it is too high --#5
        MessageBox.showMessage("Your guess is too High!!!");
      }
      else if (guess <= 9)
      {
        //         Otherwise, if the guess is too low --#8
        //               Tell the end user that it is too low --#7
        MessageBox.showMessage("Your guess is too Low!!!");
      }
      //    Repeat --#9.2
    }
    //    After 8 incorrect guesses tell the user they've lost --#11
    MessageBox.showMessage("You Lost!!! :(");
  }
}
