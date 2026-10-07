package shruti;

public class Inter {
	int a =10;
	int b =20;

   void	add(int a , int b)
	{
		System.out.println("Hello" +(this.a+this.b));
		System.out.println("Hello" +(a+b));
	}
	 public static void main(String[] args) {
			Inter ff = new Inter();
		   ff.add(2, 3);
		}
	}

