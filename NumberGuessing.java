import java.util.*;
import java.io.*;
import java.lang.*;
class Level1{
  public void startGame(String playerName){
    Scanner sc = new Scanner(System.in);
    System.out.println("In this level, you will have 3 attempts to guess the number between 1 and 10. \n You have 2 hints and u can buy hints for 10 coins each.💡");
    System.out.println("You will start with 100 coins. If you win this level, you will earn 50 coins! 🍀");
    System.out.println("Good luck, " + playerName + "! Let's see if you can guess the number! 🎯");
    int number = (int) (Math.random()*10) + 1;
    int attempts = 3;
    int hints = 2;
    while(attempts>0){
      System.out.println("You have " + attempts + " attempts left and " + coins + " coins.");
      System.out.println("Enter Your guess: ");      
      int quess = sc.nextInt();
      if(guess==number){
        System.out.println("Congratulations "+  playerName +"! You guessed the correct number.🎉");
        System.out.println("You've earned 50 coins! 💰");
        break;
      }
      else{
            attempts--;
            coins -= 10;
            System.out.println("Wrong guess! You have " + attempts + " attempts left.");
            if (hintsAvailable > 0) {
                System.out.print("Do you want to buy a hint for 10 coins? (yes/no): ");
                String buyHint = scanner.next();
                if (buyHint.equalsIgnoreCase("yes") && coins >= 10) {
                    coins -= 10;
                    hintsAvailable--;
                    //1st hint
                    if(hintsAvailable == 1) {
                        System.out.println("Hint1: The number is " + (numberToGuess % 2 == 0 ? "even" : "odd") + ".");
                    }
                    if(hintsAvailable == 0) {
                        System.out.println("Hint2: The number is " + (numberToGuess > 5 ? "greater than 5" : "less than or equal to 5") + ".");
                    }
             }
          }
      }
    if(attempts==0){
      System.out.println("Sorry " + playerName + ", you've run out of attempts! The number was " + numberToGuess + ".");
    }
}

class Level2{
  public void startGame(String playerName){
    System.out.println("In this level, you will have 5 attempts to guess the number between 1 and 100. \n You have 4 hints and u can buy hints for 10 coins each.💡");
    System.out.println("If you win this level, you will earn 50 coins! 🍀");
    System.out.println("Good luck, " + playerName + "! Let's see if you can guess the number! 🎯");
    int number = (int) (Math.random()*100) + 1;
    int attempts = 5;
    int hints = 3;
   while(attempts>0){
      System.out.println("You have " + attempts + " attempts left and " + coins + " coins.");
      System.out.println("Enter Your guess: ");      
      int quess = sc.nextInt();
      if(guess==number){
        System.out.println("Congratulations "+  playerName +"! You guessed the correct number.🎉");
        System.out.println("You've earned 50 coins! 💰");
        break;
      }
      else{}
      attempts--;
    }
    if(attempts==0){}

}
}
  class Level3{
  public void startGame(String playerName){
    System.out.println("In this level, you will have 10 attempts to guess the number between 1 and 1000. \n You have 5 hints and u can buy hints for 10 coins each.💡");
    System.out.println("If you win this level, you will earn 500 coins! 🍀");
    System.out.println("Good luck, " + playerName + "! Let's see if you can guess the number! 🎯");
    int number = (int) (Math.random()*1000) + 1;
    int attempts = 10;
    int hints = 4;
    while(attempts>0){
      System.out.println("You have " + attempts + " attempts left and " + coins + " coins.");
      System.out.println("Enter Your guess: ");      
      int quess = sc.nextInt();
      if(guess==number){
        System.out.println("Congratulations "+  playerName +"! You guessed the correct number.🎉");
        System.out.println("You've earned 50 coins! 💰");
        break;
      }
      else{}
      attempts--;
    }
    if(attempts==0){}
}
}
class NumberGuessing{
  public static void main(String[] a){
   Scanner scanner = new Scanner(System.in);
   System.out.println("🎉Welcome to the Number Guessing Game! 🎯");
   System.out.println("Are u ready to play?(YES/NO)");
   String ready = scanner.nextLine();
   if(ready.equalsIgnoreCase("yes")){
       System.out.println("🎉 Great! Let's start the game.");
   } else {
       System.out.println("No problem! Come back when you're ready 🎮. ");
       return;
   }
  System.out.println("📜 Read Game Instructions Carefully 📜");
  System.out.println("Enter \"Instructions\" to know the Instructions of the game 🎮: ");
   String rules = scanner.nextLine();
   if(rules.equalsIgnoreCase("Instructions")){
       System.out.println("📜 INSTRUCTIONS 🎯 ");
       System.out.println("1️⃣ Objective \n  🎯 Guess the number within given attempts.");
       System.out.println("2️⃣ Levels \n  🎮 Three levels of difficulty: Easy, Medium, Hard.");
       System.out.println("3️⃣ Hints \n  💡 Each level will provide hints but you should buy them.");
       System.out.println("4️⃣ 💰 The cost of hints & no.of attempts changes based on the level.🪙 You will be told the cost & no.of attempts before each level begins.");
       System.out.println("5️⃣ Starting of the game we will provide u 100 coins.\n  💰 You can use these coins to buy hints.");
   }
   System.out.printf(" Before starting the game, please enter your name 🔥: ");
   Scanner scanner = new Scanner(System.in);
   String name = scanner.nextLine();
   System.out.printf("Welcome %s! Let's start the game.🎯", name);
   System.out.println("\n\n LEVEL 1 🎮 ");
   Level1 l1 = new Level1();
   l1.startGame(name);

  }
 }
