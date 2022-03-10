package bus.management.oop;

public class Journey {
    int id;
    String whereToWhere;
    int ticketPrice;
    int fuelMoney;

    Journey(int id, String whereToWhere, int ticketPrice, int fuelMoney) {
        this.id = id;
        this.whereToWhere = whereToWhere;
        this.ticketPrice = ticketPrice;
        this.fuelMoney = fuelMoney;
    }
}
