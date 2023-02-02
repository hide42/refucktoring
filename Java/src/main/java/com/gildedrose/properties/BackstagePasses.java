package com.gildedrose.properties;

import com.gildedrose.Item;

public class BackstagePasses extends Common {
    //Качество увеличивается на 2, когда до истечения срока хранения 10 или менее дней и на 3,
    //	если до истечения 5 или менее дней. При этом качество падает до 0 после даты проведения концерта.
    @Override
    int getMultiplyQuality(Item item) {
        if(item.sellIn<=0){
            return -100;
        }else if(item.sellIn<=5){
            return 3;
        }else if(item.sellIn<=10){
            return 2;
        }else{
            return 1;
        }
    }
    @Override
    int getDiffQuality(Item item) {
        return 1;
    }
}
