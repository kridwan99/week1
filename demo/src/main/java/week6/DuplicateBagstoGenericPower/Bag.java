package week6.DuplicateBagstoGenericPower;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public void printContents() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    // Bonus method: returns the first item or null
    public T getFirstItem() {
        return items.isEmpty() ? null : items.get(0);
    }
}
