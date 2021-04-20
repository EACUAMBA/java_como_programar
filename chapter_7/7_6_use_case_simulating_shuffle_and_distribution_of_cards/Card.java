
//This represents a Card object in real life, we have the number (face) and the symbol (suit)
public class Card{
    private String face; //Face 1, 2, 3, 4, 5, 6
    private String suit; //Suit Rice, Diamond,

    //When we create a card object we have to give its face and suit, all object might have its face and suit. A object card without it isn't a card is something else.
    public Card(String face, String suit){
        this.face = face;
        this.suit = suit;
    }

    //When we want to show the card, we will return the face and suit concatenated in a String face of suit.
    @Override
    public String toString(){
        return this.face + " of " + this.suit;
    }

}