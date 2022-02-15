import java.util.*;

public class sample {

  private static int getRuler(int totalCandies, int m) {
    // TODO: implement this method to determine the ruler name, given the kingdom.
    int ans = 0;
	ans = totalCandies - (m * (totalCandies/m));
    return ans;
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();
      for (int t = 1; t <= T; ++t) {
		int n=in.nextInt();
		int m=in.nextInt();
		int []arr=new int[n];
		int totalCandies=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			totalCandies+=arr[i];
		}
        System.out.println(
            "Case #" + t + ": " + getRuler(totalCandies,m));
      }
    }
  }
}
