package shop;

import behaviours.ISell;

public abstract class Stock implements ISell {

    private int buyPrice;
    private int sellPrice;

    public Stock(int boughtPrice, int sellPrice) {
        this.buyPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}