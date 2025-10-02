public class BoxWithMaximumWeight extends Box {
    private int maxWeight;

    public BoxWithMaximumWeight(int capacity) {
        super();
        this.maxWeight = capacity;
    }

    private int getCurrentWeight() {
        int currentWeight = 0;
        for (Item item : this.items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    @Override
    public void add(Item item) {
        if (this.getCurrentWeight() + item.getWeight() <= this.maxWeight) {
            super.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return super.isInBox(item);
    }
}