public class RohanDeshpandeRandomHat {
    public static void main(String[] args) {
        int[] teams = {1, 2, 3, 4, 5, 6, 7, 8};
        makeTeams(teams);
    }

//makes the teams
    public static void makeTeams(int[] teams){
        int team1;
        int team2;
        for(int i2 = 0; i2 < teams.length; i2++) {
            boolean done = false;
            while (done != true) { //allows this while loop to run until two teams have been grouped together
                team1 = (int) (Math.random() * 8) + 1; //sets team1 and team2 to a random number from 1-8
                team2 = (int) (Math.random() * 8) + 1;
                if (team1 == teams[team1 - 1]) { //checks if the teams are included in the teams array
                    if(team2 == teams[team2 - 1]) {
                        if(team2 != team1) { //checks if the teams are equal to each other
                            teams[team1 - 1] = -1; //sets the value of the team in the array to -1 so as to not use it again
                            teams[team2 - 1] = -1;
                            done = true; //allows the for loop to run again
                            printTeams(team1, team2);
                        }
                    }
                }


            }
        }
    }

    public static void printTeams(int team1, int team2){
        System.out.println(team1 + " VS " + team2);
    }
}
