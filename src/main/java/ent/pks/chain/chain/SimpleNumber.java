package ent.pks.chain.chain;

import ent.pks.chain.exceptions.NotOurNumber;

public class SimpleNumber implements LevelChain {
    private LevelChain chain;

    public void setNextChain(LevelChain nextChain) {
        this.chain = nextChain;
    }

    public void separation(NumberFromArray numberFromArray) throws NotOurNumber {
        System.out.println("First line is here.");
        if (isPrime(numberFromArray.getNumber())) {
            System.out.println("Is Prime number");
        } else {
            System.out.println("Go to second line.");
            this.chain.separation(numberFromArray);
        }
    }

    boolean isPrime(int n) {
        //самый простой, неоптимизированный способ поиска простого числа
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
