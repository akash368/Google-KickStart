import java.util.*;

public class centurianPrime {

  private static String getRuler(String kingdom) {
	  String ruler = "";
	  int ch= Character.toLowerCase(kingdom.charAt(kingdom.length()-1));
	  if(ch==121)
	  {
		  ruler="nobody";
	  }
	  else if(ch==97 || ch==101 || ch==105 || ch==111 || ch==117)
	  {
		  ruler="Alice";
	  }
	  else
	  {
		  ruler="Bob";
	  }
    // TODO: implement this method to determine the ruler name, given the kingdom.
    
    return ruler;
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();

      for (int t = 1; t <= T; ++t) {
        String kingdom = in.next();
        System.out.println(
            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
      }
    }
  }
}
