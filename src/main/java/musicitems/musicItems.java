package musicitems;

import shop.Stock;

public class musicItems extends Stock {

    private musicItems musicItem;

    public musicItems(musicItems musicItem, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.musicItem = musicItem;
    }

    public musicItems getMusicItem() {
        return musicItem;
    }

    @Override
    public int calculateMarkup() {
        return 0;
    }
}
