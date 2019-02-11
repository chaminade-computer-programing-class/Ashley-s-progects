import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Diceroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiceRoller {
    public static void main(String[] args) throws InterruptedException {
        int dice;
        Random rn = new Random();
        System.out.println("D20(1), D12(2), D10(3), D8(4), D6(5), D4(6) D2(7)");
        Scanner ash = new Scanner(System.in); // Reading from System.in
        int n = ash.nextInt();
        if (n == 1) {
            dice = rn.nextInt(20) + 1;
            System.out.println(dice);
        } else if (n == 2) {
            dice = rn.nextInt(12) + 1;
            System.out.println(dice);
        } else if (n == 3) {
            dice = rn.nextInt(10) + 1;
            System.out.println(dice);
        } else if (n == 4) {
            dice = rn.nextInt(8) + 1;
            System.out.println(dice);
        } else if (n == 5) {
            dice = rn.nextInt(6) + 1;
            System.out.println(dice);
        } else if (n == 6) {
            dice = rn.nextInt(4) + 1;
            System.out.println(dice);
        } else if (n == 7) {
            dice = rn.nextInt(2) + 1;
            System.out.println(dice);
        }
        ash.close();
    }
}
