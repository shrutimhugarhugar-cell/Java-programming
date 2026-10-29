package tfyguhijo;

public class Hello2 {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int  a = 10/0;
			int[] ab= {10,20,30};
			System.out.println(ab[0]);
			System.out.println(ab[1]);
			System.out.println(ab[2]);
			System.out.println(ab[3]);
			} catch(Exception e) {
			System.out.println("Exception handele");
		}
		System.out.println("End");
	}

}
