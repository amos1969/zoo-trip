import java.util.ArrayList; // Import the ArrayList class


public class Main {

    static void main() {
        ArrayList<String> bus = new ArrayList<String>();
        bus.add("Ryan");
        bus.add("Brandon");
        bus.add("Rebecca");
        bus.add("Richard");
        bus.add("Jessica");
        bus.add("Brian");
        bus.add("Antoinne");
        bus.add("Grace");
        bus.add("Zee");
        bus.add("Ibrahim");

        //task 1
        bus.remove("Imbrahim");
        bus.add(0, "Imbrahim");
        //task2
        bus.remove("Rebecca");
        bus.add("Rebecca");
        //task 3
        bus.remove("Richard");
        bus.add(bus.indexOf("Antoinne")-1, "Richard");

        //task 4
        bus.remove("Ryan");
        bus.add(bus.indexOf("Rebecca")-1, "Ryan");

        System.out.println(bus);
    }




}
