
public class CharAtexample {

	public static void main(String[] args) {
		// �ֹε�Ϲ�ȣ�� ���� �̿��Ͽ� ���� Ȯ��
		// ������ϼ��� 222(���� 7��°) 1 2 3 4
		String ssn = "9506241230123";
		char sex = ssn.charAt(6); // charAt ���ڿ����� ���ΰ����� ���ڸ� ����
		switch(sex) {
		case '1' :
		case '3' :
			System.out.println("�����Դϴ�.");
			break;
		case '2' :
		case '4' :
			System.out.println("�����Դϴ�.");
		}

	}

}