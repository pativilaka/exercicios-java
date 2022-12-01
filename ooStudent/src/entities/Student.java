package entities;

public class Student {
	

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double totalPoints() {
		
		return nota1 + nota2 + nota3;
		
	}

	public String results() {
		
		if (totalPoints() > 60) {
			return "PASS";
		} else {
			return "FAILED";
		}
		
	}
	
	
	public double missingPoints() {
		return 60 - totalPoints();
	}
	
	public String toString() {
		
		return "FINAL GRADE = "
				+ String.format("%.2f%n", totalPoints())
				+ results();
		
	}
	
}
