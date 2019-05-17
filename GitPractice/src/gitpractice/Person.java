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
    private String name;
    private String email;
    private String city;

    public Person(String name, String email, String city) {
        this.name = name;
        this.email = email;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }
    
    
    
}
