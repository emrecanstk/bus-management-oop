package bus.management.oop;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    int id;
    int earnedMoney;
    int spentMoney;
    int totalMoney;
    boolean haveJourney = false;
    List<Client> clientList = new ArrayList<Client>();

    Bus(int id) {
        this.id = id;
    }

    public void StartJourney(Journey journey, Driver driver) {
        if(driver.isAvailable == true && this.haveJourney == false) {
            this.haveJourney = true;
            this.spentMoney += journey.fuelMoney;
            this.spentMoney += driver.fee;

        }

    }

}
