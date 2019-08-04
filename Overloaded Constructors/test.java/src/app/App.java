package app;

import java.security.SecureRandom;

public class App {
    public static void main(String[] args) throws Exception {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);

        SecureRandom rs = new SecureRandom();
        for(int i = 0; i < 500; i++){
        int x = rs.nextInt(1000)/11+10;
        
        System.out.println(x);
        }
     /*   System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        try {
            Time2 t6 = new Time2(27, 74, 99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("%nException while initialing t6: %s%n", e.getMessage());
        }

    }

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());*/
    }

}