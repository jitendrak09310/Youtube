package practice2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompareByClassVariables {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Jitendra", 10L, "Four"), new Student("Rahul", 70L, "Five"),
				new Student("Amit", 55L, "Six"), new Student("Neha", 80L, "Seven"), new Student("Priya", 65L, "Eight"),
				new Student("Rohit", 10L, "Nine"), new Student("Sneha", 90L, "Ten"), new Student("Karan", 30L, "Four"),
				new Student("Anjali", 75L, "Five"), new Student("Vikas", 50L, "Six"));

		List<Student> collect = students.stream()
				.sorted(Comparator.comparing(Student::getMarks).thenComparing(s -> s.getName().length()))
				.collect(Collectors.toList());

		for (Student student : collect) {
			System.out.println(student.getName() + " " + student.getMarks());
		}
	}

}
