package multithreading;

public class PlayEvenOdd {
    public static void main(String[] args) {

        Even even = new Even();
        Odd odd = new Odd();

        even.start();
        odd.start();





    }
}
