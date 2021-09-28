package task02;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Distributor implements Runnable {

    String fizz = "Fizz";
    String buzz = "Buzz";
    String fizzBuzz = "FizzBuzz";
    String[] array;

    public Distributor(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int f = 0; f < array.length; f++) {
            if (f % 5 == 0 && f % 3 == 0) {
                array[f] = fizzBuzz;
            } else if (f % 3 == 0) {
                array[f] = fizz;
            } else if (f % 5 == 0) {
                array[f] = buzz;
            } else {
                array[f] = Integer.toString(f);
            }
        }
    }

    public void printArray() {
        // added Thread.sleep because the first elements of the array were printed with null
        try {
            Thread.sleep(1_000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String h : array) {
            System.out.println(h);
        }
    }
}
