package assignments_Apr;

import java.util.Scanner;

public class Even_no_untiln {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		
		int n = input.nextInt(); 
		
		for(int i= 1; i <= n; i ++)
		{
			if(i % 2 ==0) {
				
			System.out.println(i);
			}
		}
	}

}
