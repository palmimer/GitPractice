package gitpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author szekeresjudit
 */
public class Reader {
    
    private static ArrayList<Person> persons = new ArrayList<>();

    public static void read() throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("us-500.csv"));
        sc.nextLine();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String [] parts = line.split(",");
            String firstName = parts[0];
            String lastName = parts[1];
            String city = parts[4];
            String email = parts[9];
            Person p = new Person(firstName, lastName, city, email);
            persons.add(p);
        }
    }
}
