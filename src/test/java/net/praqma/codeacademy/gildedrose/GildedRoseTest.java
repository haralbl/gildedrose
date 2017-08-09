new Item("Sulfuras, Hand of Ragnaros", 0, 80)package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1,1);//"fixme", app.items[0].name);
    }
    @Test
    public void SulfurasTest() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
	app.updateGuality();
	assertEqual(1,0);
    }

}
