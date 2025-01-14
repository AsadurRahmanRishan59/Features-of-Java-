
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        

        Function<String,Integer> f = s-> s.length();
        System.out.println(f.apply("Rishan"));


        Function<String,String> f2 = s-> s.replaceAll(" ","");
        System.out.println(f2.apply("R i s h a n"));

        

    }
}
