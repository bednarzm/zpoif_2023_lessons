package pl.edu.pw.mini.zpoif.piatyszekp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;

public class Task3 {

    public static void main(String[] args) {
        Consumer<String> isStartingWithA = s -> s.startsWith("A");
        Consumer<String> print = s -> System.out.print(s);
        Consumer<String> reversePrint = s -> System.out.print(new StringBuilder(s).reverse());

        class Sum {
            private int v = 0;
            void inc(int a) {
                v += a;
            }
            int get(){
                return v;
            }
        }
        Sum sum = new Sum();

        Consumer<String> isDigit = s -> {
            try {
                Integer i = Integer.parseInt(s);
                sum.inc(i);
                System.out.println(i + ": " + (i % 2 == 0 ? "parzysta" : "nieparzysta"));
                System.out.println("Suma: " + sum.get());
            } catch (NumberFormatException e) {
            }
        };

    }
}
