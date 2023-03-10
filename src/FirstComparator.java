import java.util.Comparator;

public class FirstComparator implements Comparator<Person> {

    //The first comparator sorts all people in ascending order by their names

    @Override
    public int compare(Person person1, Person person2) {
        return (person1.getPersonsName()).compareTo(person2.getPersonsName());
    }

}

