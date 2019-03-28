package Ch12Recursion;

public class RecursiveFunctions {
    public static void main(String[] args){
        System.out.println(f(12));
    }

    static int f(int x){
        if(x <= 4)
            return x+4;
        else if(x > 4 && x <= 6)
            return f(x+2) + 1;
        else
            return 2 * f(x-3) - 3;
    }
}
