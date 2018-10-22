import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
public class RohanDeshpandeWeatherAnalysis {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat("00.0");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many days' temperatures?");
        int amt = scan.nextInt();
        //step 1: declare
        int weather[] = new int[amt];
        int temp = 0;
        //step 2: fill w user info
        weather = makeArray(weather, temp, scan, amt);
        //step 3: take avg of it
        double avgTemp = avgTemp(weather, amt)/amt;
        //step 4: calculate amt of days above the avg
        int daysAboveAvg = daysAboveAvg(weather, avgTemp, amt);
        //step 5: print the results, with decimal format
        System.out.println("Average temp = " + df.format(avgTemp));
        System.out.println(daysAboveAvg + " days were above average.");
    }

    public static double avgTemp(int[] weather, int amt){
        double avgTemp = 0;
        for(int i = 0; i < amt; i++){
            avgTemp += weather[i];
        }
        return avgTemp;
    }

    public static int daysAboveAvg(int[] weather, double avgTemp, int amt){
        int daysAboveAvg = 0;
        for(int i = 0; i < amt; i++){
            if(weather[i] > avgTemp)
                daysAboveAvg++;
        }
        return daysAboveAvg;
    }

    public static int[] makeArray(int[] weather, int temp, Scanner scan, int amt){
        for(int i = 0; i < amt; i++){
            System.out.print("Day " + (i+1) + "'s temp:");
            temp = scan.nextInt();
            weather[i] = temp;
        }
        return weather;
    }
}
