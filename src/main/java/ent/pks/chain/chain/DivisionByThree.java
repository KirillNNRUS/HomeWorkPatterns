package ent.pks.chain.chain;

import ent.pks.chain.exceptions.NotOurNumber;

public class DivisionByThree implements LevelChain {
    private LevelChain chain;

    public void setNextChain(LevelChain nextChain) {
        this.chain = nextChain;
    }

    public void separation(NumberFromArray numberFromArray) throws NotOurNumber {
        if (numberFromArray.getNumber() % 3 == 0) {
            System.out.println("You are on the third line. It's our number");
        } else {
            throw new NotOurNumber("WTF! Something wrong!");
        }
    }
}
