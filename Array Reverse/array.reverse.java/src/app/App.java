package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int[][] array = new int[a][b];

            implement arrayObj = new implement();
            arrayObj.toString(arrayObj.arrayReverse(array, a, b), b, a);
        }

        scanner.close();
    }
}

