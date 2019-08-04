package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int detect = 0;

            Function func = new Function();

            for(int x = a; x < b; x++){
                int digit = func.findDigit(x);
                int total = func.culculate(x, digit);

                if(total == x){
                    System.out.print(x + " ");
                    detect++;
                }
            }
            
            System.out.println(detect);
            
            if(detect == 0){
                System.out.print("none");
            }
        }
        System.out.println();
        scanner.close();
    }
}

class Function {

    public int findDigit(int number){
        int n = 10;
        int digit = 0;

        while(number / n != number){
            number = number / n;
            digit++;
        }

        return digit;
    }

    public int culculate(int number,int digit){
        int[] RecordDigit = new int[digit];
        int i = 0;
        int total = 0;

        while(number/10 != number){
            RecordDigit[i] = number % 10;
            total += (int)Math.pow(RecordDigit[i] , digit);
            number = number/10;
            i++;
        }
        return total;
    }
}