import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class RohanDeshpandeSum {
    public static void main(String args[])throws IOException {


        File f = new File("sum.txt");
        Scanner scanFile = new Scanner(f);

        while(scanFile.hasNextLine()) {
            int[] total = new int[27];
            String line = scanFile.nextLine();
            Scanner scanLine = new Scanner(line);
            while(scanLine.hasNext()) {
                String number = scanLine.next();
                char[] numberExt = number.toCharArray();
                for(int i = 0; i < numberExt.length; i++){
                    System.out.print(numberExt[i]);
                }
                if(scanLine.hasNext())
                    System.out.print(" + ");
                else
                    System.out.print(" = ");
                for(int i = 0; i < numberExt.length; i++) {
                    String s = "" + numberExt[numberExt.length - i - 1];
                    int num = Integer.parseInt(s);
                    total[total.length-i-1] = num + total[total.length-i-1];
                    int remainder = total[total.length-i-1] / 10;
                    total[total.length-i-1] = total[total.length-i-1] % 10;
                    total[total.length-i-2] += remainder;


                }

            }
            boolean done = false;
            for(int i = 0; i < total.length; i++){
                if(total[i] != 0) {
                    for(int j = i; j < total.length; j++) {
                        done = true;
                        System.out.print(total[j]);
                    }
                    break;
                }
            }
            if(done == false)
                System.out.print("0");
            System.out.println();
        }
    }
}


//1. create file scanner *
//2. create two arrays, one for total number and one for the number you are adding.
//3. for the second array, typecast int as a string and make the array its length
//4. for the first array, in order to start it at the end, start at array.length - 1 - its length(typecast, find length)
//5. for loop -- for the length of the second array. set the last element in the first array equal to the sum of the
//last elements of both.
//6. if the last element % 10 is not 0, then divide it by 10 and add 1 to the next to last element.
//7. i--
