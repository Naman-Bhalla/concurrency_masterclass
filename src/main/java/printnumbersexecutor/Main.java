package printnumbers;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Print Number");

        for (int i = 1; i <= 100; ++i) {
//            System.out.println(i + " " + Thread.currentThread().getName());
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
        }
    }
}
