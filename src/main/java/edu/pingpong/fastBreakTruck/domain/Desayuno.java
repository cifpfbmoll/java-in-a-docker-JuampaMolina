package edu.pingpong.fastBreakTruck.domain;

import edu.pingpong.fastBreakTruck.behaviour.Item;

import java.util.ArrayList;
import java.util.List;

public class Desayuno {
    private List<Item> items = new ArrayList<Item>();
    private Float total = 0f;

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void mostrarItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Float getCoste() {
        for (Item item :  items) {
            this.total += item.pvp();
        }
        return this.total;
    }
}
