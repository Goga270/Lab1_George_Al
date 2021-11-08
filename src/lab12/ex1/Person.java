package lab12.ex1;

public class Person {
    private String firstName;
    private final String lastName;
    private String patronymic;

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String toString() {
        if (firstName != null || patronymic != null) {
            return lastName + " " + firstName + " " + patronymic;
        } else {
            return lastName;
        }
    }

    public static void main(String[] args) {
        Person first_person = new Person("Аладинский", "Георгий", "Александрович");
        System.out.println(first_person);
        Person second_person = new Person("Аладинский");
        System.out.println(second_person);
    }
}
