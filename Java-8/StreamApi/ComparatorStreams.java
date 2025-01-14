import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComparatorStreams {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("A", 10000));
        list.add(new Employee("B", 90000));
        list.add(new Employee("C", 60000));
        list.add(new Employee("D", 40000));
        list.add(new Employee("E", 50000));

        List<Employee> nList = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(nList);
        List<Integer> numbers = IntStream.rangeClosed(1, 100_000_000)
                .boxed()
                .collect(Collectors.toList());

        long startSequential = System.nanoTime();
        long sequentialSum = numbers.stream()
                .mapToLong(i -> i)
                .sum();
        long endSequential = System.nanoTime();

        long startParallel = System.nanoTime();
        long parallelSum = numbers.parallelStream()
                .mapToLong(i -> i)
                .sum();
        long endParallel = System.nanoTime();

        System.out.println("Sequential Time: " + (endSequential - startSequential) + " ns");
        System.out.println("Parallel Time: " + (endParallel - startParallel) + " ns");

    }
}
