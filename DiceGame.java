// Michelle Chen
// CSC 106 Computer Science 1, Section 680
// December 4, 2022
// This program plays a dice game between two players. The players will roll the dice and can choose to keep one dice or both dice total
//  Whichever player accumulates 30 points wins the game.


//importing scanner
import java.util.Scanner;

//class called DiceGame
    public class DiceGame {
        //main method
        public static void main(String[] args) {
            // calling method
            menu();
        }
    //prompting user with game menu
    public static int menu() {
        int userChoice;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose from the following menu:");
        System.out.println("1. Show Rules");
        System.out.println("2. Start Game");
        System.out.println("3. Exit");
        userChoice = input.nextInt();

        //using if statement to determine game logic
    do {
        if (userChoice == 1) {
            gameInstructions();
        } else if (userChoice == 2) {
            startGame();
        } else if (userChoice == 3) {
            endGame();
        } else {
            System.out.println("Invalid choice");
        }
    } while (userChoice != 3);
    return userChoice;
    }

// method to display game instructions
                private static void gameInstructions() {
            System.out.println("1. Game goal = first to reach exactly 30 points is the Winner! \n"
                            + "2. Accumulating points by each dice roll. \n"
                            + "3. Two pairs of dice is rolled per round. \n"
                            + "4. Choose one dice or both dice total. \n"
                            + "5. Step 4 is added to your player score. \n"
                            + "6. Player turn changes after each roll of the dice. \n"
                            + "7. Player Score > 30, score reset to zero. \n");

                    // call menu method

                  menu();
                }

                // initialize the game method
                public static void startGame(){
                    Scanner sc = new Scanner(System.in);

                    // reference dice object from Dice.java
                    Dice dice = new Dice();
                    // reference to DiceImage class for displayDice method
                    DiceImage2 diceImage2 = new DiceImage2();

//prompt the player for their name

            System.out.println("Hello, what is the name of the first player? ");
            String playerOne, playerTwo;

//getting first player name

            playerOne = sc.nextLine();
            System.out.println("What is the name of the second player? ");

//getting second player name

            playerTwo = sc.nextLine();

// Setting the scores to 0

            int playerOneSum = 0;
            int playerTwoSum = 0;

//looping game logic

            while (true) {
                System.out.println("\nPlayer " + playerOne + " its your turn!");
                System.out.println("Your score: " + playerOneSum);
                System.out.println("Your Roll: ");

//generating random dice values for player one

                dice.die1 = (int) (Math.random() * 6) + 1;
                dice.die2 = (int) (Math.random() * 6) + 1;
                // Display dice emoji
                System.out.println("Dice 1:" + diceImage2.displayDice(dice.die1));
                System.out.println("Dice 2:" + diceImage2.displayDice(dice.die2));

//printing die faces aka emoji

                dice.roll = dice.die1 + dice.die2;
                System.out.println("Total: " + dice.roll);
                System.out.println("-------------------------");

                // print instructions for the next step

                System.out.println("Choose your next move:");
                System.out.println("(1) save dice 1 "+ diceImage2.displayDice(dice.die1));
                System.out.println("(2) save dice 2 "+ diceImage2.displayDice(dice.die2));
                System.out.println("(3) save dice 1 & 2 " + "( " + diceImage2.displayDice(dice.die1) + " & " + diceImage2.displayDice(dice.die2)+")");

                // reads player one input

                int response;
                response = sc.nextInt();

//if response is 1 add the first dice face to sum

                if (response == 1) {
                    playerOneSum = playerOneSum + dice.die1;
                    System.out.println("Your Total: " + playerOneSum);
                }

//if response is 2 add the second dice value to sum

                else if (response == 2) {
                    playerOneSum = playerOneSum + dice.die2;
                    System.out.println("Your Total: " + playerOneSum);
                }

//if response is 3 add the total of two dice to score

                else if (response == 3) {
                    playerOneSum = playerOneSum + dice.roll;
                    System.out.println("Your Total: " + playerOneSum);
                }

//if the sum is greater than 30 set the sum as 0 again

                if (playerOneSum > 30) {
                    playerOneSum = 0;
                    System.out.println("You score is: " + playerOneSum);
                }
                if (playerOneSum == 30) {

//if the sum is 30 the player has won

                    System.out.println("Your total: 30! Congratulations, you WIN!!");
                    break;
                }
// player two game logic
                System.out.println("\nPlayer " + playerTwo + " its your turn!");
                System.out.println("Your score: " + playerTwoSum);
                System.out.println("Your Roll: ");

//generating random dice values for player two

                dice.die1 = (int) (Math.random() * 6) + 1;
                dice.die2 = (int) (Math.random() * 6) + 1;

//display dice emoji

                System.out.println("Dice 1:" + diceImage2.displayDice(dice.die1));
                System.out.println("Dice 2:" + diceImage2.displayDice(dice.die2));
                dice.roll = dice.die1 + dice.die2;
                System.out.println("Total: " + dice.roll);
                System.out.println("-------------------------");
                // print instructions for next step
                System.out.println("Choose your next move:");
                System.out.println("(1) save dice 1 "+ diceImage2.displayDice(dice.die1));
                System.out.println("(2) save dice 2 "+ diceImage2.displayDice(dice.die2));
                System.out.println("(3) save dice 1 & 2 " + "( " + diceImage2.displayDice(dice.die1) + " & " + diceImage2.displayDice(dice.die2)+")");

//read player two response
                int responseTwo;
                responseTwo = sc.nextInt();

                // if response is 1 add the first dice face to sum

                if (responseTwo == 1) {
                    playerTwoSum = playerTwoSum + dice.die1;
                    System.out.println("Your Total: " + playerTwoSum);

// if response is 2 add the second dice value to sum

                } else if (responseTwo == 2) {
                    playerTwoSum = playerTwoSum + dice.die2;
                    System.out.println("Your Total: " + playerTwoSum);

                    //if response is 3 add the total of two dice to score

                } else if (responseTwo == 3) {
                    playerTwoSum = playerTwoSum + dice.roll;
                    System.out.println("Your Total: " + playerTwoSum);
                }
                //if the sum is greater than 30 set the sum as 0 again

                if (playerTwoSum > 30) {
                    playerTwoSum = 0;
                    System.out.println("You score is: " + playerOneSum);
                }
                //if the sum is 30 the player has won

                if (playerTwoSum == 30) {
                    System.out.println("Your total: 30! Congratulations, you WIN!!");
                    break;
                }
            }
        }
// exit the game method
        public static void endGame(){
            System.out.println("Thank you for playing!");
            System.exit(0);
        }
    }







