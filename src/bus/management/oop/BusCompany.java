package bus.management.oop;

import java.util.ArrayList;
import java.util.List;

public class BusCompany {
    int id;
    String name;
    String phoneNumber;
    List<Integer> busList = new ArrayList<Integer>();

    BusCompany(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void BuyBus(Bus bus) {
        this.busList.add(bus.id);
        System.out.println("company "+this.name+", bought a bus.");
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Integer> getBusList() {
        return busList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
