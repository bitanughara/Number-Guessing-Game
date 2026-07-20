import java.util.*;
public class Number_Guessing_Game{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int again=1;
        System.out.println("===== Number Guessing Game Start =====\n");
        while(again==1){
            int number = (int)(Math.random() * 100) + 1;
            int guess;
            int attempts=0;
            while(true){
                System.out.print("Enter your guess :");
                guess = sc.nextInt();
                attempts++;
                if(guess==number){
                    System.out.println("Correct ! You guessed the number.");
                    System.out.println("Total attempts :"+attempts);
                    System.out.println("\n===== Number Guessing Game End =====");
                    System.out.print("\nEnter 1 to Play Again or 0 to Exit: ");
                    again = sc.nextInt();
                    break;
                }
                else if(guess<number){
                    System.out.println("Guess a High Number!");
                }
                else if(guess>number){
                    System.out.println("Guess a Low Number!");
                }
            }
        }
        System.out.println("\nThank You for playing !");
        sc.close();
        
    }
}
