package tasks;

public class Ballpoint implements Draw, LaserPointer, StorageMedia {
    @Override
    public void draw(String object) {
        System.out.println("drawing: '" + object + "' on paper");
    }

    @Override
    public void pointWithLaser() {
        System.out.println("turn on the laser pointer at the tip of the pen");
    }

    @Override
    public void storeData(String data) {
        System.out.println("record audio and saving data: '" + data + "' into micro-storage");
    }
}
