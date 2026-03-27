package practice1;

import java.util.HashSet;

public class FindDuplicatesUsingHashSet {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 4, 6, 6, 7, 7 };
		HashSet<Integer> duplicates = findDuplicates(arr);
		System.out.println(duplicates);
	}

	public static HashSet<Integer> findDuplicates(int arr[]) {

		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();

		for (int num : arr) {
			if (!set.add(num)) {
				duplicate.add(num);
			}
		}

		return duplicate;
	}
}
