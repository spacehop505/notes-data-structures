package crud;

import model.Fruit;

import java.util.*;

public class MapCrud {

    private Map<Integer, Fruit> map = new HashMap<>();

    // CREATE
    public void addToList(int number, Fruit dataObj) {
        map.put(number, dataObj);
    }

    // READ
    public Map<Integer, Fruit> getList() {
        return map;
    }

    // DELETE
    public void deleteFromList(int id) {
        map.remove(id);
    }

    // UPDATE
    public void updateFromList(int id, String name, double price) {
        map.get(id);
        map.replace(id, new Fruit(id, name, price));
    }
}
