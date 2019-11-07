package excercise1;

public class NameUndefinedException extends  RuntimeException{
    public NameUndefinedException(){super("firstName and lastName can not be null and have contain more than two characters");};

}
