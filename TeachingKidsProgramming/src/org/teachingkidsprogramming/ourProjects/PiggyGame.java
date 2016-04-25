package org.teachingkidsprogramming.ourProjects;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class PiggyGame
{
  public static void main(String[] args)
  {
    String firstRollHold1 = MessageBox.askForTextInput("Do you wish to 'Roll' the dice or 'Hold' your score?");
    if ("Roll".equalsIgnoreCase(firstRollHold1))
    {
      int diceRoll = NumberUtils.getRandomInt(1, 6);
      MessageBox.showMessage("You rolled a " + diceRoll + ".");
      int firstScore1 = diceRoll;
      int newScore1 = diceRoll;
      MessageBox.showMessage("Your score is " + newScore1);
    }
  }
}