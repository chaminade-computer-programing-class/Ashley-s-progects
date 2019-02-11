import java.util.Scanner;

/**
 * filps a coin
 * 
 * @author (McDonough Cook)
 * @version (1)
 */
public class CoinFlip {
    public static void main(String[] args) throws InterruptedException {
        double coin;
        int heads = 0;
        int tails = 0;
        Scanner ash = new Scanner(System.in); // Reading from System.in;

        for (int i = 0; i < 5; i++) {
            coin = Math.random();
            if (coin > 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("heads " + heads);
        System.out.println("tails " + tails);
    }
}
