package shruti;
class Six{
	private String name;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
}

public class Eight extends Six{
	public static void main(String[] args) {
		Eight bb = new Eight();
		bb.setName("shruti");
		String gg = bb.getName();
		 System.out.println(gg);
			}
}