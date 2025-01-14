
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        System.out.println("Hello Worlds!");

        Predicate<Integer> predicate = num -> num == 2020;
        System.out.println(predicate.test(2020));

        Predicate<String> p2 = s -> s.length() > 5;

        System.out.println(p2.test("Java Express"));
        //---------------------------------------------------

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(40);
        list.add(90);
        list.add(99);

        Predicate<Integer>p3 = num->num>50;
        
        System.out.println(p3.test(80));

    }
}
