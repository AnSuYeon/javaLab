package sec08.exam01_split_string;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		
		for(int i=0;i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st =  new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}