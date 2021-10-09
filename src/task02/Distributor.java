package task02;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Distributor implements Runnable {

    String[] array;
    int from;
    int to;

    public Distributor(String[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int f = from; f < to; f++) {
            if (f % 5 == 0 && f % 3 == 0) {
                this.array[f] = "FizzBuzz";
            } else if (f % 3 == 0) {
                this.array[f] = "Fizz";
            } else if (f % 5 == 0) {
                this.array[f] = "Buzz";
            } else {
                this.array[f] = Integer.toString(f);
            }
            System.out.println(this.array[f]);
        }
    }
}