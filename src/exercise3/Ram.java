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
    


//    public void  increaseSpeed(){
//        if(speed + SPEED_CHANGE> SPEED_LIMIT){
//            throw  new  SpeedExceededExeption();
//            //  throw  new  IllegalArgumentException("Przekroczono limit prędkości");
//        }
//        speed+=SPEED_CHANGE;
//    }
//
//    public void  decreaseSpeed(){
//        if (speed-SPEED_CHANGE<0){
//            speed=0;
//        }else {
//            speed-=SPEED_CHANGE;
//        }
//    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
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
        return "Ram{" +
                "memory=" + memory +
                ", speed=" + speed +
                ", temperature=" + temperature +
                '}';
    }
}
