package practice2;

public class Student {
	private String name;
	private Long marks;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student(String name, Long marks, String grade) {
		super();
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

}
