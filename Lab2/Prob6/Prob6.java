public class Prob6
{
	private static int factorial(int n){
		if(n == 0){
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args)
	{
		int x = 5;
		int fact = factorial(x);
		System.out.println("Factorial of " + x +" is: " + fact);
	}
}