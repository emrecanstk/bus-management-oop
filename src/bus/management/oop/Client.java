package bus.management.oop;

public class Client {
    int id;
    String name;

    Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void BuyTicket(Bus bus, Journey journey) {
        if(bus.haveJourney == true) {
            bus.earnedMoney += journey.ticketPrice;
            bus.clientList.add(this);
            System.out.println("client "+this.name+" bought "+journey.whereToWhere+" journey.");
        }
        else {
            System.out.println("There is no such journey for this bus.");
        }
    }

    public String getName() {
        return name;
    }
}
