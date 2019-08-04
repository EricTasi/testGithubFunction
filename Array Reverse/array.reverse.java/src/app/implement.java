package app;

import java.util.Scanner;

public class implement {

    Scanner scanner = new Scanner(System.in);

    public int[][] arrayReverse(int[][] array, int a, int b){


        for(int i = 0; i < a; i++){
            for(int j = 0; j < b ; j++){
                try{
                    array[i][j] = scanner.nextInt();
                }
                catch(Exception e){
                    System.out.print("NoSuchElementException");
                }
            }
        }

        int[][] arrayR = new int[b][a];
        while(scanner.hasNext()){
            for(int i = 0; i < a; i++){
                for(int j = 0; j < b; j++){
                    arrayR[j][i] = array[i][j];
                }
            }
        }
        return arrayR;


        }
    
    public void toString(int[][] array, int a, int b){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    }

