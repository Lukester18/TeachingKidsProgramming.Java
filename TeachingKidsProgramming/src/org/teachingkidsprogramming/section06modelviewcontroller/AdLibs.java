package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Enter an adjective followed by a noun (singular).");
    //String currentEdVerb = MessageBox.askForTextInput("Enter a verb ending in '-ed'.");
    String currentBodyPart = MessageBox.askForTextInput("Enter an adjective.");
    String edVerb = MessageBox.askForTextInput("Enter a verd ending in -ed");
    String currentStory = "One day, you decided to walk to the store to buy a " + currentAdverb + ". "
        + "Then you cooked the " + currentAdverb + " for a " + currentBodyPart
        + " stew. You then ate the stew and " + edVerb + " happily ever after. ";
    //  Ask the user to enter an adverb, save it as currentAdverb --#2
    //  Ask the user to enter a verb ending in '-ed', save it as currentEdVerb --#4
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    //  Set the value of the currentStory to the word "Today " --#1.2
    // This is a change.mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm 
    //  Add the words "I woke " + currentAdverb + ". " to the currentStory --#3
    //  Add the words '"Then I " + currentEdVerb + " " to the currentStory --#5
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7 
    //  Show the currentStory in a message box as a message --#1.1
    MessageBox.showMessage(currentStory);
  }
}