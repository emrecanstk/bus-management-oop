package bus.management.oop;

public class Journey {
    int id;
    String whereToWhere;
    int ticketPrice;

    Journey(int id, String whereToWhere, int ticketPrice) {
        this.id = id;
        this.whereToWhere = whereToWhere;
        this.ticketPrice = ticketPrice;
    }
}
