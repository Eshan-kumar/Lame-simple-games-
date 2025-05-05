import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String [] args){
        // Welcome msg
        // variables
        // user input
        // check
        // score
        // output
        Scanner scanner=new Scanner(System.in);
        Random random = new Random();
        String again="";
        int score=0;
        int timesPlayed=0;
        while(!again.equals("no")){

            System.out.println("Rock Paper and Scissors");
            System.out.println(" 0 = Rock ");
            System.out.println(" 1 = Paper ");
           System.out.println(" 2 = Scissors ");
            System.out.print("Enter ur choice: ");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            String[] choices = {"rock", "paper", "scissors"};
            int rand= random.nextInt(0,3);

            if (rand == userInput) {
                System.out.println("Its a tie");
            } else if (rand ==0 && userInput == 1) {
                System.out.println("Computer chose "+choices[0]);
                System.out.println("Player wins");
                score++;
            } else if (rand == 1 && userInput == 0) {
                System.out.println("Computer chose "+choices[1]);
                System.out.println("Computer wins");
            } else if (rand == 0 && userInput == 2) {
                System.out.println("Computer chose "+choices[0]);
                System.out.println("Player wins");
                score++;
            } else if (rand == 2 && userInput == 0) {
                System.out.println("Computer chose "+choices[2]);
                System.out.println("Computer wins");
            } else if (rand == 1 && userInput == 2) {
                System.out.println("Computer chose "+choices[1]);
                System.out.println("Player wins");
                score++;
            } else if (rand == 2 && userInput == 1) {
                System.out.println("Computer chose "+choices[2]);
                System.out.println("Computer wins");
            } else {
                System.out.println("Invalid input");
                System.out.println(rand);
            }

            System.out.print("Do u want to play again (yes/no) ?");
            again = scanner.nextLine().toLowerCase();
            if (rand == userInput) {
            }else {
                timesPlayed++;
            }
        }
        System.out.println("Your total score is: "+ score +" out of "+timesPlayed+"\n (Ties not counted)");
        scanner.close();
    }
}
