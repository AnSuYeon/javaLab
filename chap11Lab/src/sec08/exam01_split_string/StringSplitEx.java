package sec08.exam01_split_string;

public class StringSplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		
		for (String name : names)
			System.out.println(name);

	}

}
