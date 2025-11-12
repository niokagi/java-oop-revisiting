package tasks;

public class UsbFlash implements StorageMedia {
    @Override
    public void storeData(String data) {
        System.out.println("saving data: '" + data + "' into flash drive");
    }
}
