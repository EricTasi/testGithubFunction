package app;

public class Function {

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