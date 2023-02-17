package dto;

import entity.ExamplePerson;

public class ExamplePersonDTO {

    private String fullName;
    private String email;

    public ExamplePersonDTO() {
    }

    public ExamplePersonDTO(ExamplePerson person) {
        this.fullName = person.getFirstName() + " " + person.getLastName();
        this.email = person.getEmail();
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
