import java.util.Scanner;

public class SplitTest2Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�̸��� �Է��ϼ���: ");
		String str = scan.nextLine();
	
		System.out.print("�������(mm/dd/yy)�� �Է��ϼ��� : ");
		String day = scan.nextLine();
		String[] tokens = day.split("/");
		
		
		System.out.println("�̸�: " + str);
		System.out.println("�������: "+ tokens[2] + "��" + tokens[0]+ "��" + tokens[1] + "��");
	}

}