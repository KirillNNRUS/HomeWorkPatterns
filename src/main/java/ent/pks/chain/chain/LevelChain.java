package ent.pks.chain.chain;

import ent.pks.chain.exceptions.NotOurNumber;

public interface LevelChain {
    void setNextChain(LevelChain nextChain);

    void separation(NumberFromArray numberFromArray) throws NotOurNumber;
}
