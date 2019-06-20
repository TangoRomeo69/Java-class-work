public class Student{
	private String name;
	private String id;
	private Semester semester;
	private Department department;
	
	public Student(){
		this.name = "";
		this.id = "";
	}
	
	public Student(String name, String id, Semester sem, Department dept){
		this.name = name;
		this.id = id;
		this.semester = sem;
		this.department = dept;
	}
	
	public String get_name(){
		return this.name;
	}
	
	public String get_id(){
		return this.id;
	}

	public void add_course(Course c){
		this.semester.add_course(c);
	}
	
	public void show_info(){
		System.out.println("--Student Info--");
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Semester: " + this.semester.get_name());
		System.out.println("Department: " + this.department.get_name());
		System.out.println("Courses: ");
		this.semester.show_courses();
	}
}