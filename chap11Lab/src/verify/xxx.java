package verify;

import java.util.HashMap;
import java.util.StringTokenizer;

public class xxx {

	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
		str += i;
		}
		System.out.println(str);
		
		// 작성 위치
		
		StringBuilder str2 = new StringBuilder();
		for(int i=1;i<=100;i++) {
			str2.append(i);
		}
		System.out.println(str2);
	}

}
