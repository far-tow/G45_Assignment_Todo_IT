package se.lexicon;

import se.lexicon.sequencer.PersonalSequencer;

import java.util.Objects;

public class Person {
    // Fields
    private int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private AppUser credentials;


    // Constructors
    public Person() {

    }

   /* public String getSummary(Person person) {
        return "Emp.No:" + getIdNo() + " Name:" + getFirstName() + " " + getLastName() + " Email: " + geteMail();
    }*/

    public Person(String firstName, String lastName, String eMail, AppUser credentials) {
        this.id = PersonalSequencer.nextId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.credentials = credentials;
    }


    // Methods


    // Getters & Setters
    public int getId() {
        PersonalSequencer.nextId();
        return id;
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

    public String personInformation() {
        return "Id number: " + id + "\n" + "First name: " + firstName + " Last name: " + lastName + "\n" + "Email: " + eMail;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }
    @Override
    public String toString() {
        return "Person{" + "Emp.No: =" + getId() + ", firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\'' + ", eMail='" + geteMail() + '\'' + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, eMail);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && firstName.equals(person.firstName) && lastName.equals(person.lastName) && eMail.equals(person.eMail);
    }


}