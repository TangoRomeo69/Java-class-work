public class Prob7{
	
	public static void main(String[] args){
		
		String name1 = "My name is Tanzeem Rahat";
		String[] name2 = name1.split(" ");
		String[] revName = new String[name2.length];
		int j = 0;
		for(int i = name2.length-1; i >= 0; i--){
			revName[j] = name2[i];
			j++;
		}
		String output = String.join(" ", revName);
		System.out.println(output);
	}
}