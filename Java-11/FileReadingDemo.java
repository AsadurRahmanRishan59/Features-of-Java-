import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileReadingDemo {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("student.txt");
            Path filePath2 = Paths.get("D:/Rishan/", "Demo/", "dummy.txt");
            Files.writeString(filePath2, "Welcome to File Demo");
            String result = Files.readString(filePath);
            System.out.println(result);
            System.out.println(Files.readString(filePath2));

            var str = "Java\nJavaScript\nPython";
            Stream<String> str2 = str.lines();
            List<String> list = str2.toList();

            System.out.println(list.size());
            // System.out.println(list);
            list.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // String filePath = "path/to/your/file.txt";

        // try {
        // List<String> lines = Files.readAllLines(Paths.get(filePath));
        // for (String line : lines) {
        // System.out.println(line);
        // }
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

    }
}