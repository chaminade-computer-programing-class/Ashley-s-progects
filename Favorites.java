import java.util.Scanner;
import java.io.*;
import java.util.Random;
/**
 * this proram will compare your favoret things to my favoret things
 *
 * @author McDonough Cook
 * @version v1 1/28/19
 */
public class Favorites{
    public static void main(String[] args)throws InterruptedException{
        Random rn = new Random();
        int ran = rn.nextInt(20) + 1;
        int rand = rn.nextInt(10) + 1;
        int randnum = rn.nextInt(5) + 1;
        double favnum = Math.random();
        char z = 'p';char x = 'i';char c = 'z';char v = 'z';char b = 'a';
        System.out.println("what is your favorite number");
        Scanner ash = new Scanner(System.in);// Reading from System.in
        double n = ash.nextInt();
        ash.nextLine();
        System.out.println(n + " is a boring number like " + ran + " or " + rand + " or " + randnum + ", my favorite number is " + favnum + " and it is better then your favoret number.");
        System.out.println("what is your favoret food");
        String a = ash.nextLine();
           if(a.equals("pizza")){
                System.out.println("yay we have the same favorite food " + z + x + c + v + b);
            }
            else{
                System.out.println("that is sad that your favorite food is " + a + " beacaus my favoret food is pizza");
            }
        System.out.println("what is your favorite ice cream flavor");
        String s = ash.nextLine();
            if(s.equals("salted carmel")){
                System.out.println("yay we both love " + s);
            }
            else if(s.equals("carmel")){
                System.out.println("yay we both love " + s);
            }
            else{
                System.out.println("you are evil for not liking carmel and liking " + s + " insted");
            }
        System.out.println("is your favoret Java compiler VSC(answer with true or false)");
        boolean y = ash.nextBoolean();
            if(y == true){
                System.out.println("we like the same compiler");
                System.out.println("i like it because we use it in robotics");
            }
            else if(y == false){
                System.out.println("sad");
            }
            else{
                System.out.println("you were soposed to say true or false");
            }
        System.out.println("is your favorite programing language C++(answer with true or false)");
        Boolean d = ash.nextBoolean();
           if(d == true){
             System.out.println("I like C++ but i like python more because it was the first language I learned");
            }
           else if(d == false){
               System.out.println("C++ is not my favorite language ether");
            }
            else{
                System.out.println("you were soposed to say true or false");
            }
    }   
}
