import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		String str = scan.nextLine();
		String newstr = str.replace("����", "��");
		
		System.out.println(newstr);
		

	}

}