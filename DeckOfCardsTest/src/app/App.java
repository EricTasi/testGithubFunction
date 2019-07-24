package app;

public class App {
    public static void main(String[] args) throws Exception {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        System.out.printf("%-19s%-19s%-19s%-19s%n%n","player1","player2","player3","player4");


        for(int i = 1; i <= 52; i++){

            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if(i % 4 == 0){
                System.out.println("");
            }
        }
    }
}