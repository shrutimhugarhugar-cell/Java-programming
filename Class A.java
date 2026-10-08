package shruti;
//inheritence
//method overreading
public class Demo {
	int a =10;
	int b =20;

   void	add(int c , int d)
	{
		System.out.println("Hello" +(c+d));
		System.out.println("Hello" +(a+b));
	}
	 public static void main(String[] args) {
			Demo ff = new Demo();
		   ff.add(2, 3);
		}
	}