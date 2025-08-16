import java.util.*;
import java.io.*;
class Level1{
  public void startGame(String playerName){
    System.out.println("In this level, you will have 3 attempts to guess the number between 1 and 10. \n You have 2 hints and u can buy hints for 10 coins each.💡");
    System.out.println("You will start with 100 coins. If you win this level, you will earn 50 coins! 🍀");
    System.out.println("Good luck, " + playerName + "! Let's see if you can guess the number! 🎯");
}

class NumberGuessing{
  public static void main(String[] a){
   System.out.println("🎉Welcome to the Number Guessing Game! 🎯");
   System.out.println("📜 INSTRUCTIONS 🎯 ");
   System.out.println("1️⃣ Objective \n  🎯 Guess the number within given attempts.");
   System.out.println("2️⃣ Levels \n  🎮 Three levels of difficulty: Easy, Medium, Hard.");
   System.out.println("3️⃣ Hints \n  💡 Each level will provide hints but you should buy them.");
   System.out.println("4️⃣ 💰 The cost of hints & no.of attempts changes based on the level.\n🪙 You will be told the cost & no.of attempts before each level begins.");
   System.out.println("5️⃣ 💵Starting of the game we will provide you 100 coins.\n  💰 You can use these coins to buy hints.");

   System.out.printf(" Before starting the game, please enter your name 🔥: ");
   Scanner scanner = new Scanner(System.in);
   String name = scanner.nextLine();
   System.out.printf("Welcome %s! Let's start the game.🎯", name);
   System.out.println("\n\n LEVEL 1 🎮 ");
   Level1 l1 = new Level1();
   l1.startGame(name);

  }
 }
