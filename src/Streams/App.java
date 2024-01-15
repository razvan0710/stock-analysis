package Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    //Intermediate operations
    //filter(), distinct(), map(), skip(), sorted()    functions who return the Stream updated
    public static void main(String[] args) {
        IntStream.
                range(1,10)
                .skip(3)
                .forEach((x) -> System.out.println(x));
        System.out.println();


        Stream.of("ehdevd","ed3h", "qaz")
                .sorted()
                .findFirst()
                .ifPresent((x) -> System.out.println(x));
        System.out.println();

    }
}
