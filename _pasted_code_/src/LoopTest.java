public class LoopTest {
    public static void main(String[] args) {

        int x = 123;   // you can change this number to test different starting values

        do {
            x = x - 3;
            System.out.println("x = " + x);
        } while (x < 120);

        System.out.println("Loop ended. Final x = " + x);
    }
}
