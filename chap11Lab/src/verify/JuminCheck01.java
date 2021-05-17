package verify;

import java.io.InputStream;
import java.util.Scanner;

public class JuminCheck01 {
	public boolean juminCheck(String jumin) {
		//작성위치
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
		System.out.println("주민번호 앞자리를 입력 하세요?");
		String jumin1 = sc.next(); // 111111
		
		System.out.println("주민번호 뒷자리를 입력 하세요?");
		String jumin2 = sc.next(); // 1111011
		
		if (jumin1.length() != 6) {
			System.out.println("주민번호 앞자리는 6자리 입력");
		} else if (jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리는 7자리 입력");
		} else if (!jc.juminCheck(jumin1 + jumin2)) {
			System.out.println("잘못된 주민번호 입니다.");
		} else {
			System.out.println("올바른 주민번호 입니다");
		}

	}

}
