package asdfg;

public class Hello5 {
	
		public static void main(String[] args) {
		System.out.println("Start");

		    try {
		        int a = 10 / 0;
		    } catch (ArithmeticException e) {
		        System.out.println("Arithmetic handle " + e);
		    }

		    try {
		        int[] ab = {10, 20, 30};

		        System.out.println(ab[0]);
		        System.out.println(ab[1]);
		        System.out.println(ab[2]);
		        System.out.println(ab[3]);

		    } catch (ArrayIndexOutOfBoundsException e1) {
		        System.out.println("Array Index handle " + e1);
		    }
		    finally {
		    	System.out.println("asdfghjklqwertyuiop");
		    }

		    System.out.println("End");
		}

		}
