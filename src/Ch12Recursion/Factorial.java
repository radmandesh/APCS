package Ch12Recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(recursiveFactorial(4));
        printStar(4);
        System.out.println(pow(3,-1));
    }
    public static int recursiveFactorial(int num){
        if(num - 1 <= 0) {
            return 1;
        }
        else{
            return recursiveFactorial(num - 1) * num;
        }
    }

    public static void printStar(int num){
        if(num == 0)
            System.out.println();
        else{
            System.out.print("*");
            printStar(num - 1);
        }
    }

    public static int pow(int base, int powr){
        if(powr <= 0)
            return 1;
        else{
            return base * pow(base, powr-1);
        }

    }
}
