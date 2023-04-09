package learning_java_2nf_april;

public class Assignment_inc_dec {

	public static void main(String[] args) {
		
		int i = 1;// i=1
		
		--i;    //i=0
		
		int j = --i - i-- - ++i;
		
		//  j = -1  - (-1) - (-1)= 1
		//  i = -1     -1     -1 = -1
		
		System.out.println(i);
		System.out.println(j);
		
		int k = j-- - --i + ++j - ++j +i--;
		
		// k = 1    -(-2) + 1   - 2  + (-2)= 0
		// j = 1       0    1     2        = 2
		// i =-1     -2                -2  = -2
		
		int l  = i-- - ++j - --j + k--;
		
		 // l  = -2  -  3   -  2  + 0  = -7
		 // i  = -2
		 // j  =      3       2        = 2
		 // k  =                    0  = 0

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}

}
