package access_modifier1;

import access_modifier.AccessModifier1;

public class AccessModifier11 extends AccessModifier1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier11 accessModifier11=new AccessModifier11();
		accessModifier11.listen();
	}

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		System.out.println("Listen");
	}

}
