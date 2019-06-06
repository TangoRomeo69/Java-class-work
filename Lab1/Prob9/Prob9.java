public class Prob9
{
	public static void main(String[] args)
	{
		String str1 = "ABCDEFG";
		String str2 = "";
		int j = 0;
		for(int i = str1.length()-1;i>=0;i--){
			str2 += str1.charAt(i);
		}
		System.out.println("Base string is: " + str1);
		System.out.println("Reversed string is: " + str2);
	}
}