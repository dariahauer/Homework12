package excercise1;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(){
        super("Incorrect age - age can not be less than one");
    }
}
