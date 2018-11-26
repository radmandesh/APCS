import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class RohanDeshpandePersonalityTest {
    public static void main(String[] args) throws IOException{
        File toAnalyze = fileExists();
        File output = createOutput();
        analyzeFile(toAnalyze, output); //passes the input and output files to be analyzed and printed to respectfully
    }

    public static File fileExists(){ //checks if file exists
        Scanner scan = new Scanner(System.in);
        System.out.print("Input file name: ");
        String fileName = scan.next();
        File f = new File(fileName);
        while(!f.exists()){ //while it doesnt exist, keep asking
            System.out.print("File not found. Try again: ");
            fileName = scan.next();
            f = new File(fileName);
        }
        return f;
    }

    public static File createOutput() throws IOException { //creates the output file;
        Scanner scan = new Scanner(System.in);
        System.out.print("Output file name: ");
        File f = new File(scan.next());
        f.createNewFile();
        return f;
    }

    public static void analyzeFile(File f, File output) throws IOException{ //main analyzing method
        char[] types = {'E', 'I', 'S', 'N', 'T', 'F', 'J', 'P'}; //contains all the different personality types
        PrintStream print = new PrintStream(output);
        Scanner scan = new Scanner(f);
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            print.println(line + ":");
            line = scan.nextLine();
            long[] percentB = new long[4]; //array for percent of Bs -- is of type long because that is the type Math.round returns
            String[] aAndB = new String[4]; //array for the output for # A and # B
            analyzeFirstType(line, percentB, aAndB);
            int j = 1;
            for(int i = 1; i <= 5; i+=2){
                analyzeRest(line, percentB, i, j, aAndB);
                j++;
            }
            printAnswers(aAndB, print, percentB, types);
        }
    }

    public static void analyzeFirstType(String line, long[] percentB, String[] aAndB){ //analyzes introvert vs extrovert -- separate because it is every 7th only, instead of 7th and 8th
        line = line.toLowerCase();
        int a = 0;
        int b = 0;
        for(int i = 0; i < line.length(); i+=7){
            if(line.charAt(i) == ('a'))
                a++;
            else if(line.charAt(i) == ('b'))
                b++;
        }
        percentB[0] = Math.round((double)b / (a+b) * 100);
        aAndB[0] = (a + "A-" + b + "B ");
    }

    public static void analyzeRest(String line, long[] percentB, int j, int indexOfPctB, String[] aAndB){ //analyzes every other type except first type
        int a = 0;
        int b = 0;
        line = line.toLowerCase();
        for(int i = j; i < line.length() - 1; i+=7){
            if(line.charAt(i) == 'a') //this and the following check the first of the pair
                a++;
            else if(line.charAt(i) == 'b')
                b++;
            if(line.charAt(i+1) == 'a') //this and the following check the second
                a++;
            else if(line.charAt(i+1) == 'b')
                b++;
        }
        aAndB[indexOfPctB] = (a + "A-" + b + "B ");
        percentB[indexOfPctB] = Math.round((double)b / (a+b) * 100);
    }

    public static void printAnswers(String[] aAndB, PrintStream print, long[] percentB, char[] types){ //prints everything -- is contained within a while loop, so does one line at a time
        for(int i = 0; i < aAndB.length; i++) //prints the #A and #B
            print.print(aAndB[i]);
        print.print("\n[");
        for(int i = 0; i < percentB.length; i++) { //prints the percentages
            if(i == percentB.length - 1)
                print.print(percentB[i] + "%]");
            else
                print.print(percentB[i] + "%, ");
        }
        int j = 0;
        print.print(" = ");
        for(int i = 0; i < types.length; i+=2){ //prints the personality types by checking if it is greater than 50 or less than 50, and the one in the pair that is either majority A or majority B
            if(percentB[j] < 50)
                print.print(types[i]);
            else if(percentB[j] > 50)
                print.print(types[i+1]);
            else
                print.print('X');
            j++;
        }
        print.println("\n");
    }
}