import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> child = new ArrayList<String>();
        child.add("Ryan");
        child.add("Brandon");
        child.add("Rebecca");
        child.add("Richard");
        child.add("Jessica");
        child.add("Brian");
        child.add("Antoinne");
        child.add("Grace");
        child.add("Zee");
        child.add("Ibrahim");

        System.out.println(child);

        // back of the bus being the first element (i.e. the left most).

        // Ibrahim feels unwell and asks if he can sit at the back of the bus. Move Ibrahim to the back.

        System.out.println(child.indexOf("Ibrahim"));
        System.out.println(child);
        // Ibrahim is already at the back of the bus

        //Rebecca is singing and upsetting the rest. To resolve this, move Rebecca to the front of the bus.

        System.out.println(child.indexOf("Rebecca"));
        child.add(0, "Rebecca");
        System.out.println(child.indexOf("Rebecca"));
        child.remove(3);

        //Rebecca is now at the front of the bus

        //Richard and Antoinne are best friends and are talking loudly across the bus.
        // The teacher has decided it's best to separate them. Move Richard to sit behind Antoinne.
        // Ryan wants to sit at the front where he can enjoy the trip more. However,
        // Rebecca must remain right at the front. Rearrange the array to move Ryan directly behind Rebecca

        child.add(7, "Richard");
        System.out.println(child.indexOf("Richard"));
        System.out.println(child.indexOf("Antoinne"));
        child.remove(3);
        System.out.println(child);
    }
}
