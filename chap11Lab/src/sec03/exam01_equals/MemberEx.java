package sec03.exam01_equals;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� ����");
		}else {
			System.out.println("obj1�� obj2�� �������� ����");
		}

	}

}
