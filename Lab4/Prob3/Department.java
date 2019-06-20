public class Department{
	private String name;
	private Course[] courses;
	private int courseCount;
	private Student[] students;
	private int studentCount;
	
	public Department(){
		this.name = "";
		this.courses = new Course[50];
		this.courseCount = 0;
		this.students = new Student[50];
		this.studentCount = 0;
	}
	
	public Department(String name, int courseNum, int studentNum, int courseCount, int studentCount){
		this.name = "";
		this.courses = new Course[courseNum];
		this.courseCount = courseCount;
		this.students = new Student[studentNum];
		this.studentCount = studentCount;
	}
	
	public String get_name(){
		return this.name;
	}
	
	public void add_course(Course c){
		courses[courseCount++] = c;
	}
	
	public void add_student(Student c){
		students[studentCount++] = c;
	}
	
	public void show_info(){
		System.out.println("--Department Info--");
		System.out.println("Name: " + this.name);
		System.out.println("Courses: ");
		for(int i = 0; i < courseCount; i++){
			System.out.println("ID " + courses[i].get_id());
			System.out.println("Name: " + courses[i].get_name());
			System.out.println();
		}
		System.out.println("Students: ");
		for(int i = 0; i < studentCount; i++){
			System.out.println("ID " + students[i].get_id());
			System.out.println("Name: " + students[i].get_name());
			System.out.println();
		}
	}
}