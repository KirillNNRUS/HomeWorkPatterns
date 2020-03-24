package ent.pks.chain;

public class DivisionByTwo implements LevelChain {
    private LevelChain chain;

    public void setNextChain(LevelChain nextChain) {
        this.chain = nextChain;
    }

    public void separation(NumberFromArray numberFromArray) throws NotOurNumber {
        if (numberFromArray.getNumber() % 2 == 0) {
            System.out.println("Second line! It's even number!");
        } else {
            System.out.println("Go to third line.");
            this.chain.separation(numberFromArray);
        }
    }
}
