import java.util.Scanner;

public class SplitTest2Example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름을 입력하세요: ");
		String str = scan.nextLine();
	
		System.out.print("생년월일(mm/dd/yy)을 입력하세요 : ");
		String day = scan.nextLine();
		String[] tokens = day.split("/");
		
		
		System.out.println("이름: " + str);
		System.out.println("생년월일: "+ tokens[2] + "년" + tokens[0]+ "월" + tokens[1] + "일");
	}

}
