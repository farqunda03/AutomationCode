package learning_java_2nf_april;

public class ControlStatements {

	public static void main(String[] args) {
		
		if(1>2)
		{
			System.out.println("Grass is Green");
		}else if(true == false) {
			System.out.println("Logic in if is bogus");
		}else if(23<22) {
			System.out.println(" This logic in second else if might be true");
		}else {
			System.out.println("Nothing above is correct");
		}
	}

}
