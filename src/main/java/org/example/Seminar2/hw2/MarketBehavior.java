package org.example.Seminar2.hw2;

public interface MarketBehavior {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();
}
