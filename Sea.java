package shruti;


	class Parent {
		int a = 10;
		int b = 20;
	}

	public class Sea  extends Parent {
		int a = 5;
		int b = 6;

		void add(int a, int b) {
			System.out.println(a + b);
		//	System.out.println(c + d);
			System.out.println(this.a + this.b);
			System.out.println(super.a+super.b);
			
		}

		public static void main(String[] args) {
			Sea ff = new Sea();
			ff.add(2, 3);
			

		}
	}