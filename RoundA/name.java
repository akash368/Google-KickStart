import java.util.*;

 class name{

  private static int getName(int name) {
	  int right = name;
	  name = name*10;
	  System.out.println("name:"+name);
	for(int i=1;i<=9;i++)
	{
		name = name+1;
		int newname = name;
		System.out.println("name:"+name);
		int sum =0;
		while(newname>0)
		{
			int r = newname%10;
			sum = sum+r;
			newname = newname/10;
			
		}
		System.out.println(sum);
		if(sum%9==0)
		{
			return sum;
		}
	}
	for(int i=1;i<=9;i++)
	{
		
	}
    // TODO: implement this method to determine the ruler name, given the kingdom.
    
    return -1;
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();

      for (int t = 1; t <= T; ++t) {
        int N = in.nextInt();
        System.out.println(
            "Case #" + t + ": "+ getName(N));
      }
    }
  }
}