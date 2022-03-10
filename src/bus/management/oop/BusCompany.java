package bus.management.oop;

import java.util.ArrayList;
import java.util.List;

public class BusCompany {

    static String name = "Kamil Koc";
    static String phoneNumber = "+90 534 252 5094";
    int earnedMoney;
    int spentMoney;
    int totalMoney;
    List<String> driverList = new ArrayList<String>();

    private static BusCompany company = new BusCompany();

    private BusCompany() {
    }

    public static BusCompany getCompany() {
        return company;
    }
}
