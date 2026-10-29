package Mine;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a = 10/0;
		} catch(Exception e) {
			System.out.println("Exception handele");
		}
		System.out.println("End");
	}

}