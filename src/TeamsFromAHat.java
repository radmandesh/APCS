public class TeamsFromAHat {
    public static void main(String[] args) {
        int[] teams = {1, 2, 3, 4, 5, 6, 7, 8};
        int team1;
        int team2;
        int i = 0;
        team1 = (int) (Math.random() * 8) + 1;
        while (teams[i] != team1) {
            i++;
        }
        teams[i] = -1;
        i = 0;
        team2 = (int) (Math.random() * 8) + 1;
        while (teams[i] != team2) {
            i++;
        }
        teams[i] = -1;
        System.out.println(team1 + " VS " + team2);
        boolean done = false;
        while (done != true) {
            team1 = (int) (Math.random() * 8) + 1;
            team2 = (int) (Math.random() * 8) + 1;
            for (int j = 0; j <= 5; j++) {
                if (team1 == teams[team1 - 1]) {
                    teams[team1 - 1] = -1;
                }
            }

        }
    }
}
