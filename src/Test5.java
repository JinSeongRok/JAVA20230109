import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int colNum;
		int rowNum;
		char[][] arr;
		char ch = 'a';
		
		System.out.print("행의 크기 : ");
		rowNum = scan.nextInt();
		arr = new char[rowNum][];
		for(int row=0; row < arr.length; row++) { 
			System.out.print(row + "열의 크기 : ");
			colNum = scan.nextInt();
			arr[row] = new char [colNum];
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = ch++;
				
			}
		}
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {			
				System.out.print(arr[row][col] + " ");	
			}
			System.out.println();
		}
		
	}
}
