public class Main{
	public static void main(String[] args){
		Course c1 = new Course("Programming", "CS1");
		Course c2 = new Course("CS Math", "CS2");
		Course c3 = new Course("Java", "CS3");
		Semester sem1 = new Semester("Summer", 20, 0);
		Semester sem2 = new Semester("Spring", 20, 0);
		Department dept1 = new Department("CS", 50, 50, 0, 0);
		Student s1 = new Student("Rahim", "1", sem1, dept1);
		Student s2 = new Student("Karim", "2", sem2, dept1);
		
		dept1.add_course(c1);
		dept1.add_course(c2);
		dept1.add_course(c3);
		
		s1.add_course(c1);
		s1.add_course(c2);
		
		s2.add_course(c2);
		s2.add_course(c3);
		
		dept1.show_info();
		
		s1.show_info();
		s2.show_info();
	}
}