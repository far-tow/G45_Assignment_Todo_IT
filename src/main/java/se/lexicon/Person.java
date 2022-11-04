package se.lexicon;

public class Person {
    // Fields
    private int idNo;
    private String firstName;
    private String lastName;
    private String eMail;


    // Constructors
    public Person (){

    }

    public String getSummary(Person person) {
        return "Emp.No:" + getIdNo() + " Name:" + getFirstName() + " " + getLastName() + " Email: " + geteMail();
    }

    public Person(int idNo, String firstName, String lastName, String eMail) {
        this.idNo = idNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
    }


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

    public String personInformation() {
        return "Id number: " + idNo + "\n" + "First name: " + firstName + " Last name: " + lastName + "\n" + "Email: " + eMail;
    }

}