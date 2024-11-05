package abstracta;

public class Abstract1 extends Abstract{

	public static void main(String[] args) {
	Abstract1 ab=new Abstract1();
	ab.disp();
	ab.dis();
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Instance method");
	}
	public static void dis()
	{
		System.out.println("Static method");
	}
	public Abstract1()
	{
		System.out.println("I am a Constructor");
	}
}
