
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 10);
        }

        list.forEach(item -> System.out.println(item));
        System.out.println("");

        List<Integer> nList = list.stream()
                .filter(item -> item % 2 == 0)
                .collect(Collectors.toList());

        nList.forEach(item -> System.out.println(item));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Javascript");
        list2.add("Python");
        list2.add("AWS");

        List<String> nList2 = list2.stream()
                .map(item -> item.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(nList2);

        //Sorting in Ascending Order
        List<String> nList3 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending Order :" + nList3);

        //Sorting in Descending Order
        List<String> nList4 = list2.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        System.out.println("Descending Order :" + nList4);
    }
}
