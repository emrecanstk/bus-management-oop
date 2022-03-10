package bus.management.oop;

public class Client {
    int id;
    String name;

    Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void BuyTicket(Bus bus, int journeyId) {
        if(bus.haveJourney == true) {
            bus.earnedMoney += bus.ticketPrice;
            bus.clientList.add(this.name);
        }
        else {
            System.out.println("There is no such journey for this bus.");
        }
    }

}
