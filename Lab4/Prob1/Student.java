public class Student{
	private String name;
	private String id;
	private String department;
	private float cgpa;
	
	public Student(){
		this.name = "";
		this.id = "";
		this.department = "";
		this.cgpa = 0.00f;
	}
	
	public Student(String name, String id, String department, float cgpa){
		this.name = name;
		this.id = id;
		this.department = department;
		this.cgpa = cgpa;
	}
	
	public void set_name(String name){
		this.name = name;
	}
	
	public void set_id(String id){
		this.id = id;
	}
	
	public void set_department(String department){
		this.department = department;
	}
	
	public void set_cgpa(float cgpa){
		this.cgpa = cgpa;
	}
	
	public String get_name(){
		return this.name;
	}
	
	public String get_id(){
		return this.id;
	}
	
	public String get_department(){
		return this.department;
	}
	
	public float get_cgpa(){
		return this.cgpa;
	}
	
	public void show_info(){
		System.out.println("--Student Info--");
		System.out.println("Student name: " + this.name);
		System.out.println("Student id: " + this.id);
		System.out.println("Student department: " + this.department);
		System.out.println("Student cgpa: " + this.cgpa);
	}
}