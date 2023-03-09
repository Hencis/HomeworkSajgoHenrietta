
public class Person {

    private String personsName;
    private Integer personsAge;

    public Person(String personsName, Integer personsAge) {
        this.personsName = personsName;
        this.personsAge = personsAge;
    }

    public Integer getPersonsAge() {
        return personsAge;
    }

    public String getPersonsName() {
        return personsName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personsName='" + personsName + '\'' +
                ", personsAge=" + personsAge +
                '}';
    }

}

