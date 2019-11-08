package exercise3;

public class HardDisc extends Product{
    private int capacity;

    public HardDisc(String producerName, String modelName, int serialNumber) {
        super(producerName, modelName, serialNumber);
    }

    public HardDisc(String producerName, String modelName, int serialNumber, int capacity) {
        super(producerName, modelName, serialNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDisc{" +
                "capacity=" + capacity +
                '}';
    }
}
