import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCard {

    private Card card;

    @Before
    public void before(){
        card = new Card(RankType.ACE, SuitType.DIAMONDS);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.DIAMONDS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void canGetValue(){
        assertEquals(11, card.getValueFromEnum());
    }
}
