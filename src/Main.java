import java.util.*;

public class Main {

    public static void main(String[] args) {

        //creating address instances

        Address address1 = new Address("Romania", "Cluj-Napoca", "Dorobantilor", 23);
        Address address2 = new Address("Italy", "Rome", "xyz", 34);
        Address address3 = new Address("Spain", "Barcelona", "abc", 234);
        Address address4 = new Address("Netherlands", "Amsterdam", "bnm", 35);

        //creating list of addresses where a hobby can be practiced

        List<Address> hobbysAddresses = new ArrayList<>();
        hobbysAddresses.add(address3);
        hobbysAddresses.add(address4);

        List<Address> hobbysAddresses2 = new ArrayList<>();
        hobbysAddresses2.add(address1);
        hobbysAddresses2.add(address2);

        List<Address> hobbysAddresses3 = new ArrayList<>();
        hobbysAddresses3.add(address1);
        hobbysAddresses3.add(address3);

        //creating instances of hobbies

        Hobby hobby1 = new Hobby("swimming", 2, hobbysAddresses);
        Hobby hobby2 = new Hobby("hiking", 3, hobbysAddresses2);
        Hobby hobby3 = new Hobby("dancing", 2, hobbysAddresses3);

        //creating person, unemployed instances

        Person person1 = new Person("Henrietta", 26);
        Person person2 = new Person("Claudia", 23);
        Person person3 = new Person("Maria", 27);
        Person unemployed1 = new Unemployed("Claudiu", 28, "romanian");
        Person unemployed2 = new Unemployed("Rob", 31, "canadian");

        // we create 2 TreeSets of people, one is sorting all people in ascending order by their names, second in descending order by their age

        System.out.println("Sorting on the basis of name ascending order");

        TreeSet<Person> treesetNameComparator = new TreeSet<>(new FirstComparator());

        treesetNameComparator.add(person1);
        treesetNameComparator.add(person2);
        treesetNameComparator.add(person3);
        treesetNameComparator.add(unemployed1);
        treesetNameComparator.add(unemployed2);

        System.out.println("Printing by name: ");

        for (Person person : treesetNameComparator) {
            System.out.println(person);
        }

        TreeSet<Person> treesetAgeComparator = new TreeSet<>(new SecondComparator());

        treesetAgeComparator.add(person1);
        treesetAgeComparator.add(person2);
        treesetAgeComparator.add(person3);
        treesetAgeComparator.add(unemployed1);
        treesetAgeComparator.add(unemployed2);

        System.out.println("Printing by age:");

        for (Person person : treesetAgeComparator) {
            System.out.println(person);
        }

        //we create a HashMap with the following structure <Person, List<Hobby>>

        HashMap<Person, List<Hobby>> hashMap = new HashMap<>();

        hashMap.put(person1, new ArrayList<>(Arrays.asList(hobby1, hobby2)));
        hashMap.put(person2, new ArrayList<>(Arrays.asList(hobby2, hobby3)));
        hashMap.put(person3, new ArrayList<>(Arrays.asList(hobby1, hobby3)));
        hashMap.put(unemployed1, new ArrayList<>(Arrays.asList(hobby1, hobby3)));
        hashMap.put(unemployed2, new ArrayList<>(Arrays.asList(hobby3, hobby2)));

        //for a certain Person, we print the names of the hobbies and the countries where it can be practiced

        for (Person pPerson : hashMap.keySet()) {
            System.out.println(pPerson.getPersonsName() + " has the following hobbies :");
            for (Hobby hobby : hashMap.get(pPerson)) {
                System.out.println("---" + hobby.getHobbysName() + "---");
                System.out.println("with the specified addresses: ");
                for (Address address : hobby.getHobbysAddresses()) {
                    System.out.println("-" + address.getCity() + "-");
                }
            }
        }
    }
}