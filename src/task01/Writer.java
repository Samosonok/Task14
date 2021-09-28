package task01;

import java.util.List;
import java.util.Random;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Writer implements Runnable {

    List<Integer> numberList;

    public Writer(List<Integer> numberList) {
        this.numberList = numberList;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int d = rand.nextInt();
        while (d > 0) {
            d++;
            this.numberList.add(rand.nextInt(d));
            try {
                Thread.sleep(2_500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
