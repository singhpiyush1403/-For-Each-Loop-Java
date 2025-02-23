import java.util.ArrayList;

public class ForEachListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Piyush");
        names.add("Amit");
        names.add("Rahul");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
