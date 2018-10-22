import java.util.Arrays;
import java.util.Scanner;

public class RohanDeshpandeRandomHatV2 {
    public static void main(String[] args) {
        int numTeams;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("How many teams? (An even number)");
            numTeams = scan.nextInt();
        } while ((double) numTeams % 2 != 0);
        //System.out.println("exited do while loop");
        int[] teams = new int[numTeams];
        for (int i = 0; i < teams.length; i++) {
            teams[i] = i + 1;
            //System.out.println("got to for loop");
        }
        makeTeams(teams, numTeams);


    }

    //makes the teams
    public static void makeTeams(int[] teams, int numTeams) {
        //System.out.println("got to maketeams");
        int team1;
        int team2;
        int numPairs = 0;
        while (numPairs < teams.length / 2) { //allows this while loop to run until two teams have been grouped together
            //System.out.println("got to while loop" + numTeams);
            team1 = (int) (Math.random() * teams.length) + 1; //sets team1 and team2 to a random number from 1-length of teams
            team2 = (int) (Math.random() * numTeams) + 1;
            if (team1 == teams[team1 - 1]) { //checks if the teams are included in the teams array
                if (team2 == teams[team2 - 1]) {
                    if (team2 != team1) { //checks if the teams are equal to each other
                        teams[team1 - 1] = -1; //sets the value of the team in the array to -1 so as to not use it again
                        teams[team2 - 1] = -1;
                        numPairs++; //allows the for loop to run again
                        printTeams(team1, team2);
                    }
                }
            }


        }
        System.out.println(Arrays.toString(teams));

    }

    public static void printTeams(int team1, int team2) {
        System.out.println(team1 + " VS " + team2);
    }
}
