/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitpractice;

/**
 *
 * @author progmatic
 */
public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String email;

    public Person(String firstName, String lastName, String city, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }
}
