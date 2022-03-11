package bus.management.oop;

import java.util.ArrayList;
import java.util.List;

public class BusCompany {
    int id;
    String name;
    String phoneNumber;
    int earnedMoney;
    int spentMoney;
    int totalMoney;
    List<Bus> busList = new ArrayList<Bus>();

    BusCompany(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void BuyBus(Bus bus) {
        this.spentMoney += 5000;
        this.busList.add(bus);
        System.out.println("company "+this.name+", bought a bus.");
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getEarnedMoney() {
        return earnedMoney;
    }

    public int getSpentMoney() {
        return spentMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public List<Bus> getBusList() {
        return busList;
    }
}
