package exercise1;

public class IncorrectAgeException extends Exception {
    public IncorrectAgeException(){
        super("Incorrect age - age can not be less than one");
    }
}
