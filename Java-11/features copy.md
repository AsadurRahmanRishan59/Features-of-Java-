Java 11, released in September 2018, introduced a variety of features and enhancements that improved developer productivity, performance, and compatibility. Below is an overview of the key features of Java 11:

---

### **1. New String Methods**
Several new utility methods were added to the `String` class:
- **`isBlank()`**: Checks if a string is empty or contains only whitespace.
- **`lines()`**: Splits a string into a `Stream` of lines.
- **`strip()`**: Removes leading and trailing whitespace, similar to `trim()` but handles Unicode whitespace better.
- **`stripLeading()`** and **`stripTrailing()`**: Removes leading or trailing whitespace.
- **`repeat(int count)`**: Repeats the string a specified number of times.

---

### **2. `var` in Lambda Parameters**
The `var` keyword can now be used in lambda expressions for type inference:
```java
(var x, var y) -> x + y
```

---

### **3. `HttpClient` API (Standardized)**
The new `HttpClient` API, introduced as an incubator feature in Java 9, was finalized in Java 11. It simplifies handling HTTP requests and supports:
- HTTP/1.1 and HTTP/2
- Asynchronous requests using `CompletableFuture`
- Fluent and reactive programming

Example:
```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://example.com"))
    .build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

---

### **4. Local-Variable Syntax for Lambda Parameters**
Java 11 extended the use of the `var` keyword to lambda parameters. This improves code consistency when annotations are used:
```java
(var x, var y) -> x + y
```

---

### **5. New File Methods**
The `Files` utility class in `java.nio.file` received new methods:
- **`writeString(Path, CharSequence, options...)`**: Write text directly to a file.
- **`readString(Path)`**: Read text directly from a file.

---

### **6. `Nest-Based Access Control`**
This feature improves access control for nested classes. It allows private members of nested classes to be accessed directly by their enclosing class without synthetic bridge methods.

---

### **7. `ZGC (Z Garbage Collector)`**
The Z Garbage Collector is a low-latency GC that can handle heaps of terabyte scale with minimal pause times. It is especially useful for applications requiring high performance and low-latency responses.

---

### **8. Deprecation and Removal of Features**
- **Removed**: Java EE and CORBA modules.
- **Deprecated**: Nashorn JavaScript engine.

---

### **9. Flight Recorder and Mission Control**
Java 11 made the Java Flight Recorder a free feature. It allows developers to monitor and debug applications by collecting profiling data with minimal performance overhead.

---

### **10. Unicode 10 Support**
Java 11 supports Unicode 10, introducing new characters and scripts, including emojis.

---

### **11. New Standards and TLS 1.3**
Java 11 supports:
- TLS 1.3 (Transport Layer Security)
- Cryptographic improvements like ChaCha20 and Poly1305

---

### **12. Running Java Files Directly**
Java 11 allows running `.java` files without explicitly compiling them:
```bash
java HelloWorld.java
```

---

### **13. Epsilon Garbage Collector**
The Epsilon GC is a no-op garbage collector for performance testing and experimentation. It allocates memory without performing any garbage collection.

---

These features made Java 11 a popular long-term support (LTS) release, widely adopted by enterprises.