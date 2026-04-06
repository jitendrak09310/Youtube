package practice1;

import java.util.*;

public class SortingWithClassVariableUsingStream {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student(1, "Amit", 15, "Male"));
		students.add(new Student(2, "Jitendra", 92, "Female"));
		students.add(new Student(3, "Monu", 76, "Male"));
		students.add(new Student(4, "Priya", 88, "Female"));
		students.add(new Student(5, "Karan", 85, "Male"));
		students.add(new Student(6, "Ram", 45, "Female"));
		students.add(new Student(7, "Vikas", 45, "Male"));
		students.add(new Student(8, "Ed", 81, "Female"));
		students.add(new Student(9, "Arjun", 90, "Male"));
		students.add(new Student(10, "Shahrukh", 78, "Female"));
		List<Student> sorted = sorting(students);

		for (Student s : sorted) {
			System.out.println("Student Name : " + s.getName() + "  " + s.getMarks());
		}

	}

	public static List<Student> sorting(List<Student> students) {

		List<Student> list = students.stream()
				.sorted(Comparator.comparing(Student::getMarks).thenComparing(s -> s.getName().length())).toList();

		return list;
	}

}
