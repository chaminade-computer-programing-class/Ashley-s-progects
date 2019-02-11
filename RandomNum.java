import java.util.Random;
/**
 * Write a description of class randome here.
 *generats a random number
 * @author (McDonough Cook)
 * @version (1)
 */
public class RandomNum
{
    public static void main(String[] args){
        Random rn = new Random();
        for(int i =0; i < 100; i++){   
            int answer = rn.nextInt(10) + 1;
            System.out.println(answer);
        }
}
}
