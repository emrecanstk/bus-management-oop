package bus.management.oop;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    int id;
    int earnedMoney;
    int spentMoney;
    int totalMoney;
    boolean haveJourney = false;
    List<String> clientList = new ArrayList<String>();

    Bus(int id) {
        this.id = id;
    }

}
