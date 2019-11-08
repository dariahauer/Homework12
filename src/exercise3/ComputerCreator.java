package exercise3;

import java.util.InputMismatchException;

public class ComputerCreator {
    public static void main(String[] args) {
        try {
            Procesor procesor = new Procesor("producer1", "DSE345", 11342, 3000, 40);
            Ram ram = new Ram("producer2", "DFSDGS6", 235346457, 32, 1066, 40);
            Computer computer = new Computer(procesor, ram, new HardDisc("producer2", "DGGG667", 465788, 128));

            System.out.println(computer);

            computer.procesorIncreaseSpeed(procesor, 200);

            System.out.println(computer);

            computer.ramIncreaseSpeed(ram, 200);

            System.out.println(computer);

        } catch (TempExceededExeption | InputMismatchException ex) {
            System.err.println(ex.getMessage());
        }
    }
}



