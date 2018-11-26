import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RohanDeshpandeSum {
    private static int ARRAY_LENGTH = 26; //class constant

    public static void main(String args[]) throws IOException {
        int countLines = 0;
        File f = new File("sum.txt");
        Scanner scanFile = new Scanner(f);

        while (scanFile.hasNextLine()) { //runs while the file has another line
            int[] total = new int[ARRAY_LENGTH]; //array that contains the sum, resets each line
            String line = scanFile.nextLine();
            Scanner scanLine = new Scanner(line);
            while (scanLine.hasNext()) { //runs while the line has another number
                int[] numberExt = printNums(scanLine);
                for (int i = 0; i < numberExt.length - 1; i++) {
                    addition(numberExt, total, i);
                }
            }
            printTotal(total);
            countLines++;
        }
        System.out.println("\n\nTotal lines = " + countLines);
    }

    public static int[] printNums(Scanner scanLine) { //prints the numbers, returns the temporary array for the number added which resets each number
        String number = scanLine.next(); //sets number as a string
        int[] numberExt = new int[ARRAY_LENGTH];
        for (int i = 0; i < number.length(); i++) {
            char temp = number.charAt(number.length() - i - 1); //takes a number from the string variable, starting at last, and sets to corresponding place in array
            String str = "" + temp;
            int tempInt = Integer.parseInt(str); //makes the number taken into an int
            numberExt[numberExt.length - i - 1] = tempInt; //puts the number into the temporary array so that it can be added to total
        }
        System.out.print(number);
        if (scanLine.hasNext())
            System.out.print(" + ");
        else
            System.out.print(" = ");
        return numberExt; //returns the temporary array containing number to be added
    }

    public static void addition(int[] numberExt, int[] total, int i) { //adds
        String s = "" + numberExt[numberExt.length - i - 1]; //takes one number at a time from the temporary number to be added array
        int num = Integer.parseInt(s); //makes it an integer
        total[total.length - i - 1] = num + total[total.length - i - 1]; //adds it to the total for the line
        int remainder = total[total.length - i - 1] / 10; //sets new int equal to it / 10, if it is below 10 it is 0
        total[total.length - i - 1] = total[total.length - i - 1] % 10; //mods the number in the total array by 10, if it is below 10 it stays the same
        total[total.length - i - 2] += remainder; //adds the quotient of division by 10 to the next place, simulating carrying a value
    }

    public static void printTotal(int[] total) { //prints the total for each line
        boolean done = false;
        for (int i = 0; i < total.length; i++) {
            if (total[i] != 0) { //for loop runs for the length of the total array until it hits a number that isn't 0
                for (int j = i; j < total.length; j++) { //once it hits number that isn't 0, it starts another for loop at the value that isn't 0 and prints all the numbers from there on
                    done = true;
                    System.out.print(total[j]);
                }
                break; //ends the outer for loop
            }
        }
        if (done == false) //if the inner for loop is never entered, it will just print 0, as that would be the only case in which it was never entered
            System.out.print("0");
        System.out.println();
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
