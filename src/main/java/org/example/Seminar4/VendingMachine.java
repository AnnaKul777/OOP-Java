package org.example.Seminar4;

import java.util.List;

public abstract class VendingMachine {
    abstract String getProduct(String name, int temp, int volume);

    abstract void initDrink(List<HotDrink> dr);
}
