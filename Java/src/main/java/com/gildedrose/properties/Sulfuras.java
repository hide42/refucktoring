package com.gildedrose.properties;

import com.gildedrose.Item;

public class Sulfuras extends Common {
    @Override
    int getNewSellIn(Item item){
        return item.sellIn;
    }
    @Override
    int getNewQuality(Item item){
        return item.quality;
    }
}
