
import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberGen {

    public static void main(String[] args) {
        Supplier<String> s1 = () -> "Java";
        System.out.println(s1.get());

        Supplier<Integer> s2 = () -> new Random().nextInt(1000);
        System.out.println(s2.get());

        Supplier<String> s3 = () -> {
            String otp = "JE-";
            for (int i = 0; i < 6; i++) {
                otp = otp + new Random().nextInt(10);
            }
            return otp;
        
        };

        System.out.println(s3.get());
    }
}
