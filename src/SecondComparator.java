import java.util.Comparator;

public class SecondComparator implements Comparator<Person> {

    //The second comparator sorts all people in descending order by their age

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getPersonsAge() > person2.getPersonsAge()) {
            return -1;
        } else if (person1.getPersonsAge() < person2.getPersonsAge()) {
            return 1;
        } else {
            return person1.getPersonsAge().compareTo(person2.getPersonsAge());
        }
    }

}
