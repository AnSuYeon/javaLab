package verify;
import java.util.*;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		/*if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "은 윤년");
		} else {
			System.out.println(year + "은 평년");
		}
		 */
		
		//GregorianCalendar 메소드 이용하기
		GregorianCalendar c1 = new GregorianCalendar();
		if (c1.isLeapYear(year))
			System.out.println(year + "년은 윤년");
		else
			System.out.println(year + "년은 평년");
		
	}

}
