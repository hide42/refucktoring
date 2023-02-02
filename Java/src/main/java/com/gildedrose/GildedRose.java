package com.gildedrose;

import com.gildedrose.properties.*;

class GildedRose {
    Item[] items;
    AgedBrie agedBrie = new AgedBrie();
    BackstagePasses backstagePasses = new BackstagePasses();
    Common common = new Common();
    Conjured conjured = new Conjured();
    Sulfuras sulfuras = new Sulfuras();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            String name = item.name;
            if(name.equals("Aged Brie")){
                agedBrie.processDay(item);
            }else if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
                backstagePasses.processDay(item);
            }else if(name.equals("Sulfuras, Hand of Ragnaros")){
                sulfuras.processDay(item);//ot empty string
            }else if(name.startsWith("Conjured")){
                conjured.processDay(item);
            }else{
                common.processDay(item);
            }
        }
    }
}
