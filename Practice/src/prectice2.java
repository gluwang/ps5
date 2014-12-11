
public class prectice2 {
	public static char grade(double score){
		char grade;
		if(score >= 90.0){
			grade = 'A';
		}
		else if(score >= 80.0){
			grade = 'B';
		}
		else if(score >= 70.0){
			grade = 'C';
		}
		else if(score >= 60.0){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		return(grade);
	}
	public static void main(String[] arg){
		System.out.println(grade(75));
	}
}
