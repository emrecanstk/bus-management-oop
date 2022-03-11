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
            driver.isAvailable = false;
            this.spentMoney += journey.fuelMoney;
            this.spentMoney += driver.fee;
            System.out.println("New Journey: "+journey.whereToWhere+"\nPrice: "+journey.ticketPrice+" $");
        }
        else {
            System.out.println("Check availablity.");
        }

    }

    public int getEarnedMoney() {
        return earnedMoney;
    }

    public int getSpentMoney() {
        return spentMoney;
    }

    public int getTotalMoney() {
        totalMoney = earnedMoney - spentMoney;
        return totalMoney;
    }

    public String isHaveJourney() {
        if(haveJourney == true) {
            return "This bus have a journey right now.";
        }
        else {
            return "This bus is available";
        }
    }

    public List<Client> getClientList() {
        return clientList;
    }

}
