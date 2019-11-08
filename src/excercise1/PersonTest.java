package excercise1;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter the First Name");
            String firstName = input.nextLine();
            System.out.println("Please enter the Last Name");
            String lastName = input.nextLine();
            System.out.println("Please enter the age");
            int age = input.nextInt();
            System.out.println("Please enter the pesel number");
            int pesel = input.nextInt();
            Person person = new Person(firstName, lastName, age, pesel);
            System.out.println(person);
        } catch (NameUndefinedException | IncorrectAgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
