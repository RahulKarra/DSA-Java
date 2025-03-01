package Recursion;

import java.util.*;

public class WaysToArrangeTiles {

    static final int MOD = 1000000007;

    public static List<Integer> ways(List<Integer> nvalues) {
        List<Integer> ways = new ArrayList<>();

        for (int nvalue : nvalues) {
            ways.add(calculateWays(nvalue));
        }

        return ways;
    }

    private static int calculateWays(int n) {
        if (n == 1) {
            return 2;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= n; i++) {
            if (n > 2 && i == 2) {
                dp[i] = (dp[i - 1] * dp[i - 3] + dp[i - 1]) % MOD;
            } else {
                dp[i] = (dp[i - 1] * dp[i - 2] + dp[i - 1]) % MOD;
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nvaluesCount = scanner.nextInt();

        List<Integer> nvalues = new ArrayList<>();
        for (int i = 0; i < nvaluesCount; i++) {
            nvalues.add(scanner.nextInt());
        }

        List<Integer> result = ways(nvalues);
        for (int answer : result) {
            System.out.println(answer);
        }
    }
}