package assignments_Apr;

import java.util.Scanner;

public class n_is_Prime {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		
		int n = input.nextInt();
		
		for(int i = 2; i <= n/2; ++i)
		{
			if(n%i == 0) {
				flag = true;
				break;
				
			}
	}
		if(!flag) {
			System.out.println(n+ " is Prime");
		} else {
			System.out.println(n +" is not Prime");
		}

	}
}
