package practice1;

public class CalculateArraySumLoop {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 1, 7 };
		
		int calSum = calSum(arr);
		System.out.println(calSum);
		

	}

	public static int calSum(int arr[]) {

		int sum = 0;
		for (int num : arr) {
//			sum = sum + num;
			sum += num;
		}
		return sum;
	}

}
