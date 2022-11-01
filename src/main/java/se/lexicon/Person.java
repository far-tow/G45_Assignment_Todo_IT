package se.lexicon;

public class Person {
    // Fields
    private int idNo;
    private String firstName;
    private String lastName;
    private String eMail;





    // Constructors





    // Methods





    // Getters & Setters
    // Done => TODO: firstName & lastName & eMail NOT ALLOWED TO BE NULL!!!
    public int getIdNo() {
        return idNo;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("firstName is NOT allowed to be NULL!");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("lastName is NOT allowed to be NULL!");
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        if (eMail == null) throw new IllegalArgumentException("eMail is NOT allowed to be NULL!");
        this.eMail = eMail;
    }
}