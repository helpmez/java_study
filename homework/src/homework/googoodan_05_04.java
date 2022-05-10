package homework;

public class googoodan_05_04 {

	public static void main(String[] args) {
		// 2~5단까지 출력후 줄바꿈후 6~9단까지 출력
		for(int i = 2 ; i<=9 ; i=i+4) {
			System.out.printf("%d 단\t\t", i);
			System.out.printf("%d 단\t\t", i+1);
			System.out.printf("%d 단\t\t", i+2);
			System.out.printf("%d 단\t\t", i+3);
			
			System.out.println();
			for(int j = 1 ; j<=9; j++) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);
				
				System.out.printf("%d * %d = %d\t",i+1,j,(i+1)*j);
				
				System.out.printf("%d * %d = %d\t",i+2,j,(i+2)*j);
				
				System.out.printf("%d * %d = %d\t",i+3,j,(i+3)*j);
				
				System.out.println();
				
				}
			System.out.println();
		 	}
		}
		
	}


