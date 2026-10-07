package shruti;

public class Intra {
	int a ;
	int b ;

   void	add(int a , int b)
	{
	      this.a=a;
	      this.b=b;
	}
   void	add1()
   {
	   System.out.println("this is very good"+(a+b));
   }
	 public static void main(String[] args) {
			Intra ff = new Intra();
		   ff.add(2, 3);
		   ff.add1();
		}
	}

