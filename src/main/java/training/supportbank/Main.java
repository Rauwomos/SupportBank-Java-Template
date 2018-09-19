package training.supportbank;

public class Main {
    public static void main(String args[]) {
        // Your code here!
        Monies test1 = new Monies(2, 50);
        Monies test2 = new Monies(4, 20);
        test1.subtract(test2);
        System.out.println(test1);
    }
}
