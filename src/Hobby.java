import java.util.List;

public class Hobby {

    private String hobbysName;
    private int frequency;
    private List<Address> hobbysAddresses;

    public Hobby(String hobbysName, int frequency, List<Address> hobbysAddresses) {
        this.hobbysName = hobbysName;
        this.frequency = frequency;
        this.hobbysAddresses = hobbysAddresses;
    }


    public String getHobbysName() {
        return hobbysName;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getHobbysAddresses() {
        return hobbysAddresses;
    }

    @Override
    public String toString() {
        return "Hobby{" + "hobbysName='" + hobbysName + '\'' + ", frequency=" + frequency + ", hobbysAddresses=" + hobbysAddresses + '}';
    }
}
