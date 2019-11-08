package exercise3;

public class Computer {
    Procesor procesor;
    Ram ram;
    HardDisc hardDisc;


    public Computer(Procesor procesor, Ram ram, HardDisc hardDisc) {
        this.procesor = procesor;
        this.ram = ram;
        this.hardDisc = hardDisc;
    }

    public void procesorIncreaseSpeed(Procesor procesor, int speedChangeValue) {
        procesor.speedIncrease(speedChangeValue);
    }

    public void ramIncreaseSpeed(Ram ram, int speedChangeValue) {
        ram.speedIncrease(speedChangeValue);
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(HardDisc hardDisc) {
        this.hardDisc = hardDisc;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor=" + procesor +
                ", ram=" + ram +
                ", hardDisc=" + hardDisc +
                '}';
    }
}
