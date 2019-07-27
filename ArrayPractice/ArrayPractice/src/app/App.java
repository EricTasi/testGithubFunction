package app;

public class App {
    public static void main(String[] args) throws Exception {
        final int ARRAY_SIZE = 3;
        int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];
        int total = 0;
        int i = 0;

        for(int x = 0; x < table.length; x++){
            for(int y = 0; y < table.length; y++){
                i += 1;
                table[x][y] = 3;
            }
        }
        System.out.println("this array has " + i + " element");

        for(int x = 0; x < table.length; x++){
            for(int y = 0; y < table[x].length; y++){
                total += table[x][y];
            }
        }
        System.out.println(total);
    }
}