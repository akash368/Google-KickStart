import java.util.*;

public class starter_code {

  public static int[] getHIndexScore(int[] citationsPerPaper) {
    int[] hIndex = new int[citationsPerPaper.length];
	int j=1,i=1,q=0,tempHindex=0;
	while(i<=citationsPerPaper.length)
	{
		for(int k=1;k<=j;k++)
		{
			System.out.println("paper: "+k);
			int c=0;
			for(int l=0;l<j;l++)
			{
				//System.out.println("citation: "+citationsPerPaper[l]);
				if(citationsPerPaper[l]>=k)
				{
					//System.out.println("citation is greater than paper");
					c++;
					//System.out.println("c:"+c);
					
				}
			}
			if(c>=k)
			{
				tempHindex=k;
			}
		}
		hIndex[q++]=tempHindex;
		//System.out.println("h index:"+hIndex[q]);
		i++;
		j++;
	}
    // TODO: Add logic to calculate h-index score for each paper

    return hIndex;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Get number of test cases in input
    int testCaseCount = scanner.nextInt();
    // Iterate through test cases
    for (int tc = 1; tc <= testCaseCount; ++tc) {
      // Get number of papers for this test case
      int paperCount = scanner.nextInt();
      // Get number of citations for each paper
      int[] citations = new int[paperCount];
      for (int p = 0; p < paperCount; ++p) {
        citations[p] = scanner.nextInt();
      }
      // Print h-index score after each paper in this test case
      System.out.print("Case #" + tc + ":");
      for (int score : getHIndexScore(citations)) {
        System.out.append(" ").print(score);
      }
      System.out.println();
    }
  }
}
