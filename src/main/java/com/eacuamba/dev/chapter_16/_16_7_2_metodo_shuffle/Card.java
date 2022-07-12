package com.eacuamba.dev.chapter_16._16_7_2_metodo_shuffle;

public class Card {
    public static enum Face{
        Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Ten, Nine, Jack, Queen, King
    };

    public static enum Suit {Clubs, Diamonds, Hearts, Spades};

    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit){
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString(){
        return String.format("%s of %s", face, suit);
    }
}
