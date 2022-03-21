import java.util.*;

class sample {

  private static String getCorrect(String input, String process) {
	  //System.out.println("input:"+input);
	  //System.out.println("input:"+process);
    int ans = 0;
	String correct = "";
	int i=0,j=0;
	// iterate i to get correct string from p 
	while(correct.length()!=input.length() && i<process.length())
	{
		if(input.charAt(j)==process.charAt(i))
		{
			correct = correct+input.charAt(j);
			j++;
			i++;
		}
		else
		{
			i++;
		}
	}
	//System.out.print()
	if(input.equals(correct))
	{
		ans = (process.length()-1) - (input.length()-1);
		correct = String.valueOf(ans);
		return correct;
	}
	
    return "IMPOSSIBLE";
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();
	  in.nextLine();
      for (int t = 1; t <= T; ++t) {
		
		String i=in.nextLine();
		String p=in.nextLine();
		
        System.out.println(
            "Case #" + t + ": " + getCorrect(i,p));
      }
    }
  }
}