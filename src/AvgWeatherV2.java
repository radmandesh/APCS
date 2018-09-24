import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AvgWeatherV2 {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat("00.0");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days' temperatures?");
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
        System.out.println("Temperatures: " + Arrays.toString(weather));
        Arrays.sort(weather);
        if(weather.length <= 1)
            System.out.println("You only entered one day, so the hottest and coldest temperature is " + weather[0] + ".");
        else {
            System.out.println("Two coldest days: " + weather[0] + ", " + weather[1]);
            System.out.println("Two coldest days: " + weather[amt - 1] + ", " + weather[amt - 2]);
        }
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
            System.out.println("Day " + (i+1) + "'s temp:");
            temp = scan.nextInt();
            weather[i] = temp;
        }
        return weather;
    }
}
