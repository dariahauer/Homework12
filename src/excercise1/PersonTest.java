package excercise1;

public class PersonTest {
    public static void main(String[] args) {
        try{
            Person person = new Person("Jan", "Kowalski", 22, 123);
            System.out.println(person);
        }
        catch (NameUndefinedException| IncorrectAgeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
