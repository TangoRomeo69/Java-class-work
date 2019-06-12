public class Prob1{
	
	public static void main(String[] args){
		int[] numbers = new int[10];
		int k = 0;
		for(int i = 0; i < 20; i++){
			if(i % 2 == 0){
				numbers[k] = i;
				k++;
			} 
		}
		int sum = 0;
		for(int i = 0; i < 10; i++){
			sum += numbers[i];
		}
		System.out.println(sum);
	}
}