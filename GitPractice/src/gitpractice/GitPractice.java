/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitpractice;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author progmatic
 */
public class GitPractice {
    
    public static ArrayList<Person> persons = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
                
        Reader.read(persons);
        persons.sort( new LastNameComparator() );
        for (Person person : persons) {
            System.out.println(person.getLastName() + ", " + person.getFirstName());
        }
        
        
    }
    
}
