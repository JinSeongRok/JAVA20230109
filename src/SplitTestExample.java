import java.util.Scanner;

public class SplitTestExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름,학번과 학과를 입력하세요: ");
		String str = scan.nextLine();
		String[] tokens = str.split("/");
		
		System.out.println("이름: " + tokens[0]);
		System.out.println("학번: " + tokens[1]);
		System.out.println("학과: " + tokens[2]);
	}

}
