/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationships;

/**
 *
 * @author mohan
 */
public class PersonalInformation {
    private String firstName;
    private String middleName;
    private String lastName;
    private String bloodGroup;
    private String accountNumber;
    private String nationality;
    private int yearOfBirth;
    
    public PersonalInformation(){
    }

    public PersonalInformation(String firstName, String middleName, String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth) {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setBloodGroup(bloodGroup);
        setAccountNumber(accountNumber);
        setNationality(nationality);
        setYearOfBirth(yearOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    @Override
    public String toString() {
        return "PersonalInformation{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", bloodGroup=" + bloodGroup + ", accountNumber=" + accountNumber + ", nationality=" + nationality + ", yearOfBirth=" + yearOfBirth + '}';
    }
    
    
}
