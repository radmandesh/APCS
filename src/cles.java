import java.util.Arrays;

public class cles {
    public static void main (String[] args){
        int[] array = {27, 15, 15, 11, 27};
        System.out.println(mode(array));
    }

    public static int mode(int[] array){
        Arrays.sort(array);
        int[] numSeen = new int[array.length];
        int j = 1;
        int numSeenIndex = 0;
        while(j < array.length){
            if(array[j - 1] == array[j]){
                numSeen[numSeenIndex]++;
                j++;
            }
            else {
                numSeenIndex++;
                j++;
            }
        }
        //add up the number of previous instances in numSeen to get to the value of the mode
        int largest = 0;
        int largestIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(numSeen[i] > largest){
                largest = numSeen[i];
                largestIndex = i;
            }
        }
        numSeenIndex = 0;
        for(int i = 0; i < largestIndex; i++){
            numSeenIndex+=numSeen[i];
        }
        System.out.println(numSeenIndex);
        System.out.println(Arrays.toString(numSeen));
        return array[numSeenIndex];
    }
}
