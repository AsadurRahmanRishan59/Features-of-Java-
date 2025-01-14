
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Conversion {
    public static void main(String[] args) {
        Integer[] arr = {65,87,566,12,10,45,50};

        Stream<Integer>nArr = Stream.of(arr);
        // nArr.forEach(num->System.out.println(num));
        nArr.forEach(System.out::println);
        
        String [] str = new String[]{"Java","Unix","Python","Aws"};
        Stream<String> streamArr = Arrays.stream(str);
        List<String> nArr2 = streamArr.sorted().collect(Collectors.toList());
        nArr2.forEach(System.out::println);
        
    }
}
