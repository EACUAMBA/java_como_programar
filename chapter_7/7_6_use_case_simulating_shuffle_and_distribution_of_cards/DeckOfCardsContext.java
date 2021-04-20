public class DeckOfCardsContext{
    public static void main(String[] args){
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();

        //Printing the cards.
        for(int i = 1 ; i<=52 ; i++){
            System.out.printf("%-19s", deckOfCards.dealCard());

            if(i % 4 == 0){
                System.out.println();
            }
        }
    }
}