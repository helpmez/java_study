package chap05;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] {83,90,87};
		
		int sum = 0 ;
		for(int i=0; i <scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합"+sum);
		double avg = (double)sum/scores.length;
		System.out.println("평균"+avg);
		int arr [] = new int [2];
		System.out.print(arr.length);
	}

}

