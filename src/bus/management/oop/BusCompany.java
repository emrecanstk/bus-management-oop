package bus.management.oop;

public class BusCompany {
    
    private static BusCompany company = new BusCompany();

    private BusCompany() {
    }

    public static BusCompany getCompany() {
        return company;
    }
}
