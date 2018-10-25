public class Arrays2D {
    public static void main(String[] args){
        int[][] table = new int[5][10];
        for(int row = 0; row < table.length; row++){
            System.out.println();
            for(int column = 0; column < table[row].length; column++){
                table[row][column] = (column+1) * (row+1);
                System.out.print(table[row][column] + "\t");
            }

        }
    }
}
