package exercise3;

public class Ram extends Product {
    private int memory;
    private int speed;
    private int temperature;
    private static final int MAX_TEMP=60;
    private static final int TEMP_CHANGE=15;

    public Ram(String producerName, String modelName, int serialNumber) {
        super(producerName, modelName, serialNumber);
    }

    public Ram(String producerName, String modelName, int serialNumber, int memory, int speed, int temperature) {
        super(producerName, modelName, serialNumber);
        this.memory = memory;
        this.speed = speed;
        this.temperature = temperature;
    }

    public void speedIncrease(int speedChangeValue) {
        int speedChangeParameter = 100;
        int tempValpar = (((speedChangeValue) / speedChangeParameter) * TEMP_CHANGE);
        if (tempValpar + temperature >= MAX_TEMP) {
            throw new TempExceededExeption();
        } else {
            speed += speedChangeValue;
            temperature += tempValpar;
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


    @Override
    public String toString() {
        return "Ram{" +
                "memory=" + memory +
                ", speed=" + speed +
                ", temperature=" + temperature +
                '}';
    }
}
