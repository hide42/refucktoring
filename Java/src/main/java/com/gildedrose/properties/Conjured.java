package com.gildedrose.properties;

import com.gildedrose.Item;

public class Conjured extends Common {
    @Override
    int getMultiplyQuality(Item item){
        if(item.sellIn==0)
            return 4;
        else
            return 2;
    }
}
