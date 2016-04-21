package org.teachingkidsprogramming.ourProjects;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class PiggyGame
{
  public static void main(String[] args)
  {
    String firstRollPlayer1 = MessageBox.askForTextInput("Do you wish to 'Roll' the dice or 'Hold' your score?");
    if ("Roll".equalsIgnoreCase(firstRollPlayer1))
    {
      int diceRoll = NumberUtils.getRandomInt(1, 6);
      MessageBox.showMessage("You rolled a " + diceRoll + ".");
      int player1StartingScore = diceRoll;
      int player1NewScore = player1StartingScore;
      int player1Current = player1NewScore;
      MessageBox.showMessage("Your score is " + player1NewScore + ".");
    }
  }
}