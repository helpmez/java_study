package chap05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "이재원";
		String strVar2 = "이재원";
		
		if(strVar1==strVar2) {
			System.out.println("참조가같음");
		}else {
			System.out.println("참조가다름");
		}
	
		String strVar3 = new String ("이재원");
		String strVar4 = new String ("이재원");
		
		if(strVar3==strVar4) {
			System.out.println("참조가같음");
		}else {
			System.out.println("참조가다름");
		}
}
}