package ent.pks.chain;

public interface LevelChain {
    void setNextChain(LevelChain nextChain);

    void separation(NumberFromArray numberFromArray) throws NotOurNumber;
}
