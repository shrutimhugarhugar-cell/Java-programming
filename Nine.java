package shruti;
//
interface Guess
 {
	void m1();
}

class Nine implements Guess {

	public void m1() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		Nine bb = new Nine();
		bb.m1();
	}

}