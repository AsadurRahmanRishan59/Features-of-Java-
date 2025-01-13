Java 8 introduced several new features that made the language more powerful and concise. Here’s an overview of the key features with examples:

---

### **1. Lambda Expressions**
Lambda expressions allow you to write concise code by representing an anonymous function.

**Example:**
```java
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rishan", "Alice", "Bob");

        // Using lambda to iterate over the list
        names.forEach(name -> System.out.println(name));
    }
}
```

---

### **2. Functional Interfaces**
A functional interface has a single abstract method (SAM). Java 8 introduced `@FunctionalInterface` annotation to enforce this rule.

**Example:**
```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Greeting greet = name -> System.out.println("Hello, " + name);
        greet.sayHello("Rishan");
    }
}
```

---

### **3. Stream API**
The Stream API is used for processing collections in a functional style.

**Example:**
```java
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filter even numbers and print
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
```

---

### **4. Default and Static Methods in Interfaces**
Java 8 allows interfaces to have default and static methods.

**Example:**
```java
interface MyInterface {
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

public class DefaultStaticExample implements MyInterface {
    public static void main(String[] args) {
        DefaultStaticExample example = new DefaultStaticExample();

        // Calling default method
        example.defaultMethod();

        // Calling static method
        MyInterface.staticMethod();
    }
}
```

---

### **5. Optional**
The `Optional` class is used to handle null values gracefully and avoid `NullPointerException`.

**Example:**
```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String value = "Hello, Java 8";

        // Create an Optional
        Optional<String> optionalValue = Optional.ofNullable(value);

        // Check and get value
        optionalValue.ifPresent(System.out::println);
    }
}
```

---

### **6. Method References**
Method references simplify lambda expressions further by referring to methods directly.

**Example:**
```java
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rishan", "Alice", "Bob");

        // Using method reference
        names.forEach(System.out::println);
    }
}
```

---

### **7. New Date and Time API**
The `java.time` package provides a modern date and time API.

**Example:**
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current DateTime: " + dateTime);
    }
}
```

---

### **8. Nashorn JavaScript Engine**
Java 8 includes Nashorn, a JavaScript engine that allows you to execute JavaScript code within Java.

**Example:**
```java
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornExample {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");

        engine.eval("print('Hello from JavaScript');");
    }
}
```

---

These features significantly improved Java's usability and enabled developers to write more efficient and concise code.