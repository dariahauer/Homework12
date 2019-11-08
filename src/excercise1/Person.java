package excercise1;

public class Person {
    private String firstName;
    private String lastName;
    private  int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        checkPreconditions(firstName,lastName,age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void checkPreconditions(String firstName, String lastName, int age) throws NameUndefinedException, IncorrectAgeException {
        if (firstName == null||lastName==null)
            throw new NameUndefinedException();
        if (firstName.length()<=2 || lastName.length()<=2){
            throw new NameUndefinedException();
        } if (age<1){
            throw new  IncorrectAgeException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}

//
//NameUndefinedException – wyjątek, który powinien być rzucony, jeśli ktoś przy próbie utworzenia obiektu Person przekaże
//        do konstruktora imię lub nazwisko będące nullem lub mające mniej niż 2 znaki
//        IncorrectAgeException – wyjątek, który powinien być rzucony, jeśli ktoś przy próbie utworzenia obiektu Person przekaże
//        do konstruktora wiek mniejszy niż 1