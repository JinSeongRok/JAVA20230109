import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("한 줄의 문장을 입력하세요 : ");
		String str = scan.nextLine();
		String newstr = str.replace("가을", "봄");
		
		System.out.println(newstr);
		

	}

}
