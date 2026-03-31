import java.util.ArrayList;

public class Main {


    static void main(String[] args) {
        ArrayList<String> bus = new ArrayList<>();
        bus.add("Ryan");
        bus.add("Brandon");
        bus.add("Rebecca");
        bus.add("Richard");
        bus.add("Jessica");
        bus.add("Brian");
        bus.add("Antoinne");
        bus.add("Grace");
        bus.add("Zee");

        //ibrhim is sick and goes to the back
        bus.addFirst("Ibrahim");

        //rebbeca goes to front
        bus.remove("Rebecca");
        bus.add("Rebecca");

        //move richard to sut behind antoinee
        bus.remove("Richard");
        bus.add(bus.indexOf("Antoinne"), "Richard");


        //ryan wants to sit at the front, but has to go behind rebecca
        bus.remove("Ryan");
        bus.add(bus.indexOf("Rebecca"), "Ryan");














        System.out.println(bus);
    }

}
