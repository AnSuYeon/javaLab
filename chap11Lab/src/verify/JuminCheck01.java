package verify;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {
	public boolean juminCheck(String jumin) {
		//�ۼ���ġ
		int[] check = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int sum=0;
		
		for(int i=0;i<jumin.length()-1;i++) {
			sum += check[i] * Integer.parseInt(jumin.substring(i,i+1));		
		}
		
		int result = 11-sum%11;
		
		if(result>=10){
			result %=10;
			if(result==Integer.parseInt(jumin.substring(12,13)))
				return true;
			else
				return false;
		}else if(result==Integer.parseInt(jumin.substring(12,13))){
			return true;
		}else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JuminCheck01 jc = new JuminCheck01();
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin1 = sc.next(); // 111111
		
		System.out.println("�ֹι�ȣ ���ڸ��� �Է� �ϼ���?");
		String jumin2 = sc.next(); // 1111011
		
		if (jumin1.length() != 6) {
			System.out.println("�ֹι�ȣ ���ڸ��� 6�ڸ� �Է�");
		} else if (jumin2.length() != 7) {
			System.out.println("�ֹι�ȣ ���ڸ��� 7�ڸ� �Է�");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
		}

	}

}
