package TEST;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum +=i;
		}
		double avg=0;
		avg = (double)sum/100;
		
		System.out.println("1~100ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : "+ avg);
	}

}
