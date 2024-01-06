package aula69Exercicio3_entities;

public class Student {

	public String name;
	public Double q1Grade, q2Grade, q3Grade;
	
	public Double finalGrade() {
		return q1Grade + q2Grade + q3Grade;
	}
	
	public Double missingGrade() {
		return 60 - finalGrade();
	}
	
	public String approval () {
		if (finalGrade() >= 60) {
			return "PASS";}
			
			else {
				return "FAILED\n" +
						"MISSING " +
						missingGrade()+
						" POINTS";					
			}
			
		}
		
}