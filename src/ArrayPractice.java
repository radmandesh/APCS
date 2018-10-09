import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        practice1();
        randomArray();
        randomArray2();
        int[] array = {5, 2, 4, 1, 3};
        System.out.println(array.length);
        System.out.println(Arrays.toString(oliverAlgo(array)));
        inArraySwap(array);
        System.out.println(Arrays.toString(array));

    }

    public static void practice1(){
        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void randomArray(){
        int amt = (int)(Math.random() *10) + 1;
        int[] array = new int[amt];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(array));

    }

    public static void randomArray2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What size array?");
        int amt = scan.nextInt();
        int[] array = new int[amt];
        int[] arrayForArray = new int[amt];
        for(int i = 0; i < array.length; i++){
            System.out.println("What is first number?");
            int first = scan.nextInt();
            System.out.println("What is second number?");
            int second = scan.nextInt();
            array[i] = (int)(Math.random() * (second - first)) + (first);
        }
        System.out.println(Arrays.toString(array));

    }

    public static int[] oliverAlgo(int[] oa){
        int[] reverse = new int[oa.length];
        for(int i = 0; i < oa.length; i++){
            reverse[i] = oa[oa.length-(i+1)];
        }
        return reverse;
    }

    public static void inArraySwap(int[] array){
        int times = 0;
        int i = 0;
        int temp;

        while(array.length/2 != times){
            temp = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i] = temp;
            times++;
        }
    }
}

