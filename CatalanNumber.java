public class CatalanNumber {
    public void catty(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        System.out.println(dp[n]);

    }

    public static void main(String args[]) {
        CatalanNumber c = new CatalanNumber();

        c.catty(5);
    }
}