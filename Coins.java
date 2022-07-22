import java.util.*;

public class Coins {

    public static void coinchecker(int c) {
        int coins[] = new int[4];

        int d;
        coins[0] = 10;
        coins[1] = 5;
        coins[2] = 2;
        coins[3] = 1;

        for (int i = 0; i < 4; i++) {
            d = c / coins[i];
            c = c % coins[i];

            System.out.println("No of " + coins[i] + " coins that are required to cover this amount are " + d);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int c = sc.nextInt();

        coinchecker(c);
    }
}
