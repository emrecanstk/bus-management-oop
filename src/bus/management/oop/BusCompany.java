package bus.management.oop;

public class BusCompany {

    static String name = "Kamil Koc";
    static String phoneNumber = "+90 534 252 5094";
    int earnedMoney;
    int spentMoney;
    int totalMoney;

    private static BusCompany company = new BusCompany();

    private BusCompany() {
    }

    public static BusCompany getCompany() {
        return company;
    }
}
