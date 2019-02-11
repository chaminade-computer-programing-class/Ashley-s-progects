import java.util.Scanner;

/**
 * Write a description of class age here. you tell it your age and it says how
 * old you will be in 10 years
 * 
 * @author (McDonough cook)
 * @version (1)
 */
public class Age {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("how old are you?");
        Scanner ash = new Scanner(System.in); // Reading from System.in
        int n = ash.nextInt();
        System.out.println("what is your name");
        String a = ash.nextLine();
        ash.nextLine();
        System.out.println("in 10 years " + a + " will be " + (n + 10) + " years old.");
        ash.close();
    }
}
