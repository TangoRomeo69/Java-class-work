public class Semester{
	private String name;
	private Course[] courses;
	private int courseCount;
	
	public Semester(){
		this.name = "";
		this.courses = new Course[5];
		this. courseCount = 0;
	}
	
	public Semester(String name, int courseCap, int courseCount){
		this.name = name;
		this.courses = new Course[courseCap];
		this. courseCount = courseCount;
	}
	
	public String get_name(){
		return this.name;
	}
	
	public int get_course_count(){
		return this.courseCount;
	}
	
	public void add_course(Course c){
		if(courseCount > 5){
			System.out.println("Course limit exceeded");
			return;
		}
		courses[courseCount++] = c;
	}
	
	public void show_courses(){
		for(int i = 0; i < courseCount; i++){
			System.out.println("ID " + courses[i].get_id());
			System.out.println("Name: " + courses[i].get_name());
			System.out.println();
		}
	}
}