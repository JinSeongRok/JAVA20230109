import java.util.Scanner;

public class SplitTestExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸�,�й��� �а��� �Է��ϼ���: ");
		String str = scan.nextLine();
		String[] tokens = str.split("/");
		
		System.out.println("�̸�: " + tokens[0]);
		System.out.println("�й�: " + tokens[1]);
		System.out.println("�а�: " + tokens[2]);
	}

}
