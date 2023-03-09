package org.example.Seminar1.cw1.Zadanie2;

public class BottleOfWater extends Product{
   private String name;
   private int price;

    public BottleOfWater(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
