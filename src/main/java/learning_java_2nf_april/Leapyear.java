package learning_java_2nf_april;

public class Leapyear {

	public static void main(String[] args) {
		int year1 = 1996;
		int year2 = 2000;
		int year3 = 2016;
		
		if ((year1 % 400 ==0) || (year1 % 4 == 0 && year1 % 100!= 0)){
			System.out.println("year1 is leap year" + year1);
		}else {
			System.out.println("year1 is not a leap year");
		}
		if((year2 % 400 ==0) || (year2 % 4 == 0 && year2 % 100!= 0)){
			
			System.out.println("year2 is leap year" + year2);
		}else {
			System.out.println("year2 is not a leap year");
		
		}
        if((year3 % 400 ==0) || (year3 % 4 == 0 && year3 % 100!= 0)){
			
			System.out.println("year3 is leap year" + year3);
		}else {
			System.out.println("year3 is not a leap year");
		
		}
	}

}
