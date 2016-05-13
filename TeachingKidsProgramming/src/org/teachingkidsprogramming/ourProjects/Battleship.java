package org.teachingkidsprogramming.ourProjects;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Battleship
{
  public static void main(String[] args)
  {
    int Player1life = 2;
    int Player2life = 2;
    int[] returnValues;
    returnValues = theBatttttle(Player1life, Player2life);
    Player1life = returnValues[0];
    Player2life = returnValues[1];
    String check1 = "" + Player1life;
    MessageBox.showMessage(check1);
    for (int i = 0; i < 7; i--)
    {
      if (Player1life > 0 && Player2life > 0)
      {
        theBatttttle(Player1life, Player2life);
      }
      if (Player1life <= 0 || Player2life <= 0)
      {
        System.exit(0);
      }
    }
  }
  public static int[] theBatttttle(int Player1life, int Player2life)
  {
    int Player1Number1 = NumberUtils.getRandomInt(1, 10);
    int Player1Number2 = NumberUtils.getRandomInt(1, 10);
    int Player2Number1 = NumberUtils.getRandomInt(1, 10);
    int Player2Number2 = NumberUtils.getRandomInt(1, 10);
    MessageBox.showMessage("Player 1's primary number is " + Player1Number1 + ". Player 1's secondary unumber is "
        + Player1Number2 + ".");
    int Player2guess = MessageBox.askForNumericalInput("Player 2: What do you think Player 1's number is? (1-10)");
    if (Player2guess == Player1Number1)
    {
      Player1life = 0;
    }
    if (Player2guess == Player1Number2)
    {
      Player1life = Player1life - 1;
    }
    MessageBox.showMessage(
        "Player 2's primary number is " + Player2Number1 + ". Player 2's secondary number" + Player2Number2 + ".");
    int Player1guess = MessageBox.askForNumericalInput("Player 1: What do you think Player 2's number is? (1-10)");
    if (Player1guess == Player2Number1)
    {
      Player2life = 0;
    }
    if (Player1guess == Player2Number2)
    {
      Player2life = Player2life - 1;
    }
    if (Player1life == 1)
    {
      MessageBox.showMessage(
          "Good job player 2, you have hit Player 1. Their hull integrity is now at 50%. Only one more hit to go!!!!");
    }
    if (Player1life <= 0)
    {
      MessageBox.showMessage(
          "Congratulations Player 2!!!! You killed player1!!! You win!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    if (Player2life == 1)
    {
      MessageBox.showMessage(
          "Good job player 1, you have hit Player 2. Their hull integrity is now at 50%. Only one more hit to go!!!!");
    }
    if (Player2life <= 0)
    {
      MessageBox.showMessage(
          "Congratulations Player 1!!!! You killed player2!!! You win!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    int [] afterTurn = [Player1life, Player2life];
    return afterTurn;
    //something or other is really cool. cuz da's coo.
    
  }
}