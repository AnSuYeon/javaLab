package verify;
import java.util.*;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		/*if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "�� ����");
		} else {
			System.out.println(year + "�� ���");
		}
		 */
		
		//GregorianCalendar �޼ҵ� �̿��ϱ�
		GregorianCalendar c1 = new GregorianCalendar();
		if (c1.isLeapYear(year))
			System.out.println(year + "���� ����");
		else
			System.out.println(year + "���� ���");
		
	}

}
