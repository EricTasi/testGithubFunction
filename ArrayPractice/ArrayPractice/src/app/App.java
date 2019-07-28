package app;

import java.util.Arrays;


public class App {

    static double arrayAverage(int[][] array){
        int total = 0;
        double average = 0.0;
    
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[x].length; y++){
            total += array[x][y];
        }
    }
    
        average = total / array.length;
        return average;
    }
    public static void main(String[] args) throws Exception {
        int[][] r = {{10, 23, 24, 56, 57, 67, 68, 85, 85, 86, 96, 99, 102, 141, 1424, 3524, 4583,
            4983,59802,848783,488784,487829},{10, 23, 24, 56, 57, 67, 68, 85, 85, 86, 96, 99, 102, 141, 1424, 3524, 4583,
                4983,59802,848783,488784,487829},{10, 23, 24, 56, 57, 67, 68, 85, 85, 86, 96, 99, 102, 141, 1424, 3524, 4583,
                    4983,59802,848783,488784,487829},{10, 23, 24, 56, 57, 67, 68, 85, 85, 86, 96, 99, 102, 141, 1424, 3524, 4583,
                        4983,59802,848783,488784,487829}};
        int total = 0;
        double average = 0.0;

        average = arrayAverage(r);

        for(int x = 0; x < r.length; x++) {
            for(int y = 0; y < r[x].length; y++){
            System.out.println(r[x][y]);
            total += r[x][y];
        }
    }
       // System.out.println("the maximum value is " + r[r.length - 1][r.length - 1]);
        //System.out.println("the minimum value is " + r[0][0]);
        System.out.println("the total of the \"r array \" is " + total);
        System.out.println("the average of the \"r array \" is " + average);
    }
}