import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		int[] numbers = {9, 3, 7, 4, 3, 6}; // List of numbers to sort
		
		System.out.println(Arrays.toString(leastToGreatest(numbers)));
		System.out.println(Arrays.toString(greatestToLeast(numbers)));
	}
	
	public static int[] leastToGreatest(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] greatestToLeast(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
