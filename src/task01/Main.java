package task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        List<Integer> numberList = Collections.synchronizedList(new ArrayList<>());

        Writer w = new Writer(numberList);
        Reader r = new Reader(numberList);

        Thread writer = new Thread(new Writer(w.numberList));
        Thread reader = new Thread(new Reader(r.numberList));

        writer.start();
        reader.start();
    }
}
