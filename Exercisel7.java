package snippet;

public class Exercisel7 {

	public static void main(String[] args) {
		
		final int YEAR_DAYS = 365;
	    final int MONTH_DAYS = 30;
	    final int WEEK_DAYS = 7;
	    
	    int periodDays = 1234;
	    int toYears;
	    int toMonth;
	    int toWeeks;
	    
	    toYears = periodDays / YEAR_DAYS;
	    toMonth = periodDays / MONTH_DAYS;
	    toWeeks = periodDays / WEEK_DAYS;
	    
	    System.out.print(periodDays+" days = " + toYears + " years, " + toMonth + " Month, " + toWeeks + " Weeks");
	   
	}

}
