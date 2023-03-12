package org.example.Seminar2.hw2;

public abstract class Buyer implements BuyerBehavior {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;
    abstract String getName();

    @Override
    public String toString() {
        return name;
    }
}
