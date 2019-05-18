/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitpractice;

import java.util.Comparator;

/**
 *
 * @author progmatic
 */
public class LastNameComparator implements Comparator<Person> {

    public LastNameComparator() {
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
    
}
