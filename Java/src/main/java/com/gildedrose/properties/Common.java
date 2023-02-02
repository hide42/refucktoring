package com.gildedrose.properties;

import com.gildedrose.Item;

public class Common {

    public void processDay(Item item){
        item.sellIn=getNewSellIn(item);
        item.quality=getNewQuality(item);
    }

    int getNewSellIn(Item item){
        if(item.sellIn<=0){
            return item.sellIn;
        }else{
            return item.sellIn+getDiffSellIn(item);
        }
    }
    int getNewQuality(Item item){
        int newQuality = item.quality+getMultiplyQuality(item)*getDiffQuality(item);
        if(newQuality<=0){
            return 0;
        }else{
            return Math.min(newQuality,50);
        }
    }

    int getDiffQuality(Item item){
        return -1;
    }
    int getDiffSellIn(Item item){
        return -1;
    }
    int getMultiplyQuality(Item item){
        if(item.sellIn==0)
            return 2;
        else
            return 1;
    }
}
