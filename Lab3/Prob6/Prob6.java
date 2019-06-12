public class Prob6{
	
	public static void main(String[] args){
		String name1 = "tanzeem@gmail.com";
		boolean valid = false;
		for(int i = 0; i < name1.length(); i++){
			if(name1.charAt(i) == '@'){
				for(int k = i;k < name1.length(); k++){
					if(name1.charAt(k) == '.'){
						valid = true;
						break;
					}
				}
				break;
			}
		}
		if(valid == true){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
	}
}