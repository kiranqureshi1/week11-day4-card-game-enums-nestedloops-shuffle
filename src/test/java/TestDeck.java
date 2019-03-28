import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDeck {

    private Deck deck;
    private Card card1;
    private Card card2;

    @Before
    public void before(){
        deck = new Deck();
        card1 = new Card(RankType.QUEEN, SuitType.HEARTS);
        card2 = new Card(RankType.ACE, SuitType.DIAMONDS);

    }


    @Test
    public void populateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.verifyDeckCount());
    }
}
