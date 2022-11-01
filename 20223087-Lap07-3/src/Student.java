public class Student {
	final int MAX_STUDENTS = 100;
	String name;
	int score;
	
	public Student(String n, int s) {
		name = n; score = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}
