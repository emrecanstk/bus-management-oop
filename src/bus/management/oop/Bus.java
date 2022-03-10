package bus.management.oop;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    int id;
    int journeyId;
    int ticketPrice;
    int earnedMoney;
    int spentMoney;
    int totalMoney;
    List<String> clientList = new ArrayList<String>();

    Bus(int id) {
        this.id = id;
    }


}
