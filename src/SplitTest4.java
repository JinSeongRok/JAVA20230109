import java.util.Scanner;

public class SplitTest4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("과일 이름을 입력하세요: ");
		String str = scan.nextLine();
		String[] tokens = str.split(" ");
		
		System.out.println(tokens[3] + tokens[2] + tokens[1] + tokens[0]);
		
	}

}
