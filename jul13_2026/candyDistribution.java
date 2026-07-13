package jul13_2026;

public class candyDistribution {
    public int candy(int[] ratings) {
        int n=ratings.length;

        //every child gets at least one candy
        int[] candies =new int[n];
        for (int i=0; i<n;i++) {
            candies[i]=1;
        }
        // l to r
        for (int i=1; i<n;i++) {
            if (ratings[i] > ratings[i-1]) {
                candies[i] = candies[i-1] + 1;
            }
        }
        // r to l
        for (int i=n-2; i>=0;i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        //calc total candies
        int totalCandies = 0;
        for (int candy:candies) {
            totalCandies+=candy;
        }
        return totalCandies;
    }
    public static void main(String[] args) {

        candyDistribution obj = new candyDistribution();
        int[] ratings = {1, 0, 2};
        System.out.println(obj.candy(ratings)); // Output: 5
    }
}