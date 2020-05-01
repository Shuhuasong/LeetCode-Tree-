package DynamicPrograming;

public class _746_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        //dp[i] is the cost from [0...i]
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<cost.length; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }
        return Math.min(dp[n-2],dp[n-1]);
    }
}
