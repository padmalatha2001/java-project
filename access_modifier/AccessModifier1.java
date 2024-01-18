package access_modifier;

public abstract class AccessModifier1{
	public abstract void listen();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AccessModifier accessModifier=new AccessModifier();
	     System.out.println(accessModifier.i);
	    // System.out.println(accessModifier.j);
	     System.out.println(accessModifier.k);
	     System.out.println(accessModifier.l);
	     accessModifier.display();
	     accessModifier.print();
	}

}
