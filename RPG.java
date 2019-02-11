import java.util.Scanner;

public class RPG {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("welcome to the Tomb of code");
        System.out.println("start(1);  exit(0)");
        Scanner reader = new Scanner(System.in); // Reading from System.in
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        double roll;
        if (n == 0) {
            System.out.println("hit the x");
        } else {
            System.out.println("game is starting please wait");
            Thread.sleep(5000);
            System.out.println("you walk out of a forest int a clearing will a big hill");
            Thread.sleep(1000);
            System.out.println("roll a perseption check");
            Thread.sleep(1000);
            System.out.println("rolling");
            Thread.sleep(2000);
            roll = Math.random();
            if (roll < 0.1) {
                System.out.println("you see nothing");
            } else if (roll > 0.5) {
                System.out.println(
                        "you see that there are rocks on the hill that spell out java and in the both of the a's there is a hole.");
            } else {
                System.out.println("you see 2 holes in the hill");
            }
            reader.close();
        }
    }
}