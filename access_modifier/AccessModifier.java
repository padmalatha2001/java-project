package access_modifier;

public class AccessModifier {
	public final int i=10;
	private int j=20;
	protected static int k=30;
     int l=40;
	public void print()
	{
		System.out.println("print");
	}
	final void display()
	{
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AccessModifier accessModifier=new AccessModifier();
     System.out.println(accessModifier.i);
     System.out.println(accessModifier.j);
     System.out.println(accessModifier.k);
     System.out.println(accessModifier.l);
     accessModifier.display();
     accessModifier.print();
	}

}
