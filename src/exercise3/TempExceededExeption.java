package exercise3;

public class TempExceededExeption extends RuntimeException {
    public TempExceededExeption() {
        super ("The temperature has reached the limit");

    }
}
