package chapter_7._7_6_use_case_simulating_shuffle_and_distribution_of_cards;

import java.security.SecureRandom;

//This class represent a Deck of Cards, a lot of cards together we call Deck of Card. A DeckOfCard might have inside: Cards, 52 card at least and the front card, card 0;
public class DeckOfCards{
    private static final int NUMBER_OF_CARDS = 52;
    //This secureRandom object we'll use to generate secure random values represent each card in the Deck.
    private static final SecureRandom secureRandom = new SecureRandom();
    private Card[] deck;
    private int currentCard;

    //When we create a deck of card we need to set some things, first: the faces and the suits of the cards, second: create a concrete 53 cards;
    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits={"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];

        //We could set this in the declaration.
        currentCard = 0;

        //Here we are set the faces and suits using the following logic, in total we have 52 cards, we have 13 faces, and four suits, we could use random to do this but ruandom could give the same value twice and it will be worst for the game, we will find two same cards, we need some simple and easy to do, when we think that 0..51 % 13 will give for us some values as 1 until 12
        for (int count = 0; count< deck.length; count++){
            int face = count % 13;
            int suit = count / 13;
            deck[count] = new Card(faces[face], suits[suit]);
        }

    }

    //This method is used to shuffle the DeckOfCards, the logic is simple, pick the first element then put back to the element picked from the secureRandom(), ex: secureRandom says 38, we will pick the 38 position card in the deck then put in the spot of the first and then put the first where the secure was. 1 -> 10 ; 10 -> 1, again, 5 -> 10; 10 -> 10, this make shuffle;
    public void shuffle(){
        currentCard = 0;

        for(int first = 0; first<deck.length; first++){

            int second = secureRandom.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //This will return only one card if in the deck we have cards left, ex: we will check if the currentCard in the front of the deck exits or not, if it is less than the size of the deck exists otherwise not, the cards are gone, we will return null;
    public Card dealCard(){
        if(currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }

}