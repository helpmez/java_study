package chap4;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=50 ; i++) {
			if(i%5 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
