package entity;

public class ExamplePerson {
    
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String yearOfBirth;
    
    public ExamplePerson() {
    }
    
    public ExamplePerson(int id, String firstName, String lastName, String email, String yearOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }
}
