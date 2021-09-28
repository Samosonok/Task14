package task01;

import java.util.Date;
import java.util.List;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Reader implements Runnable {

    List<Integer> numberList;
    final int numberOfChecks = 10000;

    public Reader(List<Integer> numberList) {
        this.numberList = numberList;
    }

    @Override
    public void run() {
        for (int s = 0; s < numberOfChecks; s++) {
            if (this.numberList.isEmpty()) {
                System.out.println(new Date() + " The list is empty");
            } else {
                System.out.println(numberList);
                this.numberList.clear();
            }
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}