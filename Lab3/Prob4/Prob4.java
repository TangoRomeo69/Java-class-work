public class Prob4{
	
	public static void main(String[] args){
		String name1 = "Tanzeem";
		String name2 = "tanZeem";
		if(name1.compareToIgnoreCase(name2) == 0){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
	}
}