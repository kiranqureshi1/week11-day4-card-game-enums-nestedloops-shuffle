import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
//      this.cards = new Card[52] ;
        this.cards = new ArrayList<>();
    }


    public void populateDeck() {

        Card newCard;
        for (SuitType s : SuitType.values()) {
            for (RankType r : RankType.values()) {
                newCard = new Card(r,s);
                this.cards.add(newCard);
            }
        }
    }

    public int verifyDeckCount() {
        return this.cards.size();
    }

    public void shuffleCards(){
        Collections.shuffle(this.cards);
    }

    public Card deckCard(){
        return this.cards.remove(0);
    }



}




