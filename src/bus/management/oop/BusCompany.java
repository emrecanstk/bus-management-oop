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
    List<Integer> busList = new ArrayList<Integer>();

    BusCompany(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void BuyBus(Bus bus) {
        this.spentMoney += 5000;
        this.busList.add(bus.id);
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
