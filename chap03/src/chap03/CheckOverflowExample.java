package chap03;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				int result = safeAdd(0,2147483647);
				System.out.println(result);
			}	catch(ArithmeticException a) { 
				System.out.println("오버플로우 발생");
			}
	}


	public static int safeAdd(int left, int right) {
			if((right>0)) {
				if(left>(Integer.MAX_VALUE - right)) {
					throw new ArithmeticException("오버플로우"); 
					}
			}else {
				if(left<(Integer.MIN_VALUE - right)) {
					throw new ArithmeticException("오버플로우");
				}
				}
			return left + right ;
			}
	}