import java.util.ArrayList;
import java.util.Collection;

public class Box {
    protected ArrayList<Item> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        this.items.add(item);
    }

    public void add(Collection<Item> items) {
        this.items.addAll(items);
    }

    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}