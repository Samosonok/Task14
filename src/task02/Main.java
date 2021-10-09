package task02;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Main {

    static String[] array = new String[20000000];

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(new Distributor(array, 0, 5000000));
        Thread thread2 = new Thread(new Distributor(array, 5000000, 10000000));
        Thread thread3 = new Thread(new Distributor(array, 10000000, 15000000));
        Thread thread4 = new Thread(new Distributor(array, 15000000, 20000000));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("1 thread - The program is executed in 166163 milliseconds\n" +
                "2 threads - The program is executed in 226788 milliseconds\n" +
                "4 threads - The program is executed in " + timeSpent + " milliseconds");

    }
}

// 1 thread - The program is executed in 166163 milliseconds
// 2 threads - The program is executed in 226788 milliseconds
// 4 threads - The program is executed in 220088 milliseconds