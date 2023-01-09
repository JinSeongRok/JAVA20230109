import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {			
			Scanner scan = new Scanner(System.in);
		
			String[][] arr = new String[6][6];

			System.out.print("행 인덱스 입력 : ");
			int rowNum = scan.nextInt();
			System.out.print("열 인덱스 입력 : ");
			int colNum = scan.nextInt();
			
			if (rowNum < 0 || rowNum > 4 || colNum < 0 || colNum > 4)
				System.out.println("잘못 입력하셨습니다.");
					
			arr[rowNum][colNum] = "X";
				
			System.out.println("  0 1 2 3 4");
			for (int row = 0; row < arr.length - 1; row++) {
				System.out.print(row + " ");
				for (int col = 0; col < arr[col].length - 1; col++) {
					if (arr[row][col] == arr[rowNum][colNum])
						arr[row][col] = "X";
					else
						arr[row][col] = " ";
					System.out.print(arr[row][col] + " ");
				}
				
				System.out.println();
			}

			scan.close();
		}
		
	}
	

