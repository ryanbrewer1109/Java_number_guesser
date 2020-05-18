// CS-2265
// Program #6 - Java Interactive GUI Application for Number Guessing with Colored Hints
// M. Ryan Brewer
// Student # 1540164

import java.util.Random;
import java.lang.Math;

/*
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout; // specifies how components are arranged
*/
   
class NumberGuesser { 
   private static int guessCount = 0;
   public static int userGuess = 0;
   public static int lastGuess;
   public static boolean isWarmer;
   public static int randomNumber;
   public static boolean isCorrect = false;
 
   public static void main (String [] args){
      String greeting_1 = "I have a number between 1 and 1000. Can you guess my number?";
      String greeting_2 = "Please enter a number for your first guess and then hit Enter.";
//   new NumberGuesserFrame(greeting_1, greeting_2);
   new NumberGuesserFrame();

//   NumberGuesserFrame gameFrame = new NumberGuesserFrame(greeting_1, greeting_2);    
      
   /*       
       startGame();
       int userInput = 500; // Driver to test helper functions logic
 evaluateGuess(userInput);
  
      JFrame gameFrame = new JFrame("Program #6 - Number Guessing Game");
      gameFrame.setSize(600,450);
      gameFrame.setVisible(true);
      gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JButton startBtn = new JButton("Start");
      JTextField userGuessField = new JTextField(4);     
      JLabel greeting_1 = new JLabel("I have a number between 1 and 1000. Can you guess my number?");
      JLabel greeting_2 = new JLabel("Please enter a number for your first guess and then hit Enter.");
      FlowLayout flow = new FlowLayout(FlowLayout.LEFT); 
      
      gameFrame.setLayout (flow);
      gameFrame.add(startBtn);                             
      gameFrame.add(userGuessField);
      gameFrame.add(greeting_1);
      gameFrame.add(greeting_2);
   */
   } //end main


/* *******************
*  HELPER FUNCTIONS  *
**********************/


////////////////////////////
// evaluateGuess() method //
////////////////////////////
   public static String evaluateGuess(int currentGuess){
      if(guessCount == 0){
         isWarmer = true;
      }
      else{
         //  To determine " warmer or colder" compare target number to (1) the last guess and (2) the current guess
         int differenceLast =  java.lang.Math.abs(randomNumber - lastGuess);
         int differenceNow =  java.lang.Math.abs(randomNumber - currentGuess);
         isWarmer = differenceLast > differenceNow;
         }
      
      if(currentGuess == randomNumber){
   		isCorrect = true;
         return messageWhenCorrect(currentGuess);
      }
      else{
         isCorrect = false;
         return messageWhenNotCorrect(currentGuess);
   	}
   
   }
   
   
   public static int chooseRandNum(){
      int returnValue;
      int newRandNum;
      do{
      Random rand = new Random(); 
      newRandNum = rand.nextInt(1001);
      }
      while (newRandNum == 0);
      return newRandNum;
   } // end chooseRandNum()
   
   
   public static String  messageWhenCorrect(int currentGuess){   
   	String correctGuessMsg = "" + currentGuess + " is Correct! Total guesses was " + guessCount + ". Click the button to Start a New game.";
      return correctGuessMsg;
      }
   

   public static String  messageWhenNotCorrect(int currentGuess){
      
      StringBuilder sb = new StringBuilder("");
      sb.append(currentGuess);
   
      if (currentGuess > randomNumber){
         sb.append(" is too High! ");
      }
      else {
         sb.append(" is too High! ");
   
      }
   
      if(isWarmer){
         sb.append("But you are getting WARMER. Enter guess number " );
      }
      else {
         sb.append("And you are getting COLDER. Enter guess number ");
      }
   
      sb.append((guessCount + 1));
      sb.append(".");   
   
      return sb.toString();
   } // End messageWhenNotCorrect()
   
   
   public static void initializeGameVars(){
      isWarmer = true;
      lastGuess = 0;
      guessCount = 0;
      randomNumber = chooseRandNum();
      } // end initializeGame
      
// ***************************
//   startGame Method        *
// ***************************
   public static void startGame(){
   
   initializeGameVars();
   
   }
} // end NumberGuesser class