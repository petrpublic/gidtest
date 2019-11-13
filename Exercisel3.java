package snippet;

public class Exercisel3 {

	public static void main(String[] args) {

	   
	    int theoryHours = 100;
	    int successfulExcercises = 84;
	    int examOtsenka = 8;
	    int exercisesNeeded = (int)(120.0/100.0*70.0);
//	    int exercisesNeeded = 120*70/100;
	    System.out.println("exercisesNeeded = " + exercisesNeeded);
	
	    boolean certified = false;
	    if(theoryHours >= 100 && successfulExcercises >= exercisesNeeded && examOtsenka >= 8){
	        certified = true;
	    }
	    System.out.println("Certified " + certified);
	}

	

}
