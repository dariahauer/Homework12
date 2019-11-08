package exercise3;

public class Procesor extends Product {
    private static final int MAX_TEMP = 90;
    private static final int TEMP_CHANGE = 10;
    private int speed;
    private int temperature;

    public Procesor(String producerName, String modelName, int serialNumber) {
        super(producerName, modelName, serialNumber);
    }

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


//
//    public void speedIncrease(int speedChangeValue){
//        int speedChangeParameter=100;
//        int tempValpar=((((speed - speedChangeValue)/speedChangeParameter)* TEMP_CHANGE)+ temperature);
//        if((tempValpar>=MAX_TEMP){
//            throw new TempExceededExeption();
//    } if((tempValpar * TEMP_CHANGE) + temperature<MAX_TEMP){
//
//        }

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

//    Procesor i pamięci ram można dodatkowo podkręcać, co oznacza, że można zwiększać ich taktowanie
//            (przykładowo jeśli nasz procesor miał taktowanie zegara na poziomie 2500MHz, to można go zwiększyć np. do 2800MHz).
//    Analogicznie przy pamięciach ram.
//
//    Zakładana temperatura procesora wzrasta o 10 stopni na każde 100MHz taktowania, a pamięci ram o 15 stopni na każde 100MHz więcej.
//

