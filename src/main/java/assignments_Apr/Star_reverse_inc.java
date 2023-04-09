package assignments_Apr;

public class Star_reverse_inc {

	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
