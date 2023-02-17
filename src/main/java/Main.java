import dto.ExamplePersonDTO;
import entity.BankAccount;
import entity.ExamplePerson;
import entity.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        ExamplePerson person = new ExamplePerson(1, "John", "Doe", "doe@mail.com", "1985-01-01");
        ExamplePersonDTO personDTO = new ExamplePersonDTO(person);

        System.out.println(personDTO.getFullName());

        User user = new User(1, "John", "Doe", "doe@mail.com");
        BankAccount account = new BankAccount(1, 2,"1234567890", 1000, LocalDate.parse("2020-01-08"), LocalDate.parse("2000-01-08"));




    }
}
