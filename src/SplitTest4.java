import java.util.Scanner;

public class SplitTest4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �̸��� �Է��ϼ���: ");
		String str = scan.nextLine();
		String[] tokens = str.split(" ");
		
		System.out.println(tokens[3] + tokens[2] + tokens[1] + tokens[0]);
		
	}

}