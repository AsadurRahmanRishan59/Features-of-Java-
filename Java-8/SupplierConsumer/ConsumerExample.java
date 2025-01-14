
import java.util.ArrayList;
import java.util.function.Consumer;


public class ConsumerExample {

    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        l1.add("Javascript");
        l1.add("Python");


        Consumer<String> c = s->System.out.println(s);

        c.accept("Rishan");


        l1.forEach(item->System.out.println(item));
    }
}
