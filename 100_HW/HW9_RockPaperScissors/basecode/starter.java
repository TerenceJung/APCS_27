/*
 *	Author: Terence Jung
 *  Date: 10/24/2026
 *	Collaborator(s): none
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = "";
        while (!response.equalsIgnoreCase("done")){
            System.out.println("Would you like to play the computer? (yes/no/done)");
            response = sc.nextLine();

            if (response.equalsIgnoreCase("yes")){
                System.out.println();
                System.out.println("--------------------------------------------------------------");
                String user;
                while (true){
                    System.out.println("Please enter rock/paper/scissors:");
                    user = sc.nextLine();
                    if (user.equalsIgnoreCase("rock") || user.equalsIgnoreCase("paper") || user.equalsIgnoreCase("scissors")){
                        break;
                    }
                    System.out.println("Invalid input! Please try again.");
                }

                String computer = getObject();
                int result = compare2(user, computer);
                if (result == 0){
                    System.out.println("You tied!");
                } else if (result == 1) {
                    System.out.println("You won!!!");
                } else {
                    System.out.println("You lost! :(");
                }
                System.out.println();
                System.out.println("--------------------------------------------------------------");
            }

            else if (response.equalsIgnoreCase("no")){
                System.out.println();
                System.out.println("How many times would you like the computer to play itself?");
                int games = sc.nextInt();
                sc.nextLine();
                int player1Wins = 0;
                int player2Wins = 0;
                int ties = 0;
                int x = 0;

                while (x < games) {
                    String player1 = getObject();
                    String player2 = getObject();
                    int result = compare2(player1, player2);
                    if (result == 0) {
                        ties++;
                    }
                    else if (result == 1) {
                        player1Wins++;
                    }
                    else {
                        player2Wins++;
                    }
                    x++;
                }

                System.out.println("Player 1 wins: " + player1Wins);
                System.out.println("Player 2 wins: " + player2Wins);
                System.out.println("Ties: " + ties);
                System.out.println();
                System.out.println("--------------------------------------------------------------");

            }
            else if (!response.equalsIgnoreCase("done")){
                System.out.println();
                System.out.println("--------------------------------------------------------------");
                System.out.println("You typed an invalid input!");
            }
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Thanks for playing!");

    }

    //methods
        public static String getObject(){
            int rannum = (int)(Math.random()*3+1);
            if(rannum == 1){
                return "rock";
            }
            else if (rannum == 2){
                return "paper";
            }   
            else{
                return "scissors";
            }
        }
        public static int compare2(String player1, String player2){
            if(player1.equals(player2)){
                return 0;
            }
            else if((player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors")) || (player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("rock")) || (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper"))){
                return 1;
            }
            else{
                return 2;
            }
        }
}
