import java.util.*;
class NumberGuessing{
  public static void main(String[] a){
   System.out.println("🎉Welcome to the Number Guessing Game! 🎯");
   System.out.println("📜 INSTRUCTIONS 🎯 ");
   System.out.println("1️⃣ Objective \n  🎯 Guess the number ");
   System.out.println("2️⃣ Levels \n  🎮 Three levels of difficulty: Easy, Medium, Hard.");
   System.out.println("3️⃣ Hints \n  💡 Each level will provide hints but you should buy them & According to the level hints count and coins will increase.");
   System.out.println("4️⃣ Starting of the game we will provide u 100 coins.\n  💰 You can use these coins to buy hints.");

   System.out.printf(" Before starting the game, please enter your name 🔥: ");
   Scanner scanner = new Scanner(System.in);
   String name = scanner.nextLine();
   System.out.printf("Welcome %s! Let's start the game.🎯", name);
  }
 }
