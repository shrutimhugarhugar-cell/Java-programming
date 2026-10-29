package asdfg;

public class Hello3 {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int  a = 10/0;
			int[] ab= {10,20,30};
			System.out.println(ab[0]);
			System.out.println(ab[1]);
			System.out.println(ab[2]);
			System.out.println(ab[3]);
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic handele" + e);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index handele" +e);
			}catch(Exception e) {
			System.out.println("Exception handele");
		    }
		    System.out.println("End");
	}

}

