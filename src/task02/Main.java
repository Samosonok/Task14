package task02;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        String[] array = new String[1000000];
        Distributor distributor = new Distributor(array);
        int processors = Runtime.getRuntime().availableProcessors();

        for (int v = 0; v < processors; v++){
            Thread thread = new Thread(new Distributor(distributor.array));
            thread.start();
        }

        distributor.printArray();
    }
}
