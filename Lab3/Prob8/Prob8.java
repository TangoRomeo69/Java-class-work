public class Prob8{
	
	public static void main(String[] args){
		String number = "01717723456";
		switch(number.charAt(2)){
			case '7':{
				System.out.println("Grameen");
				break;
			}
			case '6':{
				System.out.println("Airtel");
				break;
			}
			case '8':{
				System.out.println("Robi");
				break;
			}
			case '9':{
				System.out.println("Banglalink");
				break;
			}
			default:
				System.out.println("Could not identify");
		}
	}
}