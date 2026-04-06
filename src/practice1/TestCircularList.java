package practice1;

public class TestCircularList {

	public static void main(String[] args) {
		CustomCircularList<Integer> list = new CustomCircularList<>(3);

		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list); // [1, 2, 3]

		list.add(4); // overwrites 1
		System.out.println(list); // [2, 3, 4]

		list.add(5); // overwrites 2
		System.out.println(list); // [3, 4, 5]
	}

}
