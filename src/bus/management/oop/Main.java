package bus.management.oop;

public class Main {

    public static void main(String[] args) {
        BusCompany kamilKoc = new BusCompany(101,"Kamil Koç","534 252 509");
        BusCompany kale = new BusCompany(102,"Kale Premium","537 265 011");

        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);
        Bus bus3 = new Bus(3);
        Bus bus4 = new Bus(4);
        Bus bus5 = new Bus(5);
        Bus bus6 = new Bus(6);
        Bus bus7 = new Bus(7);

        Journey mkp_corlu = new Journey(1,"Mustafakemalpaşa - Çorlu",50,340);
        Journey istanbul_izmir = new Journey(2,"İstanbul - İzmir",60,360);
        Journey ankara_eskisehir = new Journey(3,"Ankara - Eskişehir",20,120);
        Journey bursa_manisa = new Journey(4,"Bursa - Manisa",30,160);
        Journey tokat_adana = new Journey(5,"Tokat - Adana",70,440);

        Driver tony = new Driver(1,"Tony Stark",290);
        Driver steve = new Driver(2,"Steve Rogers",180);
        Driver bruce = new Driver(3,"Bruce Banner",210);
        Driver peter = new Driver(4,"Peter Parker",120);
        Driver nick = new Driver(5,"Nick Fury",240);
        Driver wanda = new Driver(6,"Wanda Maximoff",170);
        Driver clint = new Driver(7,"Clint Barton",160);

        Client emre = new Client(1,"Emre Can Satık");Client gulnur = new Client(2,"Gülnur Vırdınlı");
        Client melike = new Client(3,"Melike Satık");Client ercan = new Client(4,"Ercan Satık");
        Client aycan = new Client(5,"Aycan Satık");Client mert = new Client(13,"Mert Manisa");
        Client murat = new Client(6,"Murat Pangal");Client ali = new Client(14,"Ali Paslı");
        Client serdar = new Client(7,"Serdar Salar");Client ozkan = new Client(15,"Özkan Züngör");
        Client emir = new Client(8,"Emir Özbatmaz");Client enes = new Client(16,"Enes Bayız");
        Client cihan = new Client(9,"Cihan Loyan");Client buket = new Client(17,"Buket Vırdınlı");
        Client eray = new Client(10,"Eray Uraz");Client billur = new Client(18,"Billur Vırdınlı");
        Client yusuf = new Client(11,"Yusuf Biçer");Client hatice = new Client(19,"Hatice Vırdınlı");
        Client orcun = new Client(12,"Orçun Tortu");Client didem = new Client(20,"Didem Coşkun");

        kamilKoc.BuyBus(bus1);
        kamilKoc.BuyBus(bus2);
        kamilKoc.BuyBus(bus3);
        kamilKoc.BuyBus(bus4);
        kale.BuyBus(bus5);
        kale.BuyBus(bus6);
        kale.BuyBus(bus7);


    }

}
