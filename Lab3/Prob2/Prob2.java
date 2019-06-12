public class Prob2{
	
	/*static void swap(int i, int j, int[] numArray){
		int temp = numArray[i];
		numArray[i] = numArray[j];
		numArray[j] = temp;
	}
	
	static void sort(int[] arr, int len){
		for(int i = 0; i < len-1; i++){
			for(int j = i + 1; j < len; j++){
				if(arr[i] < arr[j]){
					swap(arr[i], arr[j], arr);
				}
			}
		}
	}*/
	
	public static void main(String[] args){
		int[] numArray = {89, 86, 93, 91, 90};
		//sort(numArray, 5);
		for(int i = 0; i < 4; i++){
			for(int j = i + 1; j < 5; j++){
				if(numArray[i] < numArray[j]){
					int temp;
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		for(int i = 0; i < 5; i++){
			System.out.print(numArray[i] + " ");
		}
		System.out.println();
	}
}