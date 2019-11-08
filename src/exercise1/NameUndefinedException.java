package exercise1;

public class NameUndefinedException extends Exception {
    public NameUndefinedException() {
        super("firstName and lastName can not be null and have contain more than two characters");
    }

    ;

}
