package bus.management.oop;

public class Driver {
    int id;
    String name;
    int fee;
    boolean isAvailable = true;

    Driver(int id, String name, int fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public int getFee() {
        return fee;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
