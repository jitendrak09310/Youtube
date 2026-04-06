package practice1;

public class Student {

	private int id;
	private String name;
	private int marks;
	private String gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", gender=" + gender + "]";
	}

	public Student(int id, String name, int marks, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}

}