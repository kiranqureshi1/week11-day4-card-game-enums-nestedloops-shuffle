public class Card {

    private RankType rankTypes;
    private SuitType suitTypes;

    public Card(RankType rankTypes, SuitType suitTypes){
        this.rankTypes = rankTypes;
        this.suitTypes = suitTypes;
    }


    public SuitType getSuit() {
        return this.suitTypes;
    }

    public RankType getRank() {
        return this.rankTypes;
    }

    public int getValueFromEnum() {
        return this.rankTypes.getValue();
    }
}
