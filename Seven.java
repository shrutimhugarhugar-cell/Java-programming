package shruti;


class Parent{
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a=a;
	}
	
	
}

public class Seven extends Parent {
	public static void main(String[] args) {
		Seven bb = new Seven();
		bb.setA(7);
		int gg = bb.getA();
		 System.out.println(gg);
			}
}