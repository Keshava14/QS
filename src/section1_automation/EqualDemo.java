package section1_automation;

public class EqualDemo {
	int num;
	public EqualDemo(int num) {
		this.num = num;
	}
	public static void main(String[] args) {
		EqualDemo d1 = new EqualDemo(10);
		EqualDemo d2 = new EqualDemo(10);
		System.out.println(d1.equals(d2));
	}
	@Override
	public boolean equals(Object Obj) {
		int n1 = this.num;
		EqualDemo d2 = (EqualDemo)Obj;
		int n2=d2.num;
		return n1==n2;
	}
}
