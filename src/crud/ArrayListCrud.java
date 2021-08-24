package crud;

import model.Fruit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCrud {

    private List<Fruit> list = new ArrayList<>();

    // CREATE
    public void addToList(Fruit dataObj) {
        list.add(dataObj);
    }

    // READ
    public List<Fruit> getList() {
        return list;
    }

    // DELETE
    public void deleteFromList(int id) {
        Iterator<Fruit> itr = getList().iterator();
        while (itr.hasNext()) {
            Fruit st = itr.next();
            if (st.getId() == id) {
                itr.remove();
            }
        }
    }
    // UPDATE
    public void updateFromList(int id, String name, double price) {
        Iterator<Fruit> itr = getList().iterator();
        while (itr.hasNext()) {
            Fruit st = itr.next();
            if (st.getId() == id) {
                st.setName(name);
                st.setPrice(price);
            }
        }
    }


}
