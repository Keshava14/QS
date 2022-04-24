package section1_automation;

public class Random {
	public static void main(String[] args) {
	
	Random r = new Random();
	int num = r.nextInt(100000);
	String CustomerName = "chitti";
	CustomerName = CustomerName + num;
	}

	private int nextInt(int i) {
		System.out.println("hi");
		return 0;
	}
}
