public class Prob8
{
	public static void main(String[] args)
	{
		int x = 20, y = 30;
		if(x<y){
			System.out.println(x + "!=" + y);
			System.out.println(x + "<" + y);
		}
		else if(x==y){
			System.out.println(x + "=" + y);
		}
		else{
			System.out.println(x + "!=" + y);
			System.out.println(x + ">" + y);
		}
	}
}