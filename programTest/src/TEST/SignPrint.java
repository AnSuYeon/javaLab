package TEST;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Է� : ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		String result = (num >0) ? "���" : ( (num==0) ? "0" : "����");

		System.out.println("num : " + result);
		
		int IF; IF=10;
		System.out.println(IF);
	}

}
