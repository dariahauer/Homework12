package exercise3;

public class Procesor extends Product {
    private static final int MAX_TEMP = 90;
    private static final int TEMP_CHANGE = 10;
    private int speed;
    private int temperature;

    public Procesor(String producerName, String modelName, int serialNumber, int speed, int temperature) {
        super(producerName, modelName, serialNumber);
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Procesor{" +
                "speed=" + speed +
                ", temperature=" + temperature +
                '}';
    }
}

