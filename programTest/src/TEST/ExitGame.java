package TEST;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for (int i=0;i<5;i++) {
			System.out.print("입력 : ");
			int n=sc.nextInt();
			sum+=n;
			System.out.println("합 : " + sum);
			if(sum>=100)
				break;
		}
		
		System.out.println("프로그램 종료!");

	}

}
