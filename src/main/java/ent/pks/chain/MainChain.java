package ent.pks.chain;

public class MainChain {
    public static void main(String[] args) {

        LevelChain first = new SimpleNumber();
        LevelChain second = new DivisionByTwo();
        LevelChain third = new DivisionByThree();
        first.setNextChain(second);
        second.setNextChain(third);

        int numbbb = 45;
        first.separation(new NumberFromArray(numbbb));

    }
}
