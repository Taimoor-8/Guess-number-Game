import java.util.Scanner;

import java.util.Random;

class game<n> {
    int a1;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;

        Random ran = new Random();
        int n = ran.nextInt(100);

    public int iscorrectnumber(){
        if(a>n){
            System.out.println("Your entered number is bigger.");
            a1++;
        }
        else if(a<n){
            System.out.println("Your entered number is lesser.");
            a1++;
        }
        else if (a==n){
            System.out.println("You have entered the correct number.");
        }
        return 0;
    }

    public int sequence(){
        do {
            System.out.println("Re-enter your value");
             b = sc.nextInt();
            if (b > n) {
                System.out.println("Your entered number is bigger.");
                a1++;
            } else if (b < n) {
                System.out.println("Your entered number is lesser.");
                a1++;
            } else if (b==n) {
                System.out.println("You have entered the correct number.");
                break;
            }

        }
            while (a != n || b!=n) ;
        System.out.println("Your score/number of attempts are "+a1+".");
        return a1;
    }
}

public class Guess_Number_Game {

    public static void main(String[] args) {
        System.out.println("Enter your number");
        game g = new game();
        System.out.println(g.iscorrectnumber());
        System.out.println(g.sequence());

    }
}
