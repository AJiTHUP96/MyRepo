
public class FibonacciSeries {

	public static void main(String[] args)
	{
	  int n=5;
	  int F=1, S=1, T;
	  System.out.println(F);
	  System.out.println(S);
	  for (int i = 3; i<= n; i++)
	  {
		  T=F+S;
		  System.out.println(T);
		  F=S;
		  S=T;
	  }
	  
      
	}

}
