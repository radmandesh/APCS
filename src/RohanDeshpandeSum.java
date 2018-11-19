import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RohanDeshpandeSum {
    public static void main(String args)throws IOException {
        int[] total = new int[25];

        File f = new File("sum.txt");
        Scanner scanFile = new Scanner(f);
        Scanner scanLine = new Scanner(scanFile.nextLine());
        Scanner scanChar = new Scanner(scanLine.next());
        while(scanFile.hasNextLine()) {
            while(scanChar.hasNext()) {

            }
        }
        }
    }


//1. create file scanner
//2. create two arrays, one for total number and one for the number you are adding.
//3. for the second array, typecast int as a string and make the array its length
//4. for the first array, in order to start it at the end, start at array.length - 1 - its length(typecast, find length)
//5. for loop -- for the length of the second array. set the last element in the first array equal to the sum of the
//last elements of both.
//6. if the last element % 10 is not 0, then divide it by 10 and add 1 to the next to last element.
//7. i--