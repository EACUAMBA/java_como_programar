package com.eacuamba.dev.chapter_16._16_7_2_metodo_shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCard {
    private List<Card> list;

    public DeckOfCard(){
        Card[] deck = new Card[52];

        int count = 0;

        for(Card.Suit suit: Card.Suit.values()){
            for (Card.Face face: Card.Face.values()){
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck);
        this.printCards();
        System.out.println();
        System.out.println();
        Collections.shuffle(list);
    }

    public void printCards(){
        for (int i =0; i<list.size(); i++){
            System.out.printf("%-19s" + (((i + 1) % 4 == 0) ? "%n" : ""), list.get(i));
        }
    }

    public static void main(String[] args) {
        DeckOfCard cards = new DeckOfCard();
        cards.printCards();
    }
}
