package entities;

public class Student {

	public String name;

	public double score1;
	public double score2;
	public double score3;

	public void testApprove() {

		double sum = score1 + score2 + score3;

		if (sum < 60.0) {
			System.out.printf("FINAL GRADE: %.2f", sum);
			System.out.printf("\nFAILED\nMISSING %.2f POINTS", 60 - sum);

			
		} else {
			System.out.printf("FINAL GRADE: %.2f", sum);
			System.out.println("\nPASS");

		}

	}

}
