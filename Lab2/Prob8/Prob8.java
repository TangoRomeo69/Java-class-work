public class Prob8
{
	private static String grade(float marks){
		if(marks < 0 || marks > 100){
			return "not applicable";
		}
		else if(marks >= 90 && marks <= 100){
			return "A+";
		}
		else if (marks >= 85 && marks <= 89) {
			return "A";
		}
		else if (marks >= 80 && marks <= 84) {
			return "B+";
		}
		else if (marks >= 75 && marks <= 79) {
			return "B";
		}
		else if (marks >= 50 && marks <= 74) {
			return "C+";
		}
		else{
			return "F";
		}
	}

	public static void main(String[] args)
	{
		float marksPhy = 88.00f, marksChem = 80.00f, marksBio = 56.00f, marksMat = 95.00f, marksCom = 84.00f;
		float totalMarks = marksPhy + marksChem + marksBio + marksMat + marksCom;
		System.out.println("Your grades are: ");
		System.out.println("Physics: " + grade(marksPhy));
		System.out.println("Chemistry: " + grade(marksChem));
		System.out.println("Biology: " + grade(marksBio));
		System.out.println("Math: " + grade(marksMat));
		System.out.println("Computer: " + grade(marksCom));
		System.out.println("Your total marks precentage is: " + (totalMarks/500f)*100f);
	}
}