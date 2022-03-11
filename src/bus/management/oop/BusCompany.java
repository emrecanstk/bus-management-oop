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
    List<String> busList = new ArrayList<String>();

    BusCompany(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
