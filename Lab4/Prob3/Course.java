public class Course{
	private String name;
	private String id;
	
	public Course(){
		this.name = "";
		this.id = "";
	}
	
	public Course(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	public String get_name(){
		return this.name;
	}
	
	public String get_id(){
		return this.id;
	}
}