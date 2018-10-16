import java.util.Arrays;
import java.util.Scanner;

public class MostCommonDigit {
    public static void main (String[] args){
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Number to analyze?");
        int n = scan.nextInt();
        algorithm(array, n);


    }

    public static void algorithm(int[] array, int n){
        int tempNum;
        while(n > 0){
            tempNum = n%10;
            array[tempNum - 1]++;
            n/=10;
        }
        System.out.println(Arrays.toString(array));
        int max = 0;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] > max)
                max = i+1;
        }
        System.out.println("Most popular number: " + max);


    }
}
