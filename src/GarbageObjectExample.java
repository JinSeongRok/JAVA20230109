
public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "����";
		hobby = null;		// ���ప�� �����ϴ� �ּҰ� ������� ��
		
		String kind1 = "�ڵ���";
		String kind2 = kind1;
		kind1 = null;	// "�ڵ���" ���� ���� ���� �ּ� ����
		System.out.println("kind2: " + kind2);

	}

}
