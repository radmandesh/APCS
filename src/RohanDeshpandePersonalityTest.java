import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RohanDeshpandePersonalityTest {
    public static void main(String[] args) throws IOException{
        File toAnalyze = fileExists();
        File output = createOutput();
        analyzeFile(toAnalyze);
        output.delete();
    }
    public static File fileExists(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input file name: ");
        String fileName = scan.next();
        File f = new File(fileName);
        while(!f.exists()){
            System.out.print("File not found. Try again: ");
            fileName = scan.next();
            f = new File(fileName);
        }
        return f;
    }

    public static File createOutput() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Output file name: ");
        File f = new File(scan.next());
        f.createNewFile();
        return f;
    }

    public static void analyzeFile(File f) throws IOException{
        Scanner scan = new Scanner(f);
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            Scanner scanLine = new Scanner(line);
            System.out.println(line + ":");
            line = scan.nextLine();
            double[] percentB = new double[5];
            analyzeFirstType(line, percentB);
            for(int i = 1; i <= 5; i+=2){
                analyzeAnswers(line, percentB, i);
            }
        }
    }

    public static void analyzeAnswers(String line, double[] percentB, int j){
        int a = 0;
        int b = 0;
       // for(int i = j; i <= line.length()){

       // }
    }

    public static void analyzeFirstType(String line, double[] percentB){
        line = line.toLowerCase();
        int a = 0;
        int b = 0;
        for(int i = 0; i < line.length(); i+=7){
            if(line.charAt(i) == ('a'))
                a++;
            else if(line.charAt(i) == ('b'))
                b++;
        }
        percentB[0] = b / (a+b);
        System.out.print(a + "A-" + b + "B \n");
    }
}
