
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class CollentionExample {

    public static void main(String[] args) {


        List <Bank> list = new ArrayList<>();

        list.add(new Bank ("John",10));
        list.add(new Bank ("Kayle",05));
        list.add(new Bank ("Diana",20));
        list.add(new Bank ("Joe",15));
        list.add(new Bank ("Loki",-66));

        
        Function<Bank,String>f = bank->bank.getName();

        System.out.println("Ascending Order");
        
        Collections.sort(list, Comparator.comparing(f));
        System.out.println(list);

        Collections.sort(list, Comparator.comparing(bank->bank.getAccNo()));
        
        // list.forEach(bank->System.out.println(bank.getAccNo()));

        System.out.println("");
        System.out.println("Descending Order");

        Collections.sort(list,Comparator.comparing(Bank::getAccNo).reversed() );
        list.forEach(bank->System.out.println(bank.getAccNo()));

    }
}
